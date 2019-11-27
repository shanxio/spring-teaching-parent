package com.service.impl;

import com.dao.DeptDao;
import com.dao.EmployeeDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class DeptServiceImpl  {
    private DeptDao deptDao;
    private EmployeeDao employeeDao;

    public DeptServiceImpl(DeptDao deptDao, EmployeeDao employeeDao) {
        this.deptDao = deptDao;
        this.employeeDao = employeeDao;
    }
    @Transactional()
    public void deleteDept(){
        System.out.println("执行操作----------------");
        deptDao.delete();
        employeeDao.insert();
    }


}
