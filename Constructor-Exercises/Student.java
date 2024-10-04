public class Student {
   private String studentID;
   private String studentName;
   private int grade;
   
   public Student() {
      this("21414135","Missing in Action", 75);
   }
   
   public Student(String studentID, String studentName, int grade) {
      this.studentID = studentID;
      this.studentName = studentName;
      this.grade = grade;
   }
   
   public static void main(String[] a) {
      Student student1 = new Student();
      System.out.println("\nFirst student details: \nStudent ID: "+student1.studentID+"\nStudent Name: "+student1.studentName+"\nStudent's Grade: "+student1.grade);
      
      Student student2 = new Student("21411152", "Arvin S. Albeos", 99);
      System.out.println("\nFirst student details: \nStudent ID: "+student2.studentID+"\nStudent Name: "+student2.studentName+"\nStudent's Grade: "+student2.grade);
   }
}