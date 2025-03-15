package ex_06_Java_IncrementandDecrement;

import java.util.Scanner;

public class Lab016_NameAgeSalary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("My Name is ");
        String Name= scanner.nextLine();
        System.out.println("My Age is ");
        Integer Age=scanner.nextInt();
        System.out.println("My salary is ");
        Float Salary=scanner.nextFloat();
        System.out.println(Name);
        System.out.println(Age);
        System.out.println(Salary);

    }
}
