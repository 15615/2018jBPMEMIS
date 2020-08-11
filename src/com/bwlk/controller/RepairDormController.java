package com.bwlk.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bwlk.mapper.TDormmanagerMapper;
import com.bwlk.mapper.TRepairsMapper;
import com.bwlk.mapper.t_dormMapper;
import com.bwlk.mapper.t_dormbuildMapper;
import com.bwlk.pojo.TDormmanager;
import com.bwlk.pojo.TRepairs;
import com.bwlk.pojo.t_dorm;
import com.bwlk.pojo.t_dormExample;
import com.bwlk.pojo.t_dormbuild;
import com.bwlk.utils.JbpmUtils;

/**
 * 维修订单的controller
 * 
 * @author lenovo
 *
 */
@Controller
public class RepairDormController {

	@Autowired
	private TRepairsMapper TRepairsMapper;

	@Autowired
	private t_dormMapper t_dormMapper;

	@Autowired
	private t_dormbuildMapper t_dormbuildMapper;

	@Autowired
	private TDormmanagerMapper tDormmanagerMapper;

	@Autowired
	private JbpmUtils jbpmUtils;

	// 维修订单查询
	@RequestMapping("/repairquery")
	public String RepairQuery(HttpServletRequest request, HttpServletResponse response) throws Exception {

		List<TRepairs> repairs = TRepairsMapper.selectByExample(null);
		request.setAttribute("repairs", repairs);
		request.setAttribute("mainPage", "/admin/repairquery.jsp");
		request.getRequestDispatcher("/mainAdmin.jsp").forward(request, response);
		return null;
	}

	// 更改维修订单
	@RequestMapping("/updaterepair")
	public String updaterepair(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Integer repairid = Integer.parseInt(request.getParameter("repairid"));
		TRepairs repair = TRepairsMapper.selectByPrimaryKey(repairid);
		request.setAttribute("repair", repair);
		List<TDormmanager> list = tDormmanagerMapper.selectByExample(null);
		request.setAttribute("repairers", list);
		request.setAttribute("mainPage", "/admin/repairupdate.jsp");
		request.getRequestDispatcher("/mainAdmin.jsp").forward(request, response);
		return null;
	}

	// 保存维修订单
	@RequestMapping("/repaisave")
	public String repaisave(TRepairs tRepairs, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// System.out.println(tRepairs.getPiid());
		jbpmUtils.getProcessEngine().getExecutionService().signalExecutionById(tRepairs.getPiid(), "批准");
		tRepairs.setFlag(1);
		TRepairsMapper.updateByPrimaryKeySelective(tRepairs);
		request.setAttribute("error", "处理成功");
		List<TRepairs> repairs = TRepairsMapper.selectByExample(null);
		request.setAttribute("repairs", repairs);
		request.setAttribute("mainPage", "/admin/repairquery.jsp");
		request.getRequestDispatcher("/mainAdmin.jsp").forward(request, response);
		return null;
	}

	// 删除维修订单
	@RequestMapping("/delrepair")
	public String delrepair(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Integer repairid = Integer.parseInt(request.getParameter("repairid"));
		TRepairsMapper.deleteByPrimaryKey(repairid);
		request.setAttribute("error", "删除成功");
		List<TRepairs> repairs = TRepairsMapper.selectByExample(null);
		request.setAttribute("repairs", repairs);
		request.setAttribute("mainPage", "/admin/repairquery.jsp");
		request.getRequestDispatcher("/mainAdmin.jsp").forward(request, response);
		return null;
	}

	// 跳转添加维修订单
	@RequestMapping("/addrepairui")
	public String addrepair(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<t_dormbuild> dormBuilds = t_dormbuildMapper.selectByExample(null);
		request.setAttribute("dormBuilds", dormBuilds);
		request.setAttribute("mainPage", "/admin/addrepair.jsp");
		request.getRequestDispatcher("/mainAdmin.jsp").forward(request, response);
		return null;
	}

	// ajax获取宿舍
	@RequestMapping("/getdorm")
	@ResponseBody
	public List<t_dorm> getdorm(Integer value) {
		t_dormExample example = new t_dormExample();
		example.createCriteria().andDormbuildidEqualTo(value);
		List<t_dorm> t_dorm = t_dormMapper.selectByExample(example);
		// System.out.println(t_dorm.toString());
		return t_dorm;
	}

	// 添加维修订单
	@RequestMapping("/addrepair")
	public String addrepair(TRepairs repairs, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		TRepairsMapper.insertSelective(repairs);
		request.setAttribute("error", "添加维修成功");
		request.getRequestDispatcher("/student").forward(request, response);
		return null;
	}

}
