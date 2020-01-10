package com.yiidian.domain;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

/**
 * 实体
 * 一点教程网 - www.yiidian.com
 */
public class User {

	private Integer id;
	//@NotBlank(message="用户名不能为空") // 非空
	@NotEmpty(message="用户名不能为空")
	private String name;
	@NotBlank(message="密码不能为空") // 非空
	@Length(min=4,max=10,message="密码必须在4-10位之间")
	private String password;
	@Min(value=0)
	private Integer age;
	@Email(message="邮箱不合法")
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	
}
