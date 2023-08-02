package com.employee;
class MidDeveloper extends Employee {
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Mid Developer " + getName() + " starts to work.");
        setSalary(getSalary() + 2000); // Increase salary for Mid Developer
    }
}