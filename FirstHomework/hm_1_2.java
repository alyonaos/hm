package FirstHomework;

import java.util.Scanner;

public class hm_1_2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Введите длинну дома");
        int a = Sc.nextInt();
        System.out.println("Введите ширину дома");
        int b = Sc.nextInt();
        int c = a * b;
        System.out.println("Площадь дома = " + c);
        System.out.println("Введите длинну участка");
        int e = Sc.nextInt();
        System.out.println("Введите ширину участка");
        int f = Sc.nextInt();
        int j = e * f;
        System.out.println("Площадь участка = " + j);
        if (c < j) {
            System.out.println("Ваш дом поместится на участок!");
        }
        if (c > j) {
            System.out.println("Ваш дом не поместится на участок!");
        }
    }
}
