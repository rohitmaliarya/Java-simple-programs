import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value to check = ");
        int val =sc.nextInt();
        if(val%2==0)
        System.out.println("EVEN NUMBER");
        else 
        System.out.println("ODD number");
        sc.close();

    }
    
}
