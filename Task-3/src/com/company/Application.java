package com.company;
import java.util.Scanner;

public class Application { //1.	Всю программу можно написать в одном классе Application с методом main

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        String a = in.next();
            if (a.matches("quit")) {System.exit(0);} //Программа останавливает работу, если пользователь на любом этапе вводит quit
        System.out.println("Enter second number");
        String b = in.next();
            if (b.matches("quit")) {System.exit(0);}
        System.out.println("Enter sign");
        String s = in.next();
            if (s.matches("quit")) {System.exit(0);}
        System.out.println("Result");
            if (s.equals("+")) { //В зависимости от переданного знака + или – выполняет нужную операцию и выводит результат на консоль
                System.out.println(Double.parseDouble(a)+Double.parseDouble(b)); //	Добавить поддержку всех действительных чисел (т.е. дробных)
            }
            if (s.equals("-")){
                System.out.println(Double.parseDouble(a)-Double.parseDouble(b));
            }
            if (s.equals("*")){ //Добавить поддержку умножения и деления
                System.out.println(Double.parseDouble(a)*Double.parseDouble(b));
            }
            if (s.equals("/")){
                System.out.println(Double.parseDouble(a)/Double.parseDouble(b));
            }
    }
}
