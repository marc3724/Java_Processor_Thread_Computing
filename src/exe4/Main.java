package exe4;

/*TODO Exercise 2

Skriv et program, der tager en positiv integer n som input, og opretter n tråde der
        udlæser deres eget navn. Output kunne se sådan ud:

        •	Hallo, Jeg hedder Thread #1
        •	Hallo, Jeg hedder Thread #2
        •	Hallo, Jeg hedder Thread #3
        •	Hallo, Jeg hedder Thread #4

        Ved n=4
 */
public class Main {

    class thread3 extends Thread{
        public void run(){
            for (int i = 0; i < 4; i++) {
                System.out.println("Hallo, jeg er thread #" + i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public void main(String[] args) {
        thread3 t3 = new thread3();
        t3.start();

    }
}
