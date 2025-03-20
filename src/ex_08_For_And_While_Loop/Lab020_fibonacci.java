package ex_08_For_And_While_Loop;

import java.util.Scanner;

public class Lab020_fibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int a=0;
        int b=1;
        System.out.print("Series "+a+","+b);
        for (int i=2;i<number;i++)
        {
            int c=a+b;
            System.out.print(","+c);
            a=b;
            b=c;
        }
        scanner.close();

    }
}
