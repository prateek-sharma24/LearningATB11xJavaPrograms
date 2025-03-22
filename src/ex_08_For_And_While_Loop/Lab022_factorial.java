package ex_08_For_And_While_Loop;

import java.util.Scanner;

public class Lab022_factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number you want factorial for");
        int a=scanner.nextInt();
        long factorial=1;
        for (int i=1;i<=a;++i)
        {
            factorial=factorial*i;
            System.out.printf("Factorial of %d = %d",a, factorial);
        }
        scanner.close();
    }
}
