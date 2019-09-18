package com.ss.class9;

import org.springframework.context.annotation.Bean;

//aspect oriented programming

//@Component
public class Student implements Human{
//    @Value("lisi")
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Bean(name = "student")
    public Student getStudent(){
        return new Student("lisi");
    }
}
