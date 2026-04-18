/*
Implement a static of method of the IntSequence class that yields a sequence with
the arguments. For example, IntSequence.of(3, 1, 4, 1, 5, 9) yields a sequence with
six values. Extra credit if you return an instance of an anonymous inner class.
 */

package org.example.chapter03.task04;

public class Main {
    static void main() {
        IntSequence seq1 = IntSequence.ofAnon(1,2,3,4,5,6);
        while (seq1.hasNext()) {
            System.out.println(seq1.next());
        }
        IntSequence seq2 = IntSequence.ofNotAnon(6,5,4,3,2,1);
        while (seq2.hasNext()) {
            System.out.println(seq2.next());
        }
    }
}
