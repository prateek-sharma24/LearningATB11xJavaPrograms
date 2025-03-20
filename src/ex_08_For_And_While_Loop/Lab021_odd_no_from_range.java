package ex_08_For_And_While_Loop;

import java.util.Scanner;

public class Lab021_odd_no_from_range {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter min range");
        int a= scanner.nextInt();

        System.out.println("Enter max range");
        int b=scanner.nextInt();

        while (a<=b)
        {
            if (a%2 !=0)
            {
                System.out.println(a);
            }
            a++;
        }
        scanner.close();
    }
}
