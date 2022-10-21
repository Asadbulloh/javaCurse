import java.util.Scanner;

public class TubSon {
    public static class ExampleThree {

        public static void main(String[] args) {
            int number = getUserInput();
            for (int i = 2; i <= number; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }

        public static int getUserInput() {
            return new Scanner(System.in).nextInt();
        }

    }

}

