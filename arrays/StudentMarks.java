package arrays;

class StudentMarks {
    public static void main(String args[]){
        int[] marks = {20,30,10,10,30};
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }
        System.out.println("Total marks: " + total);
    }
}
