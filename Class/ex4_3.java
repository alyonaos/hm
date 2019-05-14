package Class;
/**
 * Написать функцию, принимающую 2 параметра: строку и слово - и возвращающую true, если строка начинается и заканчивается этим словом.
 */

import java.util.Scanner;

public class ex4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String word = sc.next();
        System.out.println(endsAndStartsWithWord(line, word));
    }
    private static boolean endsAndStartsWithWord (String line, String word){
        return line.trim().startsWith(word)&& line.trim().endsWith(word);
    }
}
