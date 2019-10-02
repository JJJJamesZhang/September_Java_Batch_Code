package com.ss.class10;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.*;
import javax.transaction.Transaction;
import java.util.List;

public class EmployeeManage {
    private static EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("jpa");


    public static void main(String[] args) {
//        new EmployeeManage().saveEmployee("zhangsan");
        EntityManager em = emFactory.createEntityManager();


        EntityTransaction tx = em.getTransaction();
        tx.begin();
//        DepartmentEntity departmentEntity = em.find(DepartmentEntity.class,2);
//        EmployeeEntity employeeEntity1 = em.find(EmployeeEntity.class,1);
//        EmployeeEntity employeeEntity2 = em.find(EmployeeEntity.class,2);
//        EmployeeEntity employeeEntity3 = em.find(EmployeeEntity.class,3);
//        EmployeeEntity employeeEntity4 = em.find(EmployeeEntity.class,4);
//        System.out.println(employeeEntity1);
//        System.out.println(employeeEntity2);
//        System.out.println(employeeEntity3);
//        System.out.println(employeeEntity4);
//        System.out.println(departmentEntity);
//        System.out.println(employeeEntity1);
//        Query query = em.createQuery("select d from DepartmentEntity d");
//        List<DepartmentEntity> departmentEntities = query.getResultList();
//        System.out.println(departmentEntities);

        Query query = em.createQuery("select p from ProjectEntity p");
        List<ProjectEntity> projectEntities = query.getResultList();
        System.out.println(projectEntities);
        tx.commit();
//        Query query = em.createQuery("select ep from EmployeeProjectEntity ep");
//        List<EmployeeProjectEntity> employeeProjectEntities = query.getResultList();
//        tx.commit();
    }


    public void saveEmployee(String name){
        EntityManager em = emFactory.createEntityManager();


        EntityTransaction tx = em.getTransaction();
        tx.begin();

        EmployeeEntity employeeEntity = new EmployeeEntity();
//        employeeEntity.setName(name);

        em.persist(employeeEntity);
        tx.commit();
    }


}
