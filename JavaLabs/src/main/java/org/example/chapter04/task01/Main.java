package org.example.chapter04.task01;

public class Main {
    public class A {
        public int a = 2;
        public int getA() {
            return a;
        }
    }

    public class B extends A {
        private int b = 3;

        @Override
        public int getA() {
            return a;
        }
    }
}
