package com.Trigster.exe;
/*
//TODO Exercise 1
Lav et program, der har 4 tråde. Hver tråd har til opgave at udskrive et specifikt tal.

•	Tråd 1 skal printe tallet ‘8’,
•	tråd 2 tallet ‘1’,
•	tråd 3 tallet ‘2’
•	tråd 4 tallet ‘5’.

Skriv skriv en metode, der eksekverer trådene i sådan en rækkefølge, så der udlæses hvor mange
kilometre der går på 1000 sømil (international nautical mile). (1 Sømil = 1.852 Kilometer)

Omskriv programmet, så hvert tal udlæses med 3 sekunders mellemrum, ved brug af
Omskriv programmet, så hvert tal udlæses med 3 sekunders mellemrum, ved brug af Thread.sleep(milliseconds) metoden.

//TODO Exercise 2
Skriv et program, der tager en positiv integer n som input, and opretter n tråde der
udlæser deres eget navn. Output kunne se sådan ud:



Ved n=4
 */
/*
class hi {
        public void show()  {
            for (int i = 0; i < 10; i++) {
            System.out.println("I know what you did last summer");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
}

class hello{
    public void show(){
        for (int i = 0; i < 5; i++) {
            System.out.println("no");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

*/

public class Main {
    public static void main(String[] args) {
       /*
       hi obj1 = new hi();
       hello obj2 = new hello();
       */

        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        thread3 t3 = new thread3();
        thread4 t4 = new thread4();

        t2.start();
        try {Thread.sleep(10); } catch (Exception e){}
        t1.start();
        try {Thread.sleep(10); } catch (Exception e){}
        t4.start();
        try {Thread.sleep(10); } catch (Exception e){}
        t3.start();
    }
}

class thread1 extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("8");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
class thread2 extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("1");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class thread3 extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("2KM");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
class thread4 extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("5");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}




