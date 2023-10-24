public class Main {
    public static void main(String[] args) {

        //objects
        Student s1 = new Student(1,"KV",100);
        Student s2 = new Student(1,"KV",100);
        if(!s2.equals(s1))
            System.out.println(s1.roll+" "+s1.name+" "+s1.marks);
    }
}

class Student{
    int roll;
    String name;
    float marks;
    Student(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}