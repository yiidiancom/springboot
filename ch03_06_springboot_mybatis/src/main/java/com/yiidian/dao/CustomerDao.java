package com.yiidian.dao;

import com.yiidian.domain.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Dao接口
 * 一点教程网 - www.yiidian.com
 */
@Mapper
public interface CustomerDao {
    /**
     * 查询所有用户
     */
    public List<Customer> findAll();
}
