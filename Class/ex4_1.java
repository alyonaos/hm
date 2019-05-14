package Class;

/**
 * Написать два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String, второй
 * с помощью StringBuilder и метода append. Сравнить скорость их выполнения.
 */
public class ex4_1 {
    public static void main(String[] args) {
        System.out.println(builderSpeed());
        System.out.println(concatenateSpeed());

    }

    private static long concatenateSpeed() {
        long start = System.currentTimeMillis();
        String res = "";
        for (int i = 0; i < 10_00; i++) {
            for (int j = 0; j < 10_00; j++) {
                res += i + " " + j;
            }
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long builderSpeed() {
        long start = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10_00; i++){
            for (int j=0; j<10_00; j++){
                stringBuilder.append (i).append(j);
            }
        }
        String res = stringBuilder.toString();
        long end = System.currentTimeMillis();
        return end - start;
    }
}