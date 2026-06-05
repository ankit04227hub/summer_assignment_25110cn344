import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int largestPrimeFactor = 1;

        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                largestPrimeFactor = i;
                num /= i;
            }
        }

        System.out.println("Largest Prime Factor = " + largestPrimeFactor);
    }
}