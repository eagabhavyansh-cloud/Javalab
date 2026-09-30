 class CountOccurrence {
    public static void main(String[] args){
        // count the occurrence of an element in an array
        int[] arr = {10, 20, 30, 40, 50, 30, 30};
        int searcpublichElement = 30;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == searchElement){
                count++;
            }
        }
        System.out.println("Element " + searchElement + " occurs " + count + " times in the array.");
    }
}
