package com.xpf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.xpf.entity.MineInfo;
import com.xpf.service.MineInfoService;

@Controller
@RequestMapping("mineInfo")
public class MineInfoController {

	@Autowired
	private MineInfoService mineInfoService;

	@RequestMapping("showAll")
	public ModelAndView showAll(String projectName,@RequestParam(defaultValue="1")Integer pageNum){
		PageInfo<MineInfo> pageInfo = mineInfoService.queryMineInfo(projectName, pageNum, 3);
		ModelAndView view = new ModelAndView();
		view.addObject("pageInfo",pageInfo);
		view.setViewName("main/main");
		return view;
	}
	
	@RequestMapping("deleteProject")
	public String deleteProject(Integer id){
		mineInfoService.deleteProject(id);
		return "redirect:/mineInfo/showAll";
	}
	
	@RequestMapping("addProject")
	public String addProject(MineInfo mineInfo){
		mineInfoService.addProject(mineInfo);
		return "redirect:/mineInfo/showAll";
	}
}
