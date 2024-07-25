import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Gender (M/F/O):");
        char Gen = sc.next().charAt(0);

        if (Gen == 'M' || Gen == 'm') {
            System.out.println("MALE");
        } else if (Gen == 'F' || Gen == 'f') {
            System.out.println("FEMALE");
        } else {
            System.out.println("OTHER");
            sc.close();
            

        }
    }
}
