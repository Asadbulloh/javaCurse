public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(1111));

    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int qoldiq = number % 10;
        while (true) {
            number /= 10;
            if (number < 10) {
                break;
            }

        }
        return qoldiq + number;
    }
}