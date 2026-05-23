package org.example.chapter04.task09;

public sealed interface StringList permits EmptyStringList, NonEmptyStringList {

    static int size(StringList list) {
        return switch (list) {
            case EmptyStringList empty -> 0;
            case NonEmptyStringList nonEmpty ->
                    1 + size(nonEmpty.tail());
        };
    }

    static StringList append(StringList list, String value) {
        return switch (list) {
            case EmptyStringList empty ->
                    new NonEmptyStringList(value, empty);

            case NonEmptyStringList nonEmpty ->
                    new NonEmptyStringList(
                            nonEmpty.head(),
                            append(nonEmpty.tail(), value)
                    );
        };
    }
}
