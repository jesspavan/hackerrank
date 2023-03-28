package estruturasDeDados;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        LinkedList<String> lista = new LinkedList<String>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What state abbreviation do you want?");
        String stateAbbreviation = scanner.nextLine();
        System.out.println(stateAbbreviation);

        String[] stringVector = new String[10];
        stringVector[0] = "AC";
        stringVector[1] = "BA";
        stringVector[2] = "CE";
        stringVector[3] = "DF";
        stringVector[4] = "AM";
        stringVector[5] = "AP";
        stringVector[6] = "PB";
        stringVector[7] = "RN";
        stringVector[8] = "MS";
        stringVector[9] = "SP";

        boolean youHaveFound = false;

        for(int i=0; i<stringVector.length; i++){
            String element = stringVector[i];

            // when I am comparing strings, I need to use equals and not ==
            if(element.equalsIgnoreCase(stateAbbreviation)){
                youHaveFound = true;
                System.out.println("You have found!");
                break;
            }
        }

        if(!youHaveFound){
            System.out.println("It didn't find!");
        }

//        int[] intVector = new int[10];
//        intVector[0] = 1;
//        intVector[1] = 2;
//        intVector[2] = 3;
//        intVector[3] = 4;
//        intVector[4] = 5;
//        intVector[5] = 6;
//        intVector[6] = 7;
//        intVector[7] = 8;
//        intVector[8] = 9;
//        intVector[9] = 10;
//
//        for (int i = 0; i < intVector.length; i++){
//            System.out.println(intVector[i]);
//        }

    }


}
