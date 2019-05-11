package FirstHomework;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class calendar2 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String dateAsString = scanner.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date desiredDate = sdf.parse(dateAsString);
        Calendar calendar = Calendar.getInstance();
        System.out.println(desiredDate);
    }
}
