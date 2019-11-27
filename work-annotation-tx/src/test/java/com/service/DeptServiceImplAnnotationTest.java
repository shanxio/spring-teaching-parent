package com.service;

import com.service.impl.DeptServiceImpl;
import config.ApplicationContextConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DeptServiceImplAnnotationTest {

    @Test
    public void textTx(){

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
        DeptServiceImpl deptService = context.getBean(DeptServiceImpl.class);
        deptService.deleteDept();
    }
}
