import java.util.Scanner;

public class Upper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character:");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower case value");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Upper case value");
        } else {
            System.out.println("Not a character value");
            sc.close();
        }
    }
}
