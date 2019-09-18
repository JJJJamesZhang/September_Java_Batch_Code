package com.ss.class8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTopic {

    public static void main(String[] args) {
//        Employee employee = new Employee();
//        employee.setId(1);
//        employee.setName("zhangsan");
//        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("bean.xml");
//        Employee employee = applicationContext.getBean(Employee.class);
//        Employee employee1 = applicationContext.getBean(Employee.class);
//        System.out.println(employee == employee1);
        ApplicationContext applicationContext =new AnnotationConfigApplicationContext(BeanConfig.class);
        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee);
    }
}
