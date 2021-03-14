/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.konstantin.spring.mvc.controllers;

import com.konstantin.spring.mvc.models.employee.Employee;
import com.konstantin.spring.mvc.models.employee_dao.EmployeeDao;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author JavaDev
 */
@org.springframework.stereotype.Controller
@Component
//@RequestMapping(path = "/work")
public class Controller {

    private EmployeeDao employeeDao;

    @Autowired
    public Controller(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }  
 
    @GetMapping("/get") 
    public String getPage(Model model) {
        Employee employee = new Employee();
        employee.setEmail("emailer");
        employee.setSalary(1000);
        employee.setName("Namer");
        model.addAttribute("employee", employee);
        System.out.println("GET FROM GETMAPPING");
        System.out.println(employee.getDepartments());
     
        return "index"; 
    } 
 
    @PostMapping("/show")  
    public String showInformationPOST(@ModelAttribute @Valid Employee employee, BindingResult bindingResult, @RequestParam(value = "employeeName", required = false) String name, HttpServletRequest request) {
        if (bindingResult.hasErrors()) {
            return "index";
        }
        employee.setSalary(employee.getSalary()*10);
        String parameter = request.getParameter("employeeName");
        System.out.println("i am in POST method show");
        System.out.println(employee);   
        return "/show";      
    }
 
    @GetMapping("/show")
    public String showInformation() {

        System.out.println("i am in GET method show");
        return "/show";
    }
}
