package com.yiidian.controller;
import com.yiidian.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 控制器
 * 一点教程网 - www.yiidian.com
 */
@Controller
public class CustomerController {
	@Autowired
	private RedisTemplate redisTemplate;

	/**
	 * 往Redis存入对象
	 */
	@RequestMapping("/put")
	@ResponseBody
	public String put(){
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("小明");
		customer.setGender("男");
		customer.setTelephone("132444455555");
		//调用Redis的API存入数据
		redisTemplate.opsForValue().set("customer",customer);
		return "success";
	}

	/**
	 * 从Redis取出对象
	 */
	@RequestMapping("/get")
	@ResponseBody
	public Customer get(){
		return (Customer)redisTemplate.opsForValue().get("customer");
	}
}
