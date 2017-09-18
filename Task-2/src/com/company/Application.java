package com.company;
//Класс Application c методом main, который выполняет всю программу.
public class Application {

    public static void main(String[] args) {
        //В методе main создается коллекция (массив) из 5 разных студентов
        int[] Student = new int[5];
        for (int i = 0; i < 5; i++) {
            Student[i] = i + 1;
            }
        //Каждый студент «сдает экзамен» - получает рандомную оценку (число int) от 1 до 5.  Эти значения хранятся в отдельной коллекции (массиве) results
        int[] results = new int[6];
          for (int i = 1; i < 6; i++) {
            results[i] = ((int)(Math.random() * (6-1) + 1));
            System.out.println(results[i]);
        }
        //Вывести в консоль среднюю оценку на основе значений из results
        System.out.println("Average:");
        double average = 0;
        {
            double sum = 0;
            for (int j = 0; j < 6; j++) {
                sum += results[j];
            }
            average = sum / (results.length - 1);
            System.out.println(average);
        }

    }
}
