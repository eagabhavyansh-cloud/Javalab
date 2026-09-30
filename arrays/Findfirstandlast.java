package arrays;

public class Findfirstandlast {
    public static void main(String[] args) {
        // find the first and last occurrence of an element in an array
        int[] arr = {10, 20, 30, 40, 50, 30, 30};
        int searchElement = 30;
        int firstIndex = -1;
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                lastIndex = i;
            }
        }

        if (firstIndex != -1) {
            System.out.println("First occurrence of element " + searchElement + " is at index: " + firstIndex);
            System.out.println("Last occurrence of element " + searchElement + " is at index: " + lastIndex);
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
    }
}
