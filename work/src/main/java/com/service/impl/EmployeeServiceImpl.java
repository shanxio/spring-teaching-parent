package com.service.impl;

import com.dao.EmployeeDao;
import com.service.EmployeeService;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Resource(name = "employeDaoImpl")
public class EmployeeServiceImpl implements EmployeeService {
//
//    @Autowired
//    @Qualifier("employeDaoImpl")

    public EmployeeServiceImpl(EmployeeDao employeeDao){
        System.out.println("----------------"+employeeDao);
    }
    private EmployeeDao employeDaoImpl;

    public void setEmployeDaoImpl(EmployeeDao employeDaoImpl) {
        this.employeDaoImpl = employeDaoImpl;
    }
    //    public void setEmployeeDao(@Autowired EmployeeDao employeeDao, @Autowired(required = false) EmployeDaoImpl3 employeeService) {
//        System.out.println("-3242134---"+employeeService);
//        this.employeeDao = employeeDao;
//    }

    @Override
    public void update() {
        employeDaoImpl.update();
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化----");
    }
    @PreDestroy
    public void destory(){
        System.out.println("销毁-----");
    }
}
