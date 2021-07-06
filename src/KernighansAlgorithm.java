import java.util.Scanner;


public class KernighansAlgorithm {
    public static int kernighans_algorithm(int n)
    {
        int counter=0;
        while (n!=0)
        {
            int rmsb = n & -n;
            n-=rmsb;
            counter++;
        }
        return counter;
    }
    public static int counter_return(int n)
    {
        return kernighans_algorithm(n);
    }

    public static void main(String args[])
    {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("The number of set bits in "+n+"is ");
        System.out.print(counter_return(n));
    }
}
