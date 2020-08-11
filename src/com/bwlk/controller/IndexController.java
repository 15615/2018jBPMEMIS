
package com.bwlk.controller;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

import org.jbpm.api.ExecutionService;
import org.jbpm.api.ProcessDefinition;
import org.jbpm.api.ProcessEngine;
import org.jbpm.api.ProcessInstance;
import org.jbpm.api.RepositoryService;
import org.jbpm.api.model.ActivityCoordinates;
import org.jbpm.api.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bwlk.mapper.FormsMapper;
import com.bwlk.utils.JbpmUtils;

@Controller
public class IndexController {

	@Autowired
	private JbpmUtils jbpmUtils;

	@Autowired
	private FormsMapper FormsMapper;

	@RequestMapping("/tologin")
	public String toLogin() {
		return "login";
	}

	@RequestMapping("/index99")
	public String testweb(Model model) {

		List<Task> tasks = jbpmUtils.getProcessEngine().getTaskService().findPersonalTasks("张三"); // 显示任务
		System.out.println("========= 【张三】的未办理的任务列表 =========");
		String tt = "";
		for (Task task : tasks) {

			System.out.println("id=" + task.getId()//
					+ ", name=" + task.getName()//
					+ ", assignee=" + task.getAssignee()//
					+ ", createTime=" + task.getCreateTime() + ", ExecutionId=" + task.getExecutionId());
			tt = "id=" + task.getId()//
					+ ", name=" + task.getName()//
					+ ", assignee=" + task.getAssignee()//
					+ ", createTime=" + task.getCreateTime() + ", ExecutionId=" + task.getExecutionId();
		}
		model.addAttribute("msg", "孩子啊" + tt);
		System.out.println("1111");
		return "index";
	}

	@RequestMapping("/pic")
	public String getPic(String id, Model model, HttpServletResponse response) throws Exception {
		ProcessEngine processEngine = jbpmUtils.getProcessEngine();
		RepositoryService repositoryService = processEngine.getRepositoryService();

		ExecutionService executionService = processEngine.getExecutionService();

		ProcessInstance processInstance = executionService.findProcessInstanceById(id); // 根据ID获取流程实例
		Set<String> activityNames = processInstance.findActiveActivityNames(); // 获取实例执行到的当前节点的名称

		String processDefinitionId = processInstance.getProcessDefinitionId();

		System.out.println("processDefinitionId" + processDefinitionId); // test-5
		ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery()
				.processDefinitionId(processDefinitionId).uniqueResult();

		InputStream in = repositoryService.getResourceAsStream(processDefinition.getDeploymentId(), "hello/test.png");

		/*
		 * ActivityCoordinates ac = repositoryService.getActivityCoordinates(
		 * processInstance.getProcessDefinitionId(), activityNames .iterator().next());
		 */

		Image i = ImageIO.read(in);
		BufferedImage img = new BufferedImage(i.getWidth(null), i.getHeight(null), BufferedImage.TYPE_INT_RGB);
		Graphics2D g = img.createGraphics();
		g.drawImage(i, null, null);
		g.setColor(Color.RED);

		Iterator<String> iter = activityNames.iterator();
		while (iter.hasNext()) {
			String name = iter.next();
			ActivityCoordinates ac = repositoryService.getActivityCoordinates(processDefinitionId, name);
			if (ac != null) {
				g.drawRect(ac.getX(), ac.getY(), ac.getWidth(), ac.getHeight());
			}
		}
		// 禁止图像缓存。
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		response.setContentType("image/png");
		ImageIO.write(img, "png", response.getOutputStream());

		return null;
	}

}
