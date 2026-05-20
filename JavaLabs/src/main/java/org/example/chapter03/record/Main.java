package org.example.chapter03.record;

public class Main {
    //public record Rec(String name, int age) {}
    public record Rec(String name, int age, int data) {
        public Rec(String name, int age) {
            this(name, age, 0);
        }
    }
    static void main() {
        Rec man = new Rec("Ded", 90);
    }
}
