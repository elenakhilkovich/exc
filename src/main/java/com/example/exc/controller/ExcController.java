package com.example.exc.controller;

import com.example.exc.exception.NotFoundRuntimeException;
import com.example.exc.model.Employee;
import com.example.exc.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/employee")
@RestController
public class ExcController {
    private final EmployeeService employeeService;

    public ExcController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam String lastName, @RequestParam String firstName) {
        return employeeService.addEmployee(lastName, firstName);
    }

    @GetMapping("/remove")
    public String removeEmployee(@RequestParam String lastName, @RequestParam String firstName) {
        return "Сотрудник " + employeeService.removeEmployee(lastName, firstName) + " удален.";
    }

    @GetMapping("/find")
    public Employee findEmployee(@RequestParam String lastName, @RequestParam String firstName) throws NotFoundRuntimeException {
        return employeeService.findEmployee(lastName, firstName);
    }
}