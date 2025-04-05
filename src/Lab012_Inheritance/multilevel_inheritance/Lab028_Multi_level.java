package Lab012_Inheritance.multilevel_inheritance;

public class Lab028_Multi_level {
    public static void main(String[] args) {
        Son amit =new Son();
        GrandFather g2 =new Son();
        g2.bhk1();
        g2.home();
        GrandFather g3= new Father();
        g2.home();
      GrandFather g4 =new Son();

        g2.home();
    }

}
