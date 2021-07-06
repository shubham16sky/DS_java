import java.util.Scanner;
public class SwappingUsingXOR {
    public static int swapping_using_xor(int a, int b){
        a = a ^ b;

        b = a ^ b;

        a = a ^ b;

        System.out.println("After swapping a is "+a+" and b is "+b);
        return 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number a :");
        int a = sc.nextInt();
        System.out.println("Enter the second number b :");
        int b = sc.nextInt();
        swapping_using_xor(a,b);
    }
}
