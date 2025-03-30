package ex_011_class;

class Person {
    String name;
    //String mobileNo;
    //double weight;
   // float height;
    //int legs;
    double salary;
    byte age;
    String degree;
    //boolean isMale;
    boolean isMarried;

    void sleep() {
        System.out.println("Person is sleeping");
    }

    boolean married() {
        isMarried = true;
        System.out.println("Is Married: " + isMarried);
        return isMarried;
    }

    void introduceYourself(String name, int age, double salary) {
        System.out.println("Your name is: " + name + ", My age is: " + age + ", My salary is: " + salary);
    }

    String highestDegree(String degree) {
        System.out.println("Your highest degree is: " + degree);
        return degree;
    }
}

public class Lab026_classes {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.sleep();
        p1.married();
        p1.introduceYourself("John", 30, 50000);
        p1.highestDegree("Master's");
    }
}
