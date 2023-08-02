package com.employee;

class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[3];
        midDevelopers = new MidDeveloper[3];
        seniorDevelopers = new SeniorDeveloper[3];
    }

    // Overloaded addEmployee method for different developer types
    public void addEmployee(JuniorDeveloper juniorDeveloper) {
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = juniorDeveloper;
                System.out.println("Junior Developer " + juniorDeveloper.getName() + " added.");
                return;
            }
        }
        System.out.println("No available slots for Junior Developer.");
    }

    public void addEmployee(MidDeveloper midDeveloper) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = midDeveloper;
                System.out.println("Mid Developer " + midDeveloper.getName() + " added.");
                return;
            }
        }
        System.out.println("No available slots for Mid Developer.");
    }

    public void addEmployee(SeniorDeveloper seniorDeveloper) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = seniorDeveloper;
                System.out.println("Senior Developer " + seniorDeveloper.getName() + " added.");
                return;
            }
        }
        System.out.println("No available slots for Senior Developer.");
    }
}
