import java.util.Scanner;

public class ToqSonlar {
    public static void main(String[] args) {
        System.out.println("Birinchi sonni kiriting ");
        int b = get();
        System.out.println("Ikkinchi sonni kiriting ");
        int t = get();
        System.out.println(sumOdd(b, t));
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 != 0) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        if (!(end >= start && end > 0 && start > 0)) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static int get() {
        return new Scanner(System.in).nextInt();
    }
}
