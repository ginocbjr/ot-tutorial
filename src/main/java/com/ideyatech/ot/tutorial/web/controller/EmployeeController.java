package com.ideyatech.ot.tutorial.web.controller;

import org.opentides.web.controller.BaseCrudController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ideyatech.ot.tutorial.entity.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController extends BaseCrudController<Employee> {

}
