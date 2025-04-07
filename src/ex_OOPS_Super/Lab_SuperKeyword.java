package ex_OOPS_Super;

public class Lab_SuperKeyword {
    public static void main(String[] args) {
        car c1 = new car();
        c1.display();

    }
}
class vehicle
{
    public int maxSpeed =180;
    vehicle()
    {
        System.out.println("default constructor");
    }
    vehicle(int a)
    {
        System.out.println("Parameterized Constructor");
    }
    //Method Overloading-same name, same function with different arguments
    void message()
    {
        System.out.println("no return and no arguments");
    }
    void  message(int a)
    {
        System.out.println("Parameterized constructor with argument");
    }
    void display()
    {
        System.out.println("Vehicle parent");
    }

    }
    class car extends vehicle
    {
        private int maxSpeed=400;
        public  int getMaxSpeed()
        {
            return maxSpeed;
        }
        public void setMaxSpeed()
        {
            this.maxSpeed=maxSpeed;
        }
        car()
        {
            super();//Default constructor of parent
        }
        car(int a )
        {
            super(10);//Parametrized constructor of parent
        }
        // Method Overloading
        @Override
        void display()
        {
            System.out.println(this.maxSpeed);
            //parent
            System.out.println(super.maxSpeed);
            super.message();
            super.message(10);
            super.display();
            System.out.println("Override");
        }
    }

