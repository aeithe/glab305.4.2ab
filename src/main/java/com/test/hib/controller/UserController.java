package com.test.hib.controller;

import org.hibernate.SessionFactory;

public class UserController {
    public static void findUserHql(SessionFactory factory, Session session) {
        String hqlFrom = "FROM User"; // Example of HQL to get all records of user class
        String hqlSelect = "SELECT u FROM User u";
        TypedQuery<User> query = session.createQuery(hqlFrom, User.class);
        List<User> results = query.getResultList();

        System.out.printf("%s%13s%17s%34s%n","|User Id","|Full name","|Email","|Password");
        for (User u:results) {
            System.out.printf(" %-10d %-20s %-30s %s %n", u.getId(), u.getFullName(), u.getEmail(), u.getPassword());
        }
    }

}
