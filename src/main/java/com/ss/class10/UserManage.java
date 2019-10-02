package com.ss.class10;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import java.util.List;

public class UserManage {
    private static SessionFactory sessionFactory;

    public static void main(String[] args) {
        sessionFactory = new Configuration().configure().buildSessionFactory();

//        new UserManage().addUser(new UserEntity("wangwu","123456"));
//        new UserManage().addUser(new User("zhaoliu","123456",4));

        new UserManage().listUser();
    }

    public void addUser(UserEntity user){
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(user);
            tx.commit();
        }catch (Exception e){
            e.printStackTrace();
            if (tx != null){
                tx.rollback();
            }
        }finally {
            session.close();
        }
    }

    public void listUser(){
        Session session = sessionFactory.openSession();
//        String hql = "FROM User";
//        Criteria cr = session.createCriteria(UserEntity.class);
//        cr.add(Restrictions.eq("id", 2));
//        Query query = session.createQuery(hql);
//        List results = query.list();
//        List results = cr.list();
        String sql = "SELECT * FROM User where userId = 1";
        SQLQuery query = session.createSQLQuery(sql);
        query.addEntity(UserEntity.class);
        List results = query.list();
        System.out.println(results);
    }
}
