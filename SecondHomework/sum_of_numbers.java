package SecondHomework;

import java.util.Scanner;

public class sum_of_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = k;
        int s = 0;
        while (x != 0) {
            s = s + x % 10;
            x = x / 10;
        }
        System.out.println("Сумма цифр в числе " + k + " = " + s);
    }

}