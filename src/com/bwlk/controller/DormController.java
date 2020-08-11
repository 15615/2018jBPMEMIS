package com.bwlk.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bwlk.mapper.t_dormMapper;
import com.bwlk.mapper.t_dormbuildMapper;
import com.bwlk.pojo.t_dorm;
import com.bwlk.pojo.t_dormExample;
import com.bwlk.pojo.t_dormbuild;
import com.bwlk.pojo.t_dormbuildExample;

/**
 * 宿舍的controller层 负责接收关于宿舍的请求
 * 
 * @author lenovo
 *
 */
@Controller
public class DormController {

	@Autowired
	private t_dormMapper t_dormMapper;

	@Autowired
	private t_dormbuildMapper t_dormbuildMapper;

	// 跳转添加宿舍
	@RequestMapping("/adddormui")
	public String AddDormUi(Model model, HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("mainPage", "/admin/adddorm.jsp");
		String dormBuildName = request.getParameter("dormBuildName");
		request.setAttribute("dormBuildName", dormBuildName);
		List<t_dormbuild> dormBuilds = t_dormbuildMapper.selectByExample(null);
		request.setAttribute("dormBuilds", dormBuilds);
		request.getRequestDispatcher("/mainAdmin.jsp").forward(request, response);
		return null;
	}

	// 添加宿舍
	@RequestMapping("/adddorm")
	public String AddDorm(Model model, t_dorm dorm, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// System.out.println(dorm);
		t_dormMapper.insertSelective(dorm);
		String dormBuildName = request.getParameter("dormBuildName");
		request.setAttribute("error", "保存成功");
		t_dormExample example = new t_dormExample();
		example.createCriteria().andDormbuildidEqualTo(dorm.getDormBuildId());
		List<t_dorm> dorms = t_dormMapper.selectByExample(example);
		request.setAttribute("dorms", dorms);
		request.setAttribute("dormBuildName", dormBuildName);
		// request.setAttribute("mainPage","/admin/querydorm.jsp");
		request.getRequestDispatcher("dormBuild?action=list").forward(request, response);
		return null;
	}

	// 查询宿舍
	@RequestMapping("/querydorm")
	public String querydorm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer dormBuildId = Integer.parseInt(request.getParameter("dormBuildId"));
		String dormBuildName = request.getParameter("dormBuildName");
		// System.out.println(dormBuildId);
		t_dormExample example = new t_dormExample();
		example.createCriteria().andDormbuildidEqualTo(dormBuildId);
		List<t_dorm> dorms = t_dormMapper.selectByExample(example);
		request.setAttribute("dorms", dorms);
		request.setAttribute("dormBuildName", dormBuildName);
		request.setAttribute("mainPage", "/admin/querydorm.jsp");
		request.getRequestDispatcher("/mainAdmin.jsp").forward(request, response);
		return null;
	}

	// 删除宿舍
	@RequestMapping("/deldorm")
	public String deldorm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Integer dormBuildId = Integer.parseInt(request.getParameter("dormBuildId"));
		t_dormMapper.deleteByPrimaryKey(dormBuildId);
		request.setAttribute("error", "删除成功");
		request.getRequestDispatcher("/dormBuild?action=list").forward(request, response);
		return null;
	}

	// 更新宿舍
	@RequestMapping("/updatedorm")
	public String updatedorm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer dormId = Integer.parseInt(request.getParameter("dormId"));
		String dormBuildName = request.getParameter("dormBuildName");
		t_dorm dorms = t_dormMapper.selectByPrimaryKey(dormId);
		t_dormbuildExample example = new t_dormbuildExample();
		example.createCriteria().andDormbuildnameEqualTo(dormBuildName);
		List<t_dormbuild> dormBuilds = t_dormbuildMapper.selectByExample(example);
		List<t_dormbuild> dormBuildss = t_dormbuildMapper.selectByExample(null);
		if (dormBuilds.size() > 0) {
			request.setAttribute("dormBuild", dormBuilds.get(0));
		}
		request.setAttribute("dorms", dorms);
		request.setAttribute("dormBuilds", dormBuildss);
		request.setAttribute("mainPage", "/admin/adddorm.jsp");
		request.getRequestDispatcher("/mainAdmin.jsp").forward(request, response);
		return null;
	}

	// 保存更新宿舍
	@RequestMapping("/dormsave")
	public String dormsave(t_dorm t_dorm, HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		t_dormMapper.updateByPrimaryKey(t_dorm);

		request.setAttribute("error", "修改成功");
		request.getRequestDispatcher("/dormBuild?action=list").forward(request, response);

		return null;
	}
}
