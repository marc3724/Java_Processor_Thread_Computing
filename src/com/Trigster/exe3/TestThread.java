package com.Trigster.exe3;

import java.util.Scanner;

class TestThread extends Thread{
    public static void main(String arg[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please input the number of Threads you want to create: ");
        int n = input.nextInt();
        System.out.println("You selected " + n + " Threads");

        for (int x = 0; x < n; x++) {
            MyThread temp = new MyThread("Thread #" + x);
           // temp.start
            System.out.println("Started Thread:" + x);
        }
    }
}
