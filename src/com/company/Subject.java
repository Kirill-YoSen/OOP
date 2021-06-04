package com.company;

public class Subject {
    public int Math = 0;
    public int Russian = 0;
    public int Social = 0;
    public int DisignAndTechnologies = 0;
    public int Literature = 0;
    public Tests test = new Tests();

    public void setMath() {
        this.Math = test.testMath();
    }

    public void  setRussian() {
        this.Russian = test.testRussian();
    }

    public void  setSocial() {
        this.Social = test.testSocial();
    }

    public void setDisignAndTechnologies() {
        this.DisignAndTechnologies = test.testDandT();
    }

    public void setLiterature() {
        this.Literature = test.testLiterature();
    }
}
