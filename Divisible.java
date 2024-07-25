import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        num=sc.nextInt();
        if(num%2==0 )
        System.out.println("divisible by 2");
        else if(num%3==0)
        System.out.println("divisble by 3");
        else if (num%4==0)
        System.out.println("diviisble by 4");
        else if(num%6==0)
        System.out.println("divisble by 6");
        else {
        System.out.println("not valid value");
        sc.close();
        }     

    }
}
