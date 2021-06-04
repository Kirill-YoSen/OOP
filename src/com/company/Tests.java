package com.company;

import java.util.Scanner;

public class Tests {
    //private Subject grades = new Subject();
    private final int maxPoints = 5;
    Scanner scanner = new Scanner(System.in);

    public int testMath() {
        int grade = 0;
        int answer = 0;

        //task 1
        System.out.print("task [1/5]: 2 + 2 = ");
        answer = scanner.nextInt();
        if (answer == 4) {grade++;}

        //task 2
        System.out.print("task [2/5]: 2 + 2 * 2 = ");
        answer = scanner.nextInt();
        if (answer == 6) {grade++;}

        //task 3
        System.out.print("task [3/5]: (23 + 17) * 2 / 1 = ");
        answer = scanner.nextInt();
        if (answer == 80) {grade++;}

        //task 4
        System.out.print("task [4/5]: 1^9 + 1 = ");
        answer = scanner.nextInt();
        if (answer == 2) {grade++;}

        //task 5
        System.out.print("task [5/5]: ((90 - 90 + 90) * 1) / 90 = ");
        answer = scanner.nextInt();
        if (answer == 1) {grade++;}
        System.out.println();

        return (grade * 10)/maxPoints;
    }

    public int testRussian() {
        int grade = 0;
        String answer;
        answer = scanner.nextLine();

        //task 1
        System.out.print("task [1/5]: найдите лишнее [дедушка, бабушка, лифт, дети] ");
        answer = scanner.nextLine();
        answer = answer.replace(" ", "");
        if (answer.equals("лифт")) {grade++;}

        //task 2
        System.out.print("task [2/5]: найдите лишнее [собака, кошка, метро] ");
        answer = scanner.nextLine();
        answer = answer.replace(" ", "");
        if (answer.equals("метро")) {grade++;}

        //task 3
        System.out.print("task [3/5]: найдите лишнее [книга, журнал, кабинет] ");
        answer = scanner.nextLine();
        answer = answer.replace(" ", "");
        if (answer.equals("кабинет")) {grade++;}

        //task 4
        System.out.print("task [4/5]: Жы - Шы пиши с буквой: ");
        answer = scanner.nextLine();
        answer = answer.replace(" ", "");
        if (answer.equals("и")) {grade++;}

        //task 5
        System.out.print("task [5/5]: найдите лишнее [метро, вокзал, аэропорт, аптека] ");
        answer = scanner.nextLine();
        answer = answer.replace(" ", "");
        if (answer.equals("аптека")) {grade++;}
        System.out.println();

        return (grade * 10)/maxPoints;
    }

    public int testSocial() {
        int grade = 0;
        String answer;

        //task 1
        System.out.print("task [1/5]: Безработица возникает в условиях: [\n" +
                " *плановой экономики\n" +
                " *рыночной экономики\n" +
                " *только при кризисе экономики\n" +
                " *только при появлении новых технологий\n]\n ");
        answer = scanner.nextLine();
        answer = answer.replace(" ", "");
        if (answer.equals("рыночнойэкономики")) {grade++;}

        //task 2
        System.out.print("task [2/5]: При рыночной экономике:[\n" +
                " *существует распределение на работу\n" +
                " *каждый сам распоряжается своим трудом\n" +
                " *нет конкуренции\n" +
                " *государство гарантирует стопроцентное трудоустройство\n]\n");
        answer = scanner.nextLine();
        answer = answer.replace(" ", "");
        if (answer.equals("каждыйсамраспоряжаетсясвоимтрудом")) {grade++;}

        //task 3
        System.out.print("task [3/5]: Безработица – это:[\n" +
                " *закономерный процесс\n" +
                " *редкое явление\n" +
                " *новое явление\n" +
                " *противоречащий общественным законам процесс\n]\n");
        answer = scanner.nextLine();
        answer = answer.replace(" ", "");
        if (answer.equals("закономерныйпроцесс")) {grade++;}

        //task 4
        System.out.print("task [4/5]: Предмет налогового права:[\n" +
                " *деньги\n" +
                " *отношения\n" +
                " *граждане\n" +
                " *государственные органы\n]\n");
        answer = scanner.nextLine();
        answer = answer.replace(" ", "");
        if (answer.equals("и")) {grade++;}

        //task 5
        System.out.print("task [5/5]: К новым условиям труда относится:[\n" +
                " *трудовая функция работника\n" +
                " *заработная плата\n" +
                " *внедрение компьютеров\n" +
                " *охрана труда\n]\n ");
        answer = scanner.nextLine();
        answer = answer.replace(" ", "");
        if (answer.equals("внедрениекомпьютеров")) {grade++;}
        System.out.println();

        return (grade * 10)/maxPoints;
    }

    public int testDandT () {
        return maxPoints;
    }

    public int testLiterature () {
        int grade =  0;
        String answer;

        System.out.print("task [1/5]: Речка спятила с ума —\n" +
                "По домам пошла сама.\n");
        answer = scanner.nextLine();
        answer = answer.replace(" ", "");
        if (answer.equals("водопровод")) {grade++;}

        System.out.print("task [2/5]: Музыкант, певец, рассказчик —\n" +
                "А всего труба да ящик.\n");
        answer = scanner.nextLine();
        answer = answer.replace(" ", "");
        if (answer.equals("граммофон")) {grade++;}

        System.out.print("task [3/5]: Вот иголки и булавки\n" +
                "Выползают из-под лавки,\n" +
                "На меня они глядят,\n" +
                "Молока они хотят.\n");
        answer = scanner.nextLine();
        answer = answer.replace(" ", "");
        if (answer.equals("ёж")) {grade++;}

        System.out.print("task [4/5]: Ёжик странный у Егорки\n" +
                "На окне сидит в ведерке.\n" +
                "День и ночь он дремлет,\n" +
                "Спрятав ножки в землю.\n");
        answer = scanner.nextLine();
        answer = answer.replace(" ", "");
        if (answer.equals("кактус")) {grade++;}

        System.out.print("task [5/5]: Если день нахмурится,\n" +
                "Если дождь пойдет —\n" +
                "Выйдет он на улицу,\n" +
                "Надо мной вспорхнет.\n");
        answer = scanner.nextLine();
        answer = answer.replace(" ", "");
        if (answer.equals("зонт")) {grade++;}

        return grade;
    }
}
