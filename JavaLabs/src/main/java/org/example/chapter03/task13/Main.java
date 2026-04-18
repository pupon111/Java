/*
Given an array of File objects, sort it so that directories come before files, and
within each group, elements are sorted by path name. Use a lambda expression to
specify the Comparator.
 */

package org.example.chapter03.task13;

import java.io.File;
import java.util.Arrays;

public class Main {
    @SuppressWarnings("unused")
    public static void sortedFiles(File[] files) {
        Arrays.sort(files, (first, second) -> {
            if (first.isDirectory() && !second.isDirectory()) return -1;
            if (!first.isDirectory() && second.isDirectory()) return 1;
            return first.getPath().compareTo(second.getPath());
        });
    }
}
