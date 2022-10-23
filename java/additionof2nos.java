import java.util.Scanner;

public class additionof2nos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scan.nextInt();
        System.out.println("Enter the second number:");
        int b = scan.nextInt();
        int sum = a + b;
        System.out.println("Sum of "+a+" and "+b+" is "+sum);  
    }
    
}
