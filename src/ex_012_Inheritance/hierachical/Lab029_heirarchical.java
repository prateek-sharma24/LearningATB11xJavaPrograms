package ex_012_Inheritance.hierachical;



public class Lab029_heirarchical {
    public static void main(String[] args) {
        fther f1 = new fther();
        f1.f();
        Prateek p1 = new Prateek();
        p1.p();
        p1.f();
        Stuti s1 = new Stuti();
        s1.s();
        s1.f();
        Jyoti j1 = new Jyoti();
        j1.j();
        j1.f();


    }
}
    class  fther
    {
        void f()
        {
            System.out.println("3BHK");
        }
    }
    class Prateek extends fther

    {
        void p()
        {
            System.out.println("h2-Prateek");
        }
    }
    class Stuti extends fther
    {
        void s()
        {
            System.out.println("h3-Stuti");
        }
    }
    class Jyoti extends fther
    {
        void j()
        {
            System.out.println("h4-Jyoti");
        }
    }

