import java.util.Scanner;

public class OddEven
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked :");

        int a = sc.nextInt();

        if((a&1)==0){
            System.out.println("The given number is even");
        }else{
            System.out.println("The given number is odd");
        }
    }
}
