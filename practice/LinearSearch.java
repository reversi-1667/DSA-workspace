import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int f=0;
        for(int i=0;i<arr.length;i++)
        {
            if(n==arr[i])
            {
                System.out.println("element is at index "+ i);
                f=1;
                break;
            }

        }
        if(f==0)
            System.out.println("element does not exist");

    }
}
