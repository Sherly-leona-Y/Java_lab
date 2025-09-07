class Friend {
    private String name;
    private int age;
    Friend() {
        this.name = "Sophia";  
        this.age = 0;
    }
    Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
public class EncapsulationConstructorExample {
    public static void main(String[] args) {
        Friend f1 = new Friend();
        System.out.println("Default -> Name: " + f1.getName() + ", Age: " + f1.getAge());
        Friend f2 = new Friend("Lara", 20);
        System.out.println("Parameterized -> Name: " + f2.getName() + ", Age: " + f2.getAge());
        f1.setName("Daniela");
        f1.setAge(18);
        System.out.println("After setters -> Name: " + f1.getName() + ", Age: " + f1.getAge());
    }
}
