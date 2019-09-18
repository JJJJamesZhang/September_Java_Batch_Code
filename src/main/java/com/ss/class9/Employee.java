package com.ss.class9;

import org.springframework.context.annotation.Bean;

//@Component
public class Employee implements Human {
//    @Value("zhangsan")
    private String name;
//    @Value("1")
    private int id;

    @Bean(name = "employee")
    public Employee getEmployee(){
        return new Employee("zhangsan",1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee() {
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
