class Student {
    String name;
    int age;
    Student() {
        name = "Sherly";
        age = 19;
        System.out.println("Default constructor called!");
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class DefaultConstructorExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}

