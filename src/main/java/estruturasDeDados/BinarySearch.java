package estruturasDeDados;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args){

        System.out.println("What value do you want?");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        boolean itHasFound = false;
        int[] vector = new int[1000000000];
        int initialIndex = 0, finalIndex = vector.length -1 , middleIndex=0;
        long initialTime, finalTime, totalTime;
        int valueFound = 0;

        for(int i=0; i<vector.length; i++){
            vector[i] = i*2;
        }

        initialTime = System.currentTimeMillis();
        while(initialIndex <= finalIndex){
            middleIndex = (int) ((finalIndex + initialIndex) / 2);
            if(vector[middleIndex] == value){
                valueFound = vector[middleIndex];
                itHasFound = true;
                break;
            }else if(value < vector[middleIndex]){
                finalIndex = middleIndex - 1;
            }else{
                initialIndex = middleIndex + 1;
            }
        }
        finalTime = System.currentTimeMillis();
        totalTime = finalTime - initialTime;

        if(itHasFound){
            System.out.println("Searched value found in binary search: " + valueFound);
        }else{
            System.out.println("Value not found: " + valueFound);
        }
        System.out.println("Tempo total: " + totalTime + " ms");

        /////////////////////////////////////////////////////////////////

        itHasFound = false;
        initialTime = System.currentTimeMillis();
        for(int i=0; i< vector.length; i++){
            if(vector[i] == value){
                valueFound = vector[i];
                itHasFound = true;
                break;
            }
        }
        finalTime = System.currentTimeMillis();
        totalTime = finalTime - initialTime;

        if(itHasFound){
            System.out.println("Searched value found in linear search: " + valueFound);
        }else{
            System.out.println("Value not found: " + valueFound);
        }

        System.out.println("Tempo total: " + totalTime + " ms");

    }
}
