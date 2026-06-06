import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        while (n > 0) {
            count += n % 2;  // Add 1 if last bit is set
            n = n / 2;
        }

        System.out.println("Number of set bits = " + count);
    }
}