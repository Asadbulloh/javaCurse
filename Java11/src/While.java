public class While {
    public static void main(String[] args) {
        int i = 0;
        while (i < 20) {
            i++;

            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
/*public static int sumDigits(int number) {
 if (number < 10) {
 return -1;
 }
 int sum = 0;
 while (true) {
 sum += number % 10;
 number = number / 10;
 if (number == 0) {
 break;
 }
 }
 return s*/