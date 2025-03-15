package ex_06_Java_IncrementandDecrement;

public class Lab018_IncDec2
{
    public static void main(String[] args) {
        int a=20;
        /*
        EXP A->19 as --a;
        EXP B->19 as a++->20;
        EXP C->20 as a-- ->19
        EXP A+EXP B+ EXP C=19+19+20=58
         */
        System.out.println(--a + a++ + a--);
        System.out.println(a);
    }
}
