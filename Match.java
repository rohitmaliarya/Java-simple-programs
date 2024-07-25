import java.util.Scanner;

public class Match {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            System.out.println("Enter the character to match:");
            char ch = sc.next().charAt(0);

            if (ch == 'a' || ch == 'A') {
                System.out.println("APPLE");
            } else if (ch == 'b' || ch == 'B') {
                System.out.println("BALL");
            } else if (ch == 'c' || ch == 'C') {
                System.out.println("CAT");
            } else {
                System.out.println("Not found");
                sc.close();
            }
    
        
        
    }
}
