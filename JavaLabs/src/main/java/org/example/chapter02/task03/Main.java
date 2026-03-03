package org.example.chapter02.task03;
public class Main {
    private class TClass {
        private int someNumber = 0;
        boolean setSomeNumber(int otherNumber) { //mutator method returns something other than void
            if (otherNumber < 0) {
                return false;
            }
            someNumber = otherNumber;
            return true;
        }
        void printSomeNumber() { //accessor method returns void
            System.out.println(someNumber);
        }
    }

}
