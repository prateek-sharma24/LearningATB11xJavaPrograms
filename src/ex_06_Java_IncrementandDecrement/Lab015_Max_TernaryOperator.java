package ex_06_Java_IncrementandDecrement;

public class Lab015_Max_TernaryOperator {
    public static void main(String[] args) {
        int a= Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);
        String result=(a>b)?"number 1 is grater":"number 2 is grater";
        System.out.println(result);

    }
}
