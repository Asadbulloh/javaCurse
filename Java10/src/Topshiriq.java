public class Topshiriq {
    public static void main(String[] args) {
        int count = 0;
        int some = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                some += i;
                //some = some + i;
                System.out.println(i);
                count++;
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("Natija = " + some);
    }
}

