package com.schedule.demo.web.controller;

import com.schedule.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: John Long
 * @create: 18-Mar-2020
 **/
            @Controller
            public class EmployeeController {
                @Autowired
                EmployeeService employeeService;

                @RequestMapping(value = "/employeeAdmin")
                public String index(){
                    return "employeeAdmin";
                }


            }


