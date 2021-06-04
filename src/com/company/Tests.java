package com.company;

import java.util.Scanner;

public class Tests {
    private Subject grades;
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

        return (grade * 10)/maxPoints;
    }

    public int testRussian() {
        int grade = 0;
        String answer;

        //task 1
        System.out.print("task [1/5]: найдите лишнее [дедушка, бабушка, лифт, дети] ");
        answer = scanner.nextLine();
        answer = answer.replace(" ", "");
        if (answer == "лифт") {grade++;}

        //task 2
        System.out.print("task [2/5]: найдите лишнее [собака, кошка, метро] ");
        answer = scanner.nextLine();
        answer = answer.replace(" ", "");
        if (answer == "метро") {grade++;}

        //task 3
        System.out.print("task [3/5]: найдите лишнее [книга, журнал, кабинет] ");
        answer = scanner.nextLine();
        answer = answer.replace(" ", "");
        if (answer == "кабинет") {grade++;}

        //task 4
        System.out.print("task [4/5]: Жы - Шы пиши с буквой: ");
        answer = scanner.nextLine();
        answer = answer.replace(" ", "");
        if (answer == "и") {grade++;}

        //метро, вокзал, аэропорт, аптека
        //task 4
        System.out.print("task [5/5]: найдите лишнее [метро, вокзал, аэропорт, аптека] ");
        answer = scanner.nextLine();
        answer = answer.replace(" ", "");
        if (answer == "аптека") {grade++;}

        return (grade * 10)/maxPoints;
    }


}
