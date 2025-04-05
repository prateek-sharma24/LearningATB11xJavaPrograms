package Lab012_Inheritance.multilevel_inheritance;



public class Lab027_Multi_Level {
    public static void main(String[] args) {
        GrandFather gf=new GrandFather();
        gf.bhk1();
        System.out.println("----------------");
        Father fa =new Father();
        fa.bhk2();
        System.out.println("------------------");
        Son so =new Son();
        so.bhk3();
        so.bhk2();
        so.bhk1();
    }
}
