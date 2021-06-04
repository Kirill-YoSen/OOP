package com.company;

public class Student {
    private String name;
    private int age;
    private Subject grades = new Subject();

    public Student(String  name, int age) {
        this.name = name;
        this.age = age;
        this.grades.setMath();
        this.grades.setRussian();
        this.grades.setSocial();
        this.grades.setDisignAndTechnologies();
        this.grades.setLiterature();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void printStudentInformation() {
        System.out.printf("Name %s:  , Age: %d \n", name, age);
        System.out.println("Math = " + this.grades.Math);
        System.out.println("Russian = " + this.grades.Russian);
        System.out.println("Social = " + this.grades.Social);
        System.out.println("D&T = " + this.grades.DisignAndTechnologies);
        System.out.println("Literature = " + this.grades.Literature);
    }
}
