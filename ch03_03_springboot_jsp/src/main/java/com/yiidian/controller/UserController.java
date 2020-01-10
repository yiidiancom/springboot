package com.yiidian.controller;
import java.util.ArrayList;
import java.util.List;
import com.yiidian.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 控制器
 * 一点教程网 - www.yiidian.com
 */
@Controller
public class UserController {
	/**
	 * 用户列表展示
	 */
	@RequestMapping("/list")
	public String list(Model model){
		//模拟用户数据
		List<User> list = new ArrayList<User>();
		list.add(new User(1,"小张",18));
		list.add(new User(2,"小李",20));
		list.add(new User(3,"小陈",22));
		
		//把数据存入model
		model.addAttribute("list", list);
		//跳转到jsp页面: list.jsp
		return "list";
	}
}
