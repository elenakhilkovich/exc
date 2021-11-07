package com.example.exc.model;

import java.util.Objects;

public class Employee {                                // класс Employee, в нем строки фамилия-имя
    //private  int id;
    private final String firstName;                   //final - пот, что нет сеттера
    private final String lastName;
    //private int department;
    //private double salary;
    //private static int counter = 0;               //это счетчик, отвечает за id

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        // this.id = counter++;                    //просматривает всех работников
        // this.department = department;
        // this.salary = salary;
        // this.name = name;
    }

    //public int getId() {        return id;    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    //public int getDepartment() {
    //    return department;
    //}

    //public void setDepartment(int department) {
    //   this.department = department;
    //}

    //public double getSalary() {
    //    return salary;
    //}

    // public void setSalary(int salary) {
    //    this.salary = salary;
    //}   //void - ничего не возвращает


    @Override
    public String toString() {
        return firstName + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return lastName.equals(employee.lastName) && firstName.equals(employee.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName + lastName);
    }
}


