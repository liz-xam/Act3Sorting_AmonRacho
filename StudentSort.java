import java.util.Scanner;

class Student{
    String name;
    double grade;

    public Student(String name, double grade){
        this.name=name;
        this.grade=grade;
    }
    public String toString(){
        return name+": "+grade;
    }
}
class StudentSorter{
public static void bubbleSort(Student[] arr){
    int n=arr.length;
    for(int i=0; i<n-1; i++){
        for(int j=0; j<n-i-1; j++){
            if (arr[j].grade > arr[j+1].grade){
                Student temp = arr[j];
                arr [j]= arr[j+1];
                arr [j+1] =temp;
            }
        }
    }
}
}

public class StudentSort {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("How many students?");
        int numstudent = s.nextInt();
        s.nextLine();

        Student[] students = new Student[numstudent];
        

        for(int i=0; i<numstudent; i++){
            System.out.println("Enter details for student #"+(i+1));
            System.out.print("Name: ");
            String name = s.nextLine();
            System.out.print("Grade: ");
            double grade = s.nextDouble();
            s.nextLine();
            students [i] = new Student(name, grade);

        }
        StudentSorter.bubbleSort(students);

        System.out.println("Sorted Students by Grade(Ascending):");
        for(Student student : students){
            System.out.println(student.name+" - "+student.grade);
        }
        s.close();
    }
}
