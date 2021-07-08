import java.util.Scanner;
public class Non_repeating_element {
    public static int fn_to_find_non_repeating_element(int arr[] , int n)
    {
        int res = arr[0];
        for (int i = 1; i < n; i++)
            res = res ^ arr[i];

        return res;
    }


    public static void main(String args[])
    {

        System.out.println("Enter the Array size : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[10];
        System.out.println("Enter the Array elements : ");
        for (int i =0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Single non repeating element of the given array is : "+fn_to_find_non_repeating_element(arr,n));

    }
}
