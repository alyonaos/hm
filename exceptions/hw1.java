package exceptions;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class hw1 {
    public List<Double> readValues() throws Exception {
        readValues().add(12.16);
        readValues().add(5.76);
        readValues().add(12.44);
        Scanner scanner = new Scanner (System.in);
        String num = scanner.next();
        try {
            Double.valueOf(num);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException(ex);
        }
        return  readValues();
    }
}
