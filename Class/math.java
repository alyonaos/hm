package Class;

class math {
    public static void main(String[] args) {
        int arg = 15;
        double sqrt = Math.sqrt(arg);
        boolean isPlain = true;
        for (int i = arg / 2; sqrt <= i; i--) {
            if (arg % i == 0) {
                isPlain = false;
            }
        }
    }
}
