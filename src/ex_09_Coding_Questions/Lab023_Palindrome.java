package ex_09_Coding_Questions;

import java.util.Scanner;

public class Lab023_Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word=scanner.nextLine();
        scanner.close();
        if (isPalindrome(word))
        {
            System.out.println(word + "is a palindrome");
        }
        else
        {
            System.out.println(word + "is not a palindrome");
        }




    }
    public static boolean isPalindrome(String str)
    {
        int length = str.length();
        //Compare characters from start to end
        for (int i=0;i<length/2;i++)
        {
            if (str.charAt(i) != str.charAt(length-1-i))
            {
                return false; //if it doesn't match then it is not a palindrome
            }


        }
        return true;//if it matches then it is a palindrome
    }

}
