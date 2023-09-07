package Opgaver.ex5;

import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;

    public class opg5 {
        public static void main(String[] args) {
            System.out.println("Enter a directory or file: ");
            Scanner input = new Scanner(System.in);
            String directory = input.nextLine();
            scanDir(directory);

        }
        /** Make a method that recursively traverses through all directories contained in the folder given
         by the path parameter and prints the names of all directories found:
         public static void scanDir(String path)
         Hint: Create a File object from the path and use the list() and isDirectory() methods in the File
         class.
         Make a method that can also write the level of the directory before the directory name (level
         of the start directory is 1): */

        public static void scanDir(String path) {
            File file = new File(path);
            if (file.isDirectory()) {
                System.out.println(file.getName());
                File[] files = file.listFiles();
                for (int i = 0; files != null && i < files.length; i++) {
                    scanDir(files[i].getPath());
                }
            } else {
                System.out.println(file.getName());
            }
        }
    }

