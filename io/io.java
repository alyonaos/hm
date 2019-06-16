package io;

import javax.imageio.stream.FileImageInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class io {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        InputStreamReader streamReader = null;
        int b = 0;
        ArrayList<Character> letters = new ArrayList<>();
        {
            try {
                inputStream = new FileInputStream("src/io/pushkin");
                streamReader = new InputStreamReader(inputStream, "UTF-8");
                while ((b = streamReader.read()) != -1) {
                    letters.add((char) b);
                    for (char i : letters) {
                        if (letters.isEmpty()) {
                            Character count = letters.get((char) b);
                            if (count == null) {
                                count = 0;
                            }
                           letters.set((char)b, ++count);
                        }
                    }
                    for (char i : letters) {
                        System.out.println(letters + " - " + letters.get((char) b));
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    streamReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
