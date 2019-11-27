package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource({"classpath:db.properties","classpath:db1.properties"})

public class DbConfig {

    public DbConfig(@Value("${jdbc.username}")String username){
        System.out.println("------------"+username);
    }

//    @Autowired
//    private Environment environment;
//    public String getString(){
//        return environment.getProperty("jdbc.username");
//    }
    private String username;

    @Value("${jdbc.username:my--root}")
    public void setUserName(String name,String username){

        this.username=name;
    }
    public String getUsername(){
        return username;
    }


}
