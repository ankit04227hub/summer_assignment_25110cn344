import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();
        int decimal = 0, i = 0;

        while (binary != 0) {
            int remainder = binary % 10;
            decimal += remainder * Math.pow(2, i);
            binary /= 10;
            i++;
        }

        System.out.println("Decimal = " + decimal);
    }
}