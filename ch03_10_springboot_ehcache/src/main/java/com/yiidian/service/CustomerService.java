package com.yiidian.service;

import com.yiidian.domain.Customer;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * 业务层
 *一点教程网 - www.yiidian.com
 */
@Service
public class CustomerService {

    @Cacheable(value = "customer",key = "#id")
    public Customer findById(Integer id){
        System.out.println("执行了UserService获取User");
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("小明");
        customer.setGender("男");
        customer.setTelephone("13244445555");
        return customer;
    }

}
