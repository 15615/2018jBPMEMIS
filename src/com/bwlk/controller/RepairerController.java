package com.bwlk.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
/**
 * 维修人员控制层(包含查询订单数据)
 * @author xiaofeng
 *
 */
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bwlk.mapper.TDormmanagerMapper;
import com.bwlk.mapper.TRepairsMapper;
import com.bwlk.pojo.DormManager;
import com.bwlk.pojo.TRepairs;
import com.bwlk.pojo.TRepairsExample;
import com.bwlk.utils.JbpmUtils;

@Controller
public class RepairerController {

	@Autowired
	private TDormmanagerMapper tDormmanagerMapper;

	@Autowired
	private TRepairsMapper tRepairsMapper;

	@Autowired
	private JbpmUtils jbpmUtils;

	// 查询维修订单
	@RequestMapping("/repairerorders")
	public String repairerorders(Model model, Integer flag, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		DormManager tDormmanager = (DormManager) request.getSession().getAttribute("currentUser");
		if (tDormmanager == null) {
			model.addAttribute("msg", "登录已过期");
			return "/login";
		}
		TRepairsExample example = new TRepairsExample();
		if (flag == 1) {
			example.createCriteria().andRepairerEqualTo(tDormmanager.getName()).andFlagEqualTo(flag);
		} else {
			example.createCriteria().andRepairerEqualTo(tDormmanager.getName()).andFlagNotEqualTo(1);
		}
		List<TRepairs> list = tRepairsMapper.selectByExample(example);
		/*
		 * if (flag == 1 &&list.size() >0) { request.setAttribute("status", 1); }else {
		 * request.setAttribute("status", null); }
		 */
		request.setAttribute("repairs", list);
		request.setAttribute("mainPage", "dormManager/repairquery.jsp");
		request.getRequestDispatcher("/mainManager.jsp").forward(request, response);
		return null;

	}

	// 维修订单完毕
	@RequestMapping("/repairersuccess")
	public String repairersuccess(Model model, HttpServletRequest request, HttpServletResponse response,
			Integer repairid, String piid) throws Exception {

		jbpmUtils.getProcessEngine().getExecutionService().signalExecutionById(piid, "to end1");

		DormManager tDormmanager = (DormManager) request.getSession().getAttribute("currentUser");
		if (tDormmanager == null) {
			model.addAttribute("msg", "登录已过期");
			return "/login";
		}
		TRepairs repairs = tRepairsMapper.selectByPrimaryKey(repairid);
		repairs.setFlag(2);

		tRepairsMapper.updateByPrimaryKeySelective(repairs);
		TRepairsExample example = new TRepairsExample();
		example.createCriteria().andRepairerEqualTo(tDormmanager.getName()).andFlagEqualTo(1);// 只查询状态为1的订单
		List<TRepairs> list = tRepairsMapper.selectByExample(example);
		/*
		 * if (list.size() >0) { request.setAttribute("status", 1); }else {
		 * request.setAttribute("status", null); }
		 */
		request.setAttribute("repairs", list);
		request.setAttribute("mainPage", "/dormManager/repairquery.jsp");
		request.getRequestDispatcher("/mainManager.jsp").forward(request, response);
		return null;

	}
}
