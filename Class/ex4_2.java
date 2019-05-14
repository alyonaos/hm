package Class;
/**
 * Заменить все грустные смайлы :( в строке на весёлые :)
 */

import java.util.Scanner;

public class ex4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String smiles = sc.nextLine();
        String result = relaceSmiles(smiles);
        System.out.println(result);
        //String string = ":) dljsk :(( ")).relace (regex: ":(", replacment: ":)"));

    }

    public static String relaceSmiles(String param) {
        return param.replace(":(", ":)");
    }
}
