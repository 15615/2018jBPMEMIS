package com.bwlk.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jbpm.api.ProcessEngine;
import org.jbpm.api.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bwlk.mapper.TRepairsMapper;
import com.bwlk.mapper.TStudentMapper;
import com.bwlk.mapper.t_dormbuildMapper;
import com.bwlk.pojo.Student;
import com.bwlk.pojo.TRepairs;
import com.bwlk.pojo.TRepairsExample;
import com.bwlk.pojo.TStudent;
import com.bwlk.pojo.TStudentExample;
import com.bwlk.pojo.t_dormbuild;
import com.bwlk.utils.JbpmUtils;

/**
 * 学生提交维修管理
 * 
 * @author lenovo
 *
 */
@Controller
public class StudentController {

	@Autowired
	private TStudentMapper tStudentMapper;

	@Autowired
	private TRepairsMapper tRepairsMapper;

	@Autowired
	private t_dormbuildMapper t_dormbuildMapper;

	@Autowired
	private JbpmUtils jbpmUtils;

	// 跳转添加维修入口
	@RequestMapping("/addsturepairui")
	public String addsturepairui(Model model, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Student student = (Student) request.getSession().getAttribute("currentUser");
		t_dormbuild t_dormbuild = t_dormbuildMapper.selectByPrimaryKey(student.getDormBuildId());
		request.getSession().setAttribute("t_dormbuild", t_dormbuild);
		request.setAttribute("student", student);
		request.setAttribute("mainPage", "/student/addrepair.jsp");
		request.getRequestDispatcher("/mainStudent.jsp").forward(request, response);
		return null;
	}

	// 添加维修
	@RequestMapping("/addsturepair")
	public String addsturepair(TRepairs tRepairs, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Student student = (Student) request.getSession().getAttribute("currentUser");
		// jbpm begin

		ProcessEngine processEngine = jbpmUtils.getProcessEngine();
		Map<String, String> variables = new HashMap<String, String>();
		variables.put("application", student.getUserName());
		ProcessInstance processInstance = processEngine.getExecutionService().startProcessInstanceByKey("test",
				variables);
		String pDId = processInstance.getProcessDefinitionId(); // pDId:----test-1
		String pIid = processInstance.getId(); // pIid:----test.60001
		System.out.println("pDId:----" + pDId);
		System.out.println("pIid:----" + pIid);
		processEngine.getExecutionService().signalExecutionById(pIid, "批准"); // jbpm
		// end
		tRepairs.setPiid(pIid);
		tRepairs.setUsername(student.getUserName());
		tRepairsMapper.insertSelective(tRepairs);
		request.setAttribute("mainPage", "/student/addrepair.jsp");
		request.setAttribute("msg", "报修成功");
		request.getRequestDispatcher("/mainStudent.jsp").forward(request, response);
		return null;
	}

	// 查询个人所有的维修信息
	@RequestMapping("/sturepairquery")
	public String sturepairquery(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Student user = (Student) request.getSession().getAttribute("currentUser");
		if (user == null) {
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		TRepairsExample example = new TRepairsExample();
		Integer dormInteger = Integer.parseInt((user.getDormName()));
		String dormbuildname = user.getDormBuildName();
		example.createCriteria().andDormbuildnameEqualTo(dormbuildname).andDormnameEqualTo(dormInteger);
		List<TRepairs> repairs = tRepairsMapper.selectByExample(example);
		request.setAttribute("repairs", repairs);
		request.setAttribute("mainPage", "/student/repairquery.jsp");
		request.getRequestDispatcher("/mainStudent.jsp").forward(request, response);
		return null;
	}

	// 删除维修信息
	@RequestMapping("/delsturepair")
	public String delsturepair(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Integer repairid = Integer.parseInt(request.getParameter("repairid"));
		tRepairsMapper.deleteByPrimaryKey(repairid);
		request.setAttribute("error", "删除成功");
		Student user = (Student) request.getSession().getAttribute("currentUser");
		if (user == null) {
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		TRepairsExample example = new TRepairsExample();
		Integer dormInteger = Integer.parseInt((user.getDormName()));
		String dormbuildname = user.getDormBuildId() + "栋";
		example.createCriteria().andDormbuildnameEqualTo(dormbuildname).andDormnameEqualTo(dormInteger);
		List<TRepairs> repairs = tRepairsMapper.selectByExample(example);
		request.setAttribute("repairs", repairs);
		request.setAttribute("mainPage", "/student/repairquery.jsp");
		request.getRequestDispatcher("/mainStudent.jsp").forward(request, response);
		return null;
	}

	// 跳转学生注册
	@RequestMapping("/sturegister")
	public String sturegister(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<t_dormbuild> dormBuildList = t_dormbuildMapper.selectByExample(null);
		request.setAttribute("dormBuilds", dormBuildList);
		request.getRequestDispatcher("/register.jsp").forward(request, response);
		return null;

	}

	// 学生注册
	@RequestMapping("/savestudent")
	public String savestudent(TStudent student, String dormbuildname, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		TStudentExample example = new TStudentExample();
		example.createCriteria().andStunumEqualTo(student.getStunum());
		List<TStudent> list = tStudentMapper.selectByExample(example);
		if (list.size() > 0) {
			request.setAttribute("msg", "学号已注册");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return null;
		}
		String dormbuildid = dormbuildname.replace("栋", "");
		Integer dormid = Integer.parseInt(dormbuildid);
		student.setDormbuildid(dormid);
		tStudentMapper.insertSelective(student);
		request.setAttribute("msg", "注册成功");
		request.getRequestDispatcher("/login.jsp").forward(request, response);
		return null;

	}

	// 学生前往评价维修
	@RequestMapping("/topingjiarepair")
	public String topingjiarepair(Model model, Integer repairid) {
		TRepairs repair = tRepairsMapper.selectByPrimaryKey(repairid);
		model.addAttribute("repair", repair);
		model.addAttribute("mainPage", "/student/repairupdate.jsp");
		return "mainStudent";
	}

	// 学生评价
	@RequestMapping("stuupdaterepair")
	public String stuupdaterepair(Model model, TRepairs tRepairs, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		tRepairs.setFlag(3);
		tRepairsMapper.updateByPrimaryKeySelective(tRepairs);
		model.addAttribute("msg", "评价成功");
		Student user = (Student) request.getSession().getAttribute("currentUser");
		if (user == null) {
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		TRepairsExample example = new TRepairsExample();
		Integer dormInteger = Integer.parseInt((user.getDormName()));
		String dormbuildname = user.getDormBuildId() + "栋";
		example.createCriteria().andDormbuildnameEqualTo(dormbuildname).andDormnameEqualTo(dormInteger);
		List<TRepairs> repairs = tRepairsMapper.selectByExample(example);
		request.setAttribute("repairs", repairs);
		request.setAttribute("mainPage", "/student/repairquery.jsp");
		request.getRequestDispatcher("/mainStudent.jsp").forward(request, response);
		return null;

	}
}
