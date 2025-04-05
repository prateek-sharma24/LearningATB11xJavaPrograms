package Lab012_Inheritance;

public class Lab026_Inheritance {

    public void main(String[] args) {
        Father f1= new Father();
        System.out.println(f1.gold_f);
        f1.bh3();
        
        son s1= new son();
        s1.bh3();
        System.out.println(s1.gold_f);
        s1.bh4();
    }
    class Father
    {
        int gold_f=1000;
        void bh3()
    {
        System.out.println("Father-3BHK");
    }
    }
    class son extends Father
    {
        void bh4()
        {
            System.out.println("Son-4BHK");
        }
    }
}
