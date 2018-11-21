package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scaner = new Scanner(System.in);
        int size = scaner.nextInt();


        Input_Output_Researc meine = new Input_Output_Researc();

        for (int i = 0; i < size; i++) {
            meine.Input();
        }

        meine.Output();
    }

}
