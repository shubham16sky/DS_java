import java.util.Scanner;
public class Clear_Ith_Bit {
    public static int fn_to_clear_Ith_bit(int n, int i)
    {

        int temp = 1<<i;
        int mask = ~(temp);
        int new_number = n & mask;

        System.out.printf("The Number obtained after clearing the bit is :"+new_number);
        return  0;
    }
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the given number :");
       int n = sc.nextInt();
        System.out.println("Enter the position of the bit to be cleared :");
       int i = sc.nextInt();
        fn_to_clear_Ith_bit(n,i);

    }
}
