public class NumberPolindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrom(701));
    }

    public static boolean isPalindrom(int number) {
        String sum = "";
        int absNumber = Math.abs(number);
        if (number < 0) {
            sum = "-";
        }
        while (true) {
            sum += absNumber % 10;
            absNumber = absNumber / 10;
            if (absNumber == 0) {
                break;
            }
        }
        System.out.println(sum);
        if (Integer.parseInt(sum) == number) {
            return true;
        }
        return false;
    }
}
