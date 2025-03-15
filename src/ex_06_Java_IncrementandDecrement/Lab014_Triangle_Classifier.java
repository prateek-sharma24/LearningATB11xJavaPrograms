package ex_06_Java_IncrementandDecrement;

import java.util.Scanner;

public class Lab014_Triangle_Classifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of side a");
        int a= scanner.nextInt();
        System.out.println("Enter length of side b");
        int b=scanner.nextInt();
        System.out.println("Enter length of side c");
        int c=scanner.nextInt();
        if (a==b && b==c)//condition for equilateral triangle
        {
            System.out.println("this is a equilateral triangle");
        } else if (a==b)//condition for isosceles triangle
        {
            System.out.println("This is a isosceles triangle");
        }
        else {//condition for scalene triangle
            System.out.println("This is a scalene triangle");
        }
    }
}
