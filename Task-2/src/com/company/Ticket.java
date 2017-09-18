package com.company;
//не доделано
public class Ticket {
    public static void main(String[] args) {
        int[] id = new int[10];
        for (int i = 0; i < 10; i++) {
            id[i] = i + 1;
            //System.out.println(id[i]);
        }

        String[] question = {"ticket1","ticket2","ticket3","ticket4","ticket5","ticket6","ticket7","ticket8","ticket9","ticket10"};
        int n = (int)Math.floor(Math.random() * question.length);
        //System.out.println(question[n]);

    }
}