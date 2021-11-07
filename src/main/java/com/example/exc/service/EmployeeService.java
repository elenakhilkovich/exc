package com.example.exc.service;

import com.example.exc.exception.IntServErrException;
import com.example.exc.exception.NotFoundRuntimeException;
import com.example.exc.model.Employee;

public interface EmployeeService {
    Employee addEmployee(String lastName, String firstName) throws IntServErrException;
    Employee removeEmployee(String lastName, String firstName) throws NotFoundRuntimeException;

    Employee findEmployee(String lastName, String firstName) throws NotFoundRuntimeException;
}
