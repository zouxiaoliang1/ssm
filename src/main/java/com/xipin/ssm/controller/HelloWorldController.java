package com.xipin.ssm.controller;

import java.util.HashMap;
import java.util.Map;

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
		String[] str = new String[]{"you", "me", "he"};
		model.addAttribute("message", str);
		return "index";
	}
	
	@RequestMapping("/freemarker")
	public Map<String, Object> freemarker(@ModelAttribute("user") User user, Model model) {
		System.out.println(user.getUserName() + "-----" + user.getPassword());
		model.addAttribute("message", "hello world");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("a", 1);
		return map;
	}
}
