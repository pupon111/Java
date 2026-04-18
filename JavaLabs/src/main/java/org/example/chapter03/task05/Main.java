/*
Add a static method with the name constant of the IntSequence class that yields an
infinite constant sequence. For example, IntSequence.constant(1) yields values 1 1
1..., ad infinitum. Extra credit if you do this with a lambda expression.
 */

package org.example.chapter03.task05;

public class Main {
    static void main() {
        IntSequence seq1 = IntSequence.constant(2);
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " step: " + seq1.next());
        }
        IntSequence seq2 = IntSequence.constantWithLambda(3);
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " step: " + seq2.next());
        }
    }
}
