// class students{
//     static String collegeName = "OxFord College";
//     int rollno;
//     String name;
//     students(int rollno, String name){
//         this.rollno = rollno;
//         this.name = name;
//     }
//     void display(){
//         System.out.println(collegeName+" "+ rollno + " " + name);
//     }
// }


// public class StaticDemo {
//     public static void main(String[] args) {
//         students s1 = new students(19, "Saif");
//         students s2 = new students(34, "Joel");
//         s1.display();
//         s2.display();
//         s1.collegeName = "Cambrige College";
//         s1.display();
//         s2.display();
        
//     }
// }

class Student{
    static String collegeName = "CFA";
    int rollno;
    String name;

    Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
    void display(){
        System.out.println("Rollno: "+rollno+ " Student Name: "+ name +" College Name: " + collegeName);
    }


}
class StaticDemo{
    public static void main(String[] args) {
        Student s1 = new Student(1, "saif");
        Student s2 = new Student(2, "Safir");
        s1.display();
        s2.display();
        s1.collegeName = "Oxford";
        s1.display();
        s2.display();

    }
}
