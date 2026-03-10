package Array;

class Student{
    String name;
    int age;
    int marks;
}
public class Array_of_Objects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 15;
        s1.name = "Isha";
        s1.marks = 78;

        Student s2 = new Student();
        s2.age = 18;
        s2.name = "Tina";
        s2.marks = 99;

        Student s3 = new Student();
        s3.age = 26;
        s3.name = "Raj";
        s3.marks = 98;

        Student stud_array[] = new Student[3];
        stud_array[0] =s1;
        stud_array[1]= s2;
        stud_array[2]= s3;

        for(int i= 0; i<stud_array.length; i++){
            System.out.println(stud_array[i].name+ ": " +stud_array[i].age+ ": " +stud_array[i].marks);
        }
    }
}
