package exercises.classespart1.src.main.java;

public class StudentPractice {
    public static void main(String[] args) {
        //instantiate your Student class below
        Student newStudent = new Student("Ami", 12345, 1, 4.0);
        System.out.println(newStudent.getStudentId());

        /*
         CAN ALSO DO
        Student newStudent = new Student();
        newStudent.setName("Ami");
        newStudent.setStudentId(12345)
        ...
        */

    }
}
