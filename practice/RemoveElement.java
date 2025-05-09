import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        List<Integer> tmp = new ArrayList<>();
        for (int num : nums) {
            if (num != val) {
                tmp.add(num);
            }
        }
        for (int i = 0; i < tmp.size(); i++) {
            nums[i] = tmp.get(i);
        }
        return tmp.size();
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

