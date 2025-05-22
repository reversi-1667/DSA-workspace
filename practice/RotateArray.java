public class RotateArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
        for(int i:nums)
            System.out.print(i);
    }

    // for(int i=0;i<k;i++)
    // {
    //     int temp=nums[nums.length-1];
    //     for(int j=nums.length-2;j>=0;j--)
    //     {
    //         nums[j+1]=nums[j];
    //     }
    //     nums[0]=temp;
    // }

    public static void rotate(int[] nums, int k)
    {
        while(k>nums.length)
    {
        k=k-nums.length;
    }
    transform(0,nums.length-k-1,nums);
    transform(nums.length-k,nums.length-1,nums);
    transform(0,nums.length-1,nums);

}
public static void transform(int a, int b, int[] arr)
{
    int temp=0;
    while(a<b)
    {
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        a++;
        b--;
    }
}
}
