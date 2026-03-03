package org.example.chapter01.task09;
/*
В разделе 1.5.3 есть пример двух строк s и t, для которых s.equals(t) истинно, но s != t.
Придумайте другой пример, который не использует substring.
 */
public class Main {
    public static void main(String[] args) {
        String str1 = "World";
        String str2 = "World";
        System.out.println("(str1 == str2) = " + (str1 == str2)); //существует лишь один экземпляр каждого литерала
        String str3 = new String(str1); //создание в куче
        System.out.println("(str1 == str3) = " + (str1 == str3));
        String str4 = new String(str1); //создание в куче
        System.out.println("(str3 == str4) = " + (str3 == str4));
    }
}
