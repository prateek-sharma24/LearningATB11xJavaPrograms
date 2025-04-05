package Lab012_Inheritance.multilevel_inheritance;

public class Lab029_Multi_Level {
    public static void main(String[] args) {
        Son amit =new Son();
        amit.bhk1();
        amit.bhk2();
        amit.bhk3();
        System.out.println(amit.gold_gf);
        Father f9 =new Father();
        f9.home();
        GrandFather gf =new GrandFather();
        gf.home();
        GrandFather grand = new GrandFather();
        grand.home();
    }
}
