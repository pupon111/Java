/*
Using the listFiles(FileFilter) and isDirectory methods of the java.io.File class,
write a method that returns all subdirectories of a given directory. Use a lambda
expression instead of a FileFilter object. Repeat with a method expression and an
anonymous inner class.
 */

package org.example.chapter03.task11;

import java.io.File;
import java.io.FileFilter;

public class Main {
    @SuppressWarnings("unused")
    public static File[] directories(String path) {
        //return new File(path).listFiles(file -> file.isDirectory());
        //return new File(path).listFiles(File::isDirectory);
        return new File(path).listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
    }
}
