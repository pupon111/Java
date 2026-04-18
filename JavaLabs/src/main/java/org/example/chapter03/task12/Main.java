/*
Using the list(FilenameFilter) method of the java.io.File class, write a method that
returns all files in a given directory with a given extension. Use a lambda
expression, not a FilenameFilter. Which variable from the enclosing scope does it
capture?
 */

package org.example.chapter03.task12;

import java.io.File;

public class Main {
    @SuppressWarnings("unused")
    public static String[] filesWithPermission(String path, String permission) {
        File directory = new File(path);
        if (directory.isFile()) {
            return null;
        }
        return directory.list((_, name) -> name.endsWith(permission));
    }
}
