

public class question2 {
    public static void main(String[] args) {
       int n = 5;

        for (int i = 0; i <n ; i++) {

            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            // Print characters
            for (int j = 0; j <= i ; j++) {
                System.out.print( ch++ );
            }
            ch -= 2;
            for(int j =0 ; j < i ; j++){
            System.out.print( ch-- );}
            System.out.println();
        }

      
    }
}
