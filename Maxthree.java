import java.util.Scanner;
public class Maxthree {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        a=sc.nextInt();
        System.out.println("enter the value of b");
        b=sc.nextInt();
        System.out.println("enter the value of c");
        c=sc.nextInt();
        if(a>b&&a>c)
        System.out.println("max value is a"+a);

        else if(b>a&&b>c)
        
        System.out.println("max value is b"+b);
        else
        System.out.println("max value is c"+c);
        sc.close();

    }

    
}
