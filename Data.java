import java.util.Scanner;

 class Data {
    public static void main(String[] args){
       int length,breadth,area;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the value of area = ");
       length = sc.nextInt();
       System.out.println("enter the value of breadth = ");
       breadth = sc.nextInt();
       area=length*breadth;
       System.out.println("the area is "+area);
       sc.close();
       
}
 }
