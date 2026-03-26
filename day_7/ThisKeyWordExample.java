package DAY_7.VsCode;

class Student{
    String name;
    String rollno;
    Student(String name,String rollno){
        this.name=name;
        this.rollno=rollno;
    }
    void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Roll No: " + this.rollno);
    }
}
public class ThisKeyWordExample {
    public static void main(String[] args) {
        Student s1=new Student("Sugasri", "24cs365");
        s1.display();
        System.out.println(s1.hashCode());
        Student s2=new Student("Sugasri", "24cs365");
        s2.display();
        System.out.println(s2.hashCode());
    }
}

