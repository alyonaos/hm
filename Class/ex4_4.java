package Class;
/**
 * Написать функцию, принимающую в качестве параметров имя, фамилию и отчество и возвращающую инициалы в формате Ф.И.О.
 * Учесть, что входные параметры могут быть в любом регистре, а результирующая строка должна быть в верхнем.
 */

import java.util.Scanner;

public class ex4_4 {
    private static final String DOT = ".";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] fio = line.split(" ");
        String formattedFio = formatToFio(fio[0], fio[1], fio[2]);

        System.out.println(formattedFio);
    }
    private static String formatToFio (String firstName, String secondName, String middleName){
        String fio = firstName.charAt(0)+DOT + secondName.charAt(0)+DOT+middleName.charAt(0);{
            return fio.toUpperCase();
        }


    }
}
