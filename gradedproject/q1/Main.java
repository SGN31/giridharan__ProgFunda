package com.gradedproject.q1;

public class Main {
    public static void main(String[] args) {
        AdminDepartment admin = new AdminDepartment();
        HRDepartment hr = new HRDepartment();
        TechDepartment tech = new TechDepartment();

        System.out.println("Welcome to " + admin.departmentName());
        System.out.println(admin.getTodaysWork());
        System.out.println(admin.getWorkDeadline());
        System.out.println(SuperDepartment.getIsTodayHoliday());
        System.out.println();

        System.out.println("Welcome to " + hr.departmentName());
        System.out.println(hr.doActivity());
        System.out.println(hr.getTodaysWork());
        System.out.println(hr.getWorkDeadline());
        System.out.println(SuperDepartment.getIsTodayHoliday());
        System.out.println();

        System.out.println("Welcome to " + tech.departmentName());
        System.out.println(tech.getTodaysWork());
        System.out.println(tech.getWorkDeadline());
        System.out.println(tech.getStackInformation());
        System.out.println(SuperDepartment.getIsTodayHoliday());
        System.out.println();
    }
}
