package com.dao;

import com.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDao {
    void insert();
    List<Employee> getEmp(@Param("pageNum") int pageNum,@Param("pageSize")int pageSize);
}
