package com.dao.impl;

import com.dao.EmployeeDao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class EmployeDaoImpl  implements EmployeeDao {
    @Override
    public void update() {
        System.out.println("update in employeDaoImpl---");
    }
}
