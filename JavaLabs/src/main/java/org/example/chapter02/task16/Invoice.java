/*
Fully implement the Invoice class in Section 2.7.1. Provide a method that prints the
invoice and a demo program that constructs and prints a sample invoice.
 */
package org.example.chapter02.task16;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

class Invoice {
    final private ArrayList<Item> items = new ArrayList<>();

    public void addItem(String description, int quantity, double unitPrice) {
        Item newItem = new Item(description, quantity, unitPrice);
        items.add(newItem);
    }

    public void print() {
        double totalPrice = 0;
        for (Item item : items) {
            System.out.println(item);
            totalPrice += item.price();
        }
        System.out.println("SUM = " + totalPrice);
    }

    private record Item(String description, int quantity, double unitPrice) {
        double price() {
            return quantity * unitPrice;
        }

        @NotNull
        public String toString() {
            return String.format("Description: %s; quantity - %s; unitPrice - %s", description, quantity, unitPrice);
        }
    }
}
