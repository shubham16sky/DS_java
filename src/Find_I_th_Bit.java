import java.util.Scanner;

public class Find_I_th_Bit {
        public static int find_the_I_th_bit(int n , int i){

                int mask = 1<<(i-1);
                if ((n & mask) > 0)
                {
                        System.out.println("Set");
                } else
                {
                      System.out.println("Not Set");
                }
                return 0;
        }
        public static void main(String args[])
        {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number :");
               int n = sc.nextInt();
                System.out.println("Enter the value of i (Index of bit to be checked) :");
               int i = sc.nextInt();
                find_the_I_th_bit(n,i);
        }
}
