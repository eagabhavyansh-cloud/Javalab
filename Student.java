public class Student {
    public void displayStudent() {
        System.out.println("-------------Student Details --------");
        System.out.println("Student ID         :"+ studentId);
        System.out.println("Student Name       :"+ studentName);
        System.out.println("Department         :" + department );
        System.out.println("Mobile             :" + mobile);

    }
    public static void main(String[] args)
    {
        Student s = new Student();

        // Direct Input
        s.studentId = 2620030142;
        s.studentName = "Bhavyansh";
        s.department = "CSE";b
        s.mobile = "9876543210";

         s.dispalyStudent()

    }
      
}
