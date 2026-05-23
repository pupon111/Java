package org.example.chapter04.task09;

public final class NonEmptyStringList implements StringList {
    private final String head;
    private final StringList tail;

    public NonEmptyStringList(String head, StringList tail) {
        this.head = head;
        this.tail = tail;
    }

    public String head() {
        return head;
    }

    public StringList tail() {
        return tail;
    }
}