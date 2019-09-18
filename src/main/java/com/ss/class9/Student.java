package com.ss.class9;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Qualifier("student")
@Component("student")
public class Student implements Human{

    public Student(){

    }
    @Value("lisi")
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



//    @Bean(name = "student")
//    public Student getStudent(){
//        return new Student("lisi");
//    }
}
