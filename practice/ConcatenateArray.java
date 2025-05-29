public class ConcatenateArray {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            ans[k] = nums[i];
            k++;
            if (k == nums.length)
                i = -1;
        }
        return ans;
    }

    public static void main(String[] args) {
        ConcatenateArray obj = new ConcatenateArray();
        int[] nums = {1, 2, 1};
        int[] result = obj.getConcatenation(nums);

        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

