package com.yiidian.dao;

import com.yiidian.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * Dao接口
 * 一点教程网 - www.yiidian.com
 */
public interface CustomerDao extends JpaRepository<Customer,Integer>,JpaSpecificationExecutor<Customer>{
}
