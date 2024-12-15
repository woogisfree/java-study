package io.file.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * InputStream - transferTo()
 */
public class FileCopyMainV2 {

    public static void main(String[] args) throws IOException {
        long startMs = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("temp/copy.dat");
        FileOutputStream fos = new FileOutputStream("temp/copy_new.dat");
        fis.transferTo(fos);
        fis.close();
        fos.close();

        long endMs = System.currentTimeMillis();
        System.out.println("Time taken: " + (endMs - startMs) + "ms");
    }
}
