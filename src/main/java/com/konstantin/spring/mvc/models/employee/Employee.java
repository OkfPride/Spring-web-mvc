/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konstantin.spring.mvc.models.employee;

import com.konstantin.spring.mvc.my_annotation.myAnno2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.springframework.stereotype.Component;

/**
 *
 * @author JavaDev
 */
@Entity 
@Component
@Table(name = "empls")
public class Employee {

    private Map<String, String> departments;
    private Map<String, String> cars;

    @Column(name = "id")
    private int id;
    
    @Column(name = "name")
    @Size(min = 2,message = "name must be  atleast 2 characters")
    @NotBlank(message = "not blank")
    private String name;

    public Map<String, String> getCars() {
        return cars;
    } 

    public void setCars(Map<String, String> cars) {
        this.cars = cars;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
//    @Column(name = "name")
    private String department;
    
    @Column(name = "email")
    @NotEmpty(message = "not empty")
    @NotBlank(message = "not blank")
    @myAnno2
    private String email;
    
//    @Column(name = "email")
    private String car;
    
    @Min(value = 100,message = "must be more then 100")
    @Max(value = 1000,message = "must be lower then 1000")
    @Column(name = "salary")
    private int salary;
    @Pattern(regexp = ("[\\d]{3}-[\\d]{2}-[\\d]{2}"),message = "shoud have format XXX-XX-XX")
    private String phoneNumber; 

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee(String name, String email) {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resourses");
        departments.put("sale", "Sales");
        this.name = name;
        this.email = email;
    }

    public Map<String, String> getDepartments() {
        return departments; 
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;  
    }

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resourses");
        departments.put("sale", "Sales");
    }
}
