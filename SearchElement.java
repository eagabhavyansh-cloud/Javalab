public class SearchElement {
     public static void main(String[] args){
        // search an element in an array
        int[] arr = {10, 20, 30, 40, 50};
        int searchElement = 30;
        boolean found = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == searchElement){
                found = true;
                break;
            }
        }
        System.out.println(found ? "Element found" : "Element not found");
    }
}
