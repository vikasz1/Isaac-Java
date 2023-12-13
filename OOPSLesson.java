
class Parent{
    public String eyeColor = "Blue";
    int height = 180;
    public void swimming(){
        System.out.println("Parent gene has swimming");
    }
}

class Children extends Parent{
    
}

public class OOPSLesson {
    public static void main(String[] args) {
        Children vikas = new Children();
        System.out.println(vikas.eyeColor);
        
    }
}








class Student {
    String name;
    int age;

    // this is a constructor Student
    Student(String GivenName, int GivenAge) {
        this.name = GivenName;
        this.age = GivenAge;
        System.out.println("I am two argument constructor");
    }

    Student(String GivenName) {
        this.name = GivenName;
        System.out.println("I am one argument constructor");
    }
}