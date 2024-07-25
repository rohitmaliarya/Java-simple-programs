import java.util.Scanner;
public class Maxfive {
    public static void main(String[] args) {
        int a,b,c,d,e,f;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        a=sc.nextInt();
        System.out.println("enter the value of b");
        b=sc.nextInt();
        System.out.println("ente the value of c");
        c=sc.nextInt();
        System.out.println("enter the value of d");
        d=sc.nextInt();
        System.out.println("enter the value of e");
        e=sc.nextInt();
        System.out.println("enter the value of f");
        f=sc.nextInt();
        if(a>b&&a>c&&a>d&&a>e&&a>f)
        System.out.println("max value is a = "+a);
        else if(b>a&&b>c&&b>d&&b>e&&b>f)
        System.out.println("max value is b = "+b);
        else if(c>a&&c>b&&c>d&&c>e&&c>f)
        System.out.println("max value is c ="+c);
        else if(d>a&&d>b&&d>c&&d>e&&d>f)
        System.out.println("max value is d ="+d);
        else if(e>a&&a>b&&e>c&&e>d&&e>f)
        System.out.println("max value is e ="+e);
        else
        System.out.println("max value is f = "+f);
        sc.close();
    }
    
}
