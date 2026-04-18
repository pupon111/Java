/*
Implement a class Greeter that implements Runnable and whose run method prints n
copies of "Hello, " + target, where n and target are set in the constructor. Construct
two instances with different messages and execute them concurrently in two
threads.
 */

package org.example.chapter03.task09;

public class Main {
    static void main() {
        Runnable firstMessage = new Greeter(4, "Ivan");
        Runnable secondMessage = new Greeter(4, "Michail");
        Thread thread1 = new Thread(firstMessage);
        Thread thread2 = new Thread(secondMessage);
        thread1.start();
        thread2.start();
    }
}
