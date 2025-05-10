import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveElement solution = new RemoveElement();
        
        int[] nums = {3, 2, 2, 3, 4, 2};
        int val = 2;

        int newLength = solution.removeElement(nums, val);

        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

