package Class;

public class factorial2 {

    public static void main(String[] args) {
        factRecursion(6);
    }
    static int factRecursion(final int number) {
        System.out.println("input arg: " + number);
        if (number <= 1) {

            System.out.println("Found base case!");
            System.out.println("return 1");
            return 1;
        } else {

            int recursiveCallResult = factRecursion(number - 1);
            System.out.println("result from recursive call: " + recursiveCallResult + "*input:" + number);
            return number * recursiveCallResult;
        }
    }
}
