public class StudMarks {
    public static void main(String[] args)
    {
        int[] marks = {70,45,80,35,90};
        System.out.println("Student Marks:");
        for (int i =0; i < marks.length; i++){
            System.out.println(marks[i]);


        }int search = 80;
    for (int i = 0; i < marks.length; i++){
        if (marks[i] == search){
            System.out.println("80 found at index ");
    }
        }

    int count =0;
    for (int i = 0 ; i < marks.length; i++){
        if (marks[i] >= 40 )
        {count++;}
    }
 System.out.println(count);
 int highest = marks[0];
 int lowest = marks [0];
 for ( i = 1; i < marks.length; i++) {
    if (marks[i] > highest) {
        highest = marks[1];

    }if (marks[i] < lowest) {
        lowest = marks[i];
    }
    System.out.println("highest marks;" + highest );
    System.out.println("lowest marks" + lowest);

 }



         

        
    
}
