package org.example.chapter01.task15;
/*
Придумайте полезный сценарий, где поведение сквозного выполнения (fall-through)
полезно для оператора или выражения switch. Большинство результатов веб-поиска приведут примеры,
 имеющие смысл для C или C++, где выполнение переходит от случая A без действия к случаю B.
В Java это несущественно, так как можно использовать case A, B.
 */
public class Main {
    public static void main(String[] args) {
        //сценарий, в котором есть иерархия выполнения
        String role = "user";
        switch (role) {
            case "admin":
                System.out.println("Раздает права доступа");
            case "user":
                System.out.println("Работает в системе");
                break;
            default:
                System.out.println("Ничего не делает");
                break;
        }
    }
}
