import java.util.Scanner;
public class Postive {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        a=sc.nextInt();
        if(a>0)
        System.out.println("POSTIVE");
        else if(a<0)
        System.out.println("NEGATIVE");
        else
        System.out.println("ZERO");
        sc.close();
    }
    
}
