import java.util.Scanner;
public class NoOfBitsToBeFlipped {
    public static int kernighans_algorithm(int n)
    {

        int counter = 0;
        while(n != 0)
        {
           int rmsb = n & -n;
           n-=rmsb;
           counter ++;
        }
        return counter;
    }

    public static int bits_to_be_flipped(int a, int b)
    {
       int result =  kernighans_algorithm(a ^ b );
       System.out.println("Number of bits to be flipped is : "+result);
       return 0;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number :");
        int b = sc.nextInt();
        bits_to_be_flipped(a,b);

    }
}
