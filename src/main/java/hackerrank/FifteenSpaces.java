package hackerrank;

import java.util.Scanner;

public class FifteenSpaces {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================================");

        for(int i=0; i<3; i++){

            String string = scanner.next(); //vai pegar a string até o primeiro espaço
            int x = scanner.nextInt();

        //    System.out.println(string);
         //   System.out.println(x);

            if(string.length() > 10 || (x<0) || (x>999)){
                break;
            }else{
                String formatted = String.format("%03d", x);
                System.out.printf("%-15s%s\n", string, formatted);
            }

        }

        System.out.println("================================================");
    }
}
