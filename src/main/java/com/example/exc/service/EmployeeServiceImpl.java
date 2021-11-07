package com.example.exc.service;

import com.example.exc.exception.IntServErrException;
import com.example.exc.exception.NotFoundRuntimeException;
import com.example.exc.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    Employee[] employee = {
            new Employee("Иванов", "Иван"),
            new Employee("Петров", "Петр"),
            new Employee("Сидоров", "Сидор"),
    };
    @Override
    public Employee addEmployee(String lastName, String firstName) throws IntServErrException {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                employee[i] = new Employee(lastName, firstName);
                return employee[i];
            }
        }
        throw new IntServErrException();
    }

    @Override
    public Employee removeEmployee(String lastName, String firstName) throws NotFoundRuntimeException {
                  Employee removeEmp = new Employee(lastName, firstName);
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].equals(removeEmp)) {
                employee[i] = null;
                return removeEmp;
            }
        }
        throw new NotFoundRuntimeException();
    }

    @Override
    public Employee findEmployee(String lastName, String firstName) throws NotFoundRuntimeException {

        Employee findEmp = new Employee(lastName, firstName);
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].equals(findEmp)) {
                return findEmp;
            }
        }
        throw new NotFoundRuntimeException();
    }
}

