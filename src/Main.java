import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k, l = 0, m = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        k = input.nextInt();

        for (int i = 1; i < k; i++) {
            if (k % i == 0) {
                l += i;
            }
        }

        if (k == l) {
            System.out.println(k + " Mükemmel sayıdır!");
        } else {
            System.out.println(k + " Mükemmel sayı değildir!");
        }

    }
}
