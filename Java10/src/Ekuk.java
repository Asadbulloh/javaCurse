public class Ekuk {
    public static void main(String[] args) {

        int birinchiSon  = 10, IkkinchiSon = 12, ekub = 1;

        for (int i = 1; i <= birinchiSon && i <= IkkinchiSon; i++) {
            if (birinchiSon % i == 0 && IkkinchiSon % i == 0)
                ekub = i;
        }

        int ekuk = (birinchiSon * IkkinchiSon) / ekub;
        System.out.printf("%s va %s ekubi = %s", birinchiSon, IkkinchiSon, ekuk);
    }
}
