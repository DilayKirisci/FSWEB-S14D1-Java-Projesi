package com.employee;

import com.employee.Employee;

class SeniorDeveloper extends Employee {
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Senior Developer " + getName() + " starts to work.");
        setSalary(getSalary() + 3000); // Increase salary for Senior Developer
    }
}