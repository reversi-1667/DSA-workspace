public class ArrayListDesign {
    public static void main(String[] args)
    {
        DynamicArray da= new DynamicArray(2);
        da.pushback(10);
        da.pushback(20);
        da.pushback(30);
        System.out.println("Element at index 0: " + da.get(0));
        System.out.println("Element at index 1: " + da.get(1));
        System.out.println("Element at index 2: " + da.get(2));

        da.set(1, 99);
        System.out.println("After setting index 1 to 99: " + da.get(1));
        System.out.println("Size: " + da.getSize());
        System.out.println("Capacity: " + da.getCapacity());
        da.popback();
        System.out.println("Size after popback: " + da.getSize());
    }

}
