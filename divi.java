import java.util.Scanner;
public class divi {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any value to check the number = ");
    int val = sc.nextInt();
    if(val%5==0)
    System.out.println("divisible by 5 ");
    else if (val%11==0)
    System.out.println("divisble by 11");
    else 
    System.out.println("not divisble by 5 and 11");
    sc.close();
}
    
}
