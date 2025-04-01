package Tasks;

public class Task_01_Constructor {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.printDetails();

        Person p2 = new Person("Ram Lal", 32, "Chandigarh","9876545830", true);
        p2.eat();
        p2.sleep();
        p2.walk();
        p2.doHome();
        p2.printDetails();
    }
}

class Person {
    String name;
    int age;
    String address;
    String phone;
    boolean isMale;

    // Default Constructor
    Person() {
        this.name = "Prateek";
        this.age = 32;
        this.address = "Chandigarh, Union Territory";
        this.phone = "984525695";
        this.isMale = true;
    }

    // Parameterized Constructor
    Person(String name, int age, String address, String phone, boolean isMale) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.isMale = isMale;
    }

    void eat() {
        System.out.println(this.name + " is eating.");
    }

    void sleep() {
        System.out.println(this.name + " is sleeping.");
    }
    void walk()
    {
        System.out.println(this.name + "is walking");
    }
    void doHome()
    {
        System.out.println(this.name + "is doing home work");
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Are you male? " + isMale);
    }
}
