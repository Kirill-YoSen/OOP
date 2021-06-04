package com.company;

public class Subject {
    public int Math;
    public int Russian;
    public int Social;
    public int DisignAndTechnologies;
    public int Literature;
    private Tests test;

    public int setMath() {
       return test.testMath();
    }

    public int setRussian() {
        return test.testRussian();
    }
}
