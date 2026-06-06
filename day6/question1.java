import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        int binary = 0, place = 1;

        while (n > 0) {
            int remainder = n % 2;
            binary = binary + remainder * place;
            place = place * 10;
            n = n / 2;
        }

        System.out.println("Binary = " + binary);
    }
}