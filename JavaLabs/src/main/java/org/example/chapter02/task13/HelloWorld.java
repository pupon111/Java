/*
Make a file HelloWorld.java that declares a class HelloWorld in a package ch01.sec01.
Put it into some directory, but not in a ch01/sec01 subdirectory. From that directory
run javac HelloWorld.java. Do you get a class file? Where? Then run java HelloWorld.
What happens? Why? (Hint: Run javap HelloWorld and study the warning message.)
Finally, try javac -d . HelloWorld.java. Why is that better?
 */
package org.example.chapter02.task12;

public class HelloWorld {
    static void main(String[] ignoredArgs) {
        System.out.println("hello world");
    }
}
