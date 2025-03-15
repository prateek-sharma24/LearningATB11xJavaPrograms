package ex_06_Java_IncrementandDecrement;

public class Lab017_IncDec {
    public static void main(String[] args) {
        int a=10;
        /*
        a=10
        EXP A-> ++a=11
        EXP B->11 as a++->12
        EXP C->12 as a++ ->13
        A+B+C=11+11+12=34

         */
        System.out.println(++a + a++ + a++);
        System.out.println(a);
    }
}
