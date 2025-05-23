import java.util.*;

public class CollectionsPractice {
    public static void main(String[] args) {

        System.out.println(" remove duplicates without loop");
        int[] a={1,2,3,4,5,3,2};
        ArrayList<Integer> li = new ArrayList<>();
        for(int nums: a)
            li.add(nums);
        System.out.println(li);
        Set<Integer> hs= new HashSet<Integer>(li);
        System.out.println(hs);

        System.out.print("\n count of unique elements ");
        System.out.println(hs.size());

//        System.out.println("\n frequency puzzle");
//        List<String> fruits= new ArrayList<String>(Arrays.asList("apple","banana","apple","orange"));
//        fruits.add

        System.out.println("intersection of 2 lists");
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6, 7));
        System.out.println(list1);
        System.out.println(list2);
        list1.retainAll(list2);
        System.out.println(list1);
    }
}

//Task 1: 
//Remove Duplicates without Loop: 
//List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5);
//
//Task 2: 
//Count Unique Elements
//List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5);
//
//Task 3: 
//Frequency Puzzle:
//List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
//
//Task 4: 
//
//Intersection of Two Lists
//List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
//List<Integer> list2 = Arrays.asList(4, 5, 6, 7);
