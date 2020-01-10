package com.yiidian.controller;
import java.util.ArrayList;
import java.util.List;

import com.yiidian.dao.CustomerDao;
import com.yiidian.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 控制器
 * 一点教程网 - www.yiidian.com
 */
@Controller
public class CustomerController {
	@Autowired
	private CustomerDao customerDao;

	/**
	 * 用户列表展示
	 */
	@RequestMapping("/list")
	@ResponseBody
	public List<Customer> list(){
		//模拟用户数据
		List<Customer> list = customerDao.findAll();
		return list;
	}
}
