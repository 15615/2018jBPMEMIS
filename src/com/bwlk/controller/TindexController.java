package com.bwlk.controller;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

import org.jbpm.api.ExecutionService;
import org.jbpm.api.ProcessDefinition;
import org.jbpm.api.ProcessEngine;
import org.jbpm.api.ProcessInstance;
import org.jbpm.api.RepositoryService;
import org.jbpm.api.model.ActivityCoordinates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bwlk.mapper.FormsMapper;
import com.bwlk.pojo.Forms;
import com.bwlk.utils.JbpmUtils;

@Controller
public class TindexController {

	@Autowired
	private FormsMapper FormsMapper;

	@Autowired
	private JbpmUtils jbpmUtils;

	/**
	 * //0表示申请 //1表示负责人审批通过 //2表示负责人审批驳回 //3表示经理审批通过 //4表示经理审批驳回 //5表示订单异常
	 * 
	 * PDID:test-5----------PIIDtest.410001
	 * 
	 * @param forms
	 * @return
	 */
	@RequestMapping("/formsubmit")
	public String formsubmit(Forms forms, Model model) {
		ProcessEngine processEngine = jbpmUtils.getProcessEngine();
		Map<String, String> variables = new HashMap<String, String>();
		variables.put("application", forms.getName());
		ProcessInstance processInstance = processEngine.getExecutionService().startProcessInstanceByKey("test",
				variables);
		String pDId = processInstance.getProcessDefinitionId();
		String pIid = processInstance.getId();
		processEngine.getExecutionService().signalExecutionById(pDId, "to 经理审批");
		System.out.println("PDID:" + pDId + "----------PIID" + pIid);
		forms.setStates(0);
		forms.setProcessinstanceid(pIid);
		forms.setProcessdid(pDId);
		FormsMapper.insertSelective(forms);

		model.addAttribute("msg", "ok");
		return "msg";
	}

	@RequestMapping("/getindexpic")
	public String getindexpic(String id, Model model, HttpServletResponse response) throws Exception {
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
