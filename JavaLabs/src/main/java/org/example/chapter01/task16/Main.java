package org.example.chapter01.task16;
/*
"Куайн" (Quine) — это программа, которая без чтения каких-либо входных данных или файлов
выводит свой собственный исходный код.
Напишите такую программу на Java, используя текстовый блок (text block).
 */
public class Main {
    public static void main(String[] args) {
        String kod = """
package org.example.chapter01.task16;
/*
"Куайн" (Quine) — это программа, которая без чтения каких-либо входных данных или файлов
выводит свой собственный исходный код.
Напишите такую программу на Java, используя текстовый блок (text block).
 */
public class Main {
    public static void main(String[] args) { 
        String kod = \"""%n%s%n\""";
        System.out.printf(kod);
    }
}""";
        System.out.printf(kod, kod);
    }
}
