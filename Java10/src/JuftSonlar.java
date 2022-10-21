import java.util.Scanner;

public class JuftSonlar {
    public static void main(String[] args) {
        System.out.println(" Birinchi sonni kiriting");
        int b = get();
        System.out.println("Ikkinchi sonni kiriting ");
        int i = get();
        System.out.println(sumEvens(b, i));
    }

    public static boolean isEven(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int sumEvens(int start, int end) {

        if (!(end >= start && end > 0 && start > 0)) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isEven(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static int get() {
        return new Scanner(System.in).nextInt();
    }
}

