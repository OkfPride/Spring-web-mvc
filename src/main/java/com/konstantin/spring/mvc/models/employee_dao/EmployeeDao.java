/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konstantin.spring.mvc.models.employee_dao;

import com.konstantin.spring.mvc.models.employee.Employee;
import javax.persistence.Entity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

/**
 *
 * @author JavaDev
 */
@Component
//@Entity
public class EmployeeDao {

    private Employee employee;

    public EmployeeDao(Employee employee) {
        this.employee = employee;
    }

    public EmployeeDao() {
    }

    public Employee showEmployee() {
//        employee = new Employee("Ivan", "ivan@mail.ru");
//        Session currentSession = null;
//        SessionFactory buildSessionFactory = null;
//        System.out.println("check1");
//        try {
//            buildSessionFactory = new Configuration().
//                    configure("hibernate.cfg.xml").
//                    addAnnotatedClass(Employee.class).
//                    buildSessionFactory();
//        System.out.println("check2");
//            currentSession = buildSessionFactory.getCurrentSession();
//        System.out.println("check3");
//            currentSession.beginTransaction();
//        System.out.println("check4");
//            currentSession.save(employee);
//        System.out.println("check5");
//
//            System.out.println(currentSession);
//            currentSession.getTransaction().commit();
//        System.out.println("check6");
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
////            currentSession.close();
////            buildSessionFactory.close();
//        }
        return employee = new Employee("Ivan", "ivan@mail.ru");
    }

}
