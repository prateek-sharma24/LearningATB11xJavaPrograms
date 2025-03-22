package ex_09_Coding_Questions;

import java.util.Scanner;

public class Lab024_Vowels {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=scanner.nextLine();
        scanner.close();
        IsVowelConsonants(word);
    }
    public static void IsVowelConsonants(String str)
    {
        int Vowelcount =0;
        int Consonantcount =0;
        str = str.toLowerCase();
    for (int i=0;i<str.length();i++)
        {
         char ch= str.charAt(i);
         if (Character.isLetter(ch))
         {
            if ("aeiou".indexOf(ch)!=-1)
            {
                Vowelcount++;
            }
            else {
                Consonantcount++;
            }
         }

        }
        System.out.println("Vowels count is"+ Vowelcount);
        System.out.println("Consonants count is "+ Consonantcount);
    }

}
