public class SmartlockerSystem {
    static int findfreeslot(int[] occupied) {
        for (int i = 0; i < occupied.length; i++) {
            if (occupied[i] == 0) {
                return i;
            }
        }
        return -1;
    } 
   public static void main(String[] args) {
        int[] occupied = {1, 0, 1, 1, 0, 1};
        int freeSlot = findfreeslot(occupied);
        System.out.println("free slot: " + freeSlot);
       
    } 
}
