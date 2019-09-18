package com.ss.class8;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanConfig {

    @Bean(name = "employee")
    public Employee getEmployee(){
        return new Employee(1,"zhangsan");
    }

}
