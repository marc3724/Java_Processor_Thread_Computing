package com.Trigster.exe2;
/*
//TODO Exercise 2


Skriv et program, der tager en positiv integer n som input, og opretter n tråde der
        udlæser deres eget navn. Output kunne se sådan ud:

        •	Hallo, Jeg hedder Thread #1
        •	Hallo, Jeg hedder Thread #2
        •	Hallo, Jeg hedder Thread #3
        •	Hallo, Jeg hedder Thread #4

        Ved n=4
}
console.log(Object7);
 */



public class Main2 {

    public static void main(String[] args) {
        thread1 t1 = new thread1();
        t1.start();


    }
}
//--------------------------------------------------------------------------------------------------------------------
class thread1 extends Thread {
    int n = 4;
    public void run(){
        
        for (int i = 1; i <= n; i++) {
            setName(" Thread #"+i);
            new thread1().getName();
            double pause = (long) (Math.random()*5000) + 1000;

            System.out.println("Hello, jeg hedder" + getName());
            try {
                Thread.sleep( (long)pause);
                System.out.println("Time In Milliseconds [ " + pause+" ]");
                //System.out.println("                                        (  Y  ) ");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        /*
        class MyThread extends Thread {

          public MyThread (String s) {
            super(s);
          }

          public void run() {
            System.out.println("Run: "+ getName());
          }
        }


         class TestThread {
          public static void main (String arg[]) {

            Scanner input = new Scanner(System.in);
            System.out.println("Please input the number of Threads you want to create: ");
            int n = input.nextInt();
            System.out.println("You selected " + n + " Threads");

            for (int x=0; x<n; x++)
            {
                MyThread temp= new MyThread("Thread #" + x);
                temp.start();
                System.out.println("Started Thread:" + x);
            }
        }
}


        new thread1().getName();
        for (int i = 1; i <= n; i++) {
            //thread1 ti = new thread1();
            System.out.println("Hello, jeg hedder Thread #" + i);
            thread1 = ["Object"+i] = new Object();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
         */


    }

}
