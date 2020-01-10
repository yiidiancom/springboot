package com.yiidian.domain;

import java.io.Serializable;

/**
 * 实体类
 * 一点教程网 - www.yiidian.com
 */

public class Customer implements Serializable{
	private Integer id;
	private String name;
	private String gender;
	private String telephone;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"id=" + id +
				", name='" + name + '\'' +
				", gender='" + gender + '\'' +
				", telephone='" + telephone + '\'' +
				'}';
	}
}
