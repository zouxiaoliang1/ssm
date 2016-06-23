package com.xipin.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xipin.ssm.entity.User;

@Controller
@RequestMapping("/mvc")
public class HelloWorldController {
	@RequestMapping("/helloWorld")
	public String helloWorld(@ModelAttribute("user") User user, Model model) {
		System.out.println(user.getUserName() + "-----" + user.getPassword());
		model.addAttribute("message", "hello world");
		return "index";
	}
	
	@RequestMapping("/freemaker")
	public String freemaker(@ModelAttribute("user") User user, Model model) {
		System.out.println(user.getUserName() + "-----" + user.getPassword());
		model.addAttribute("message", "hello world");
		return "index";
	}
}
