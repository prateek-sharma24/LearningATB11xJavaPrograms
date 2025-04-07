package ex_OOPS_Super;

public class Lab_OOPS_Super {

}
class God{
    void sound()
    {
        System.out.println("god");
    }
}
class Animal extends God
{
    protected String color = "White";

    void sound()
    {
        System.out.println("Animal sound");
        super.sound();
    }
}
class Dog extends Animal
{
    private String color ="Brown";
    Dog()
    {
        //super
    }
    void display()
    {
        System.out.println(this.color);
        System.out.println(super.color);
        super.sound();
    }
}

