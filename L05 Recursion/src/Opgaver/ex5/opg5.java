package Opgaver.ex5;

import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;

public class opg5 {
    public static void main(String[] args) {
        System.out.println("Enter a directory or file: ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();

        System.out.println(getDirectory(new File(directory)) + "directory");
    }

    public static void scanDir(String path) {
        if (!path.isEmpty()) {

        }
    }

    public static long getDirectory(File file) {
        long count = 0;
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; files != null && i < files.length; i++) {
                count += getDirectory(files[i]);
            }
        } else {
            count += file.length();
        } return count;
    }
}

