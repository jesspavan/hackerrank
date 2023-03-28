package hackerrank;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        char[] palavra = A.toCharArray();
        boolean polindrome =true;
        int j =0;

        /* Enter your code here. Print output to STDOUT. */
        for(int i=palavra.length-1; i>=0; i--){
            if(palavra[j] != palavra[i])
            {
                polindrome =false;
                break;
            }
            j++;
        }

        if(polindrome){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
