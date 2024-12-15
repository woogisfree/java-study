package io.file;

import java.io.File;
import java.io.IOException;

/**
 * 경로 표시 - File
 */
public class OldFilePath {

    public static void main(String[] args) throws IOException {
        File file = new File("temp/..");
        System.out.println("path = " + file.getPath());
        //절대경로
        System.out.println("Absolute path = " + file.getAbsolutePath());
        //정규경로
        System.out.println("Canonical path = " + file.getCanonicalPath());

        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println((f.isFile() ? "F" : "D") + " | " + f.getName());
        }
    }
}
