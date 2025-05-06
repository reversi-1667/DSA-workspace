import java.util.Scanner;

public class SecondLargestNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int max=Integer.MIN_VALUE;
        int sec_max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max) {
                sec_max = max;
                max = arr[i];
            }
            else if(arr[i]>sec_max)
            {
                sec_max=arr[i];
            }
        }
        System.out.println(sec_max);
    }
}
