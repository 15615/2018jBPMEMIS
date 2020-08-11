package com.bwlk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bwlk.mapper.TDormmanagerMapper;
import com.bwlk.pojo.TDormmanager;

/**
 * 管理员对维修人员的操作(增删改查)
 * 
 * @author xiaofeng
 *
 */
@Controller
public class AdminController {

	@Autowired
	private TDormmanagerMapper tDormmanagerMapper;

	// 跳转到添加维修员
	@RequestMapping("/toaddrepairer")
	public String toaddrepairer(Model model) {
		model.addAttribute("mainPage", "/admin/addrepairer.jsp");
		return "mainAdmin";
	}

	// 管理员添加维修员
	@RequestMapping("/addrepairer")
	public String addrepairer(Model model, TDormmanager tDormmanager) {
		tDormmanagerMapper.insert(tDormmanager);
		model.addAttribute("msg", "添加成功");
		List<TDormmanager> list = tDormmanagerMapper.selectByExample(null);
		model.addAttribute("repairers", list);
		model.addAttribute("mainPage", "/admin/repairerquery.jsp");
		return "mainAdmin";
	}

	// 管理员查询维修员
	@RequestMapping("/repairersquery")
	public String repairersquery(Model model) {
		List<TDormmanager> list = tDormmanagerMapper.selectByExample(null);
		model.addAttribute("repairers", list);
		model.addAttribute("mainPage", "/admin/repairerquery.jsp");
		return "mainAdmin";
	}

	// 管理员跳转到更改维修员
	@RequestMapping("/toupdaterepairer")
	public String toupdaterepairer(Model model, Integer id) {
		TDormmanager tDormmanager = tDormmanagerMapper.selectByPrimaryKey(id);
		model.addAttribute("tDormmanager", tDormmanager);
		model.addAttribute("mainPage", "/admin/addrepairer.jsp");
		return "mainAdmin";
	}

	// 管理员更改维修员
	@RequestMapping("/updatereparier")
	public String updatereparier(Model model, TDormmanager tDormmanager) {
		tDormmanagerMapper.updateByPrimaryKeySelective(tDormmanager);
		model.addAttribute("msg", "修改成功");
		List<TDormmanager> list = tDormmanagerMapper.selectByExample(null);
		model.addAttribute("repairers", list);
		model.addAttribute("mainPage", "/admin/repairerquery.jsp");
		return "mainAdmin";
	}

	// 管理员删除维修员
	@RequestMapping("/delrepairer")
	public String delrepairer(Model model, Integer id) {
		tDormmanagerMapper.deleteByPrimaryKey(id);
		model.addAttribute("msg", "删除成功");
		List<TDormmanager> list = tDormmanagerMapper.selectByExample(null);
		model.addAttribute("repairers", list);
		model.addAttribute("mainPage", "/admin/repairerquery.jsp");
		return "mainAdmin";

	}

}
