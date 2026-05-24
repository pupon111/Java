package org.example.chapter04.additional_task;

public class Example {

    @Run
    public static void staticMethod() throws InterruptedException {
        Thread.sleep(50);
        System.out.println("Static метод");
    }

    @Run
    public void instanceMethod() throws InterruptedException {
        Thread.sleep(100);
        System.out.println("Instance метод");
    }

    @Run
    public void methodWithError() {
        throw new RuntimeException("Ошибка");
    }

    public void withoutAnnotation() {
        System.out.println("Hello world");
    }
}
