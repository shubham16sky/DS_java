import java.util.Scanner;

public  class OddEvenXor {
    public static int odd_even_using_xor(int a){
        if((a^1)==a+1){
            System.out.println("Given number is even");
        }else{
            System.out.println("The given number is odd");
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked :");
        int a = sc.nextInt();
        System.out.println((odd_even_using_xor(a)));
    }
}