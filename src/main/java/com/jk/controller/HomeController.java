package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	//系统首页模块
	
	@RequestMapping(value={"/","/home"})		//配合web下<url-pattern>/</url-pattern>
	public String login(){
		
		return "/index";			//首页，删除根目录下index.jsp，否则上面url将被拦截进不来
	}
	
	@RequestMapping(value="/fmain")
	public String fmain(){
		return "/home/fmain";
	}
	
	@RequestMapping(value="/title")
	public String title(){
		return "/home/title";
	}
	
	@RequestMapping(value="/left")
	public String left(){
		return "/home/left";
	}
	
	@RequestMapping(value="/main")
	public String main(){
		return "/home/olmsgList";			//首页转向留言板
	}
	
	//基础信息模块
	
	@RequestMapping("/baseinfoMain")
	public String baseinfoMain(){
		return "/baseinfo/main";
	}
	
	@RequestMapping("/baseinfoLeft")
	public String baseinfoLeft(){
		return "/baseinfo/left";
	}
	
	//货运管理模块
	
	@RequestMapping("/cargoMain")
	public String cargoMain(){
		return "/cargo/main";
	}
	
	@RequestMapping("/cargoLeft")
	public String cargoLeft(){
		return "/cargo/left";
	}
}
