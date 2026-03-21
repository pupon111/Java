/*
Fully implement the Invoice class in Section 2.7.1. Provide a method that prints the
invoice and a demo program that constructs and prints a sample invoice.
 */
package org.example.chapter02.task16;

public class Main {
    static void main() {
        Invoice invoice = new Invoice();
        invoice.addItem("book", 100, 23);
        invoice.addItem("table", 10, 100);
        invoice.addItem("cat", 1011, 3);
        invoice.print();
    }
}
