package com.service;

import com.service.impl.DeptServiceImpl;
import config.ApplicationContextConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationContextConfig.class)
public class DeptServiceImplTest  {
    @Autowired
    public DeptServiceImpl deptService;

    @Test
    public void deptServiceTest(){

//        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
//        DeptServiceImpl deptService = context.getBean(DeptServiceImpl.class);
        deptService.deleteDept();
    }
}
