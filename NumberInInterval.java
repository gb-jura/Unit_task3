public class NumberInInterval {
    public static void main(String[] args) {
        int num = 50;
        boolean result = numberInInterval(num);
        System.out.println(result);
    }

    public static boolean numberInInterval(int num) {
        return 25 < num && num < 100;
    }
}