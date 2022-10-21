public class aaaa {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5001));

    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int i = number % 10;
        int j = 0;
        for (int e = number; e != 0; e /= 10) {
            j = i % 10;
        }
        return i + j;
    }
}
