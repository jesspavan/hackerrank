package estruturasDeDados;

import java.util.ArrayList;
import java.util.LinkedList;

public class Comparison {

    public static void main(String[] args){

        ArrayList<Integer> array = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        int limitNumber = 100000;
        long initialTime = System.currentTimeMillis();
        long finalTime;
        long totalTime;

        for(int i=0; i<= limitNumber; i++){
            array.add(i);
        }
        finalTime = System.currentTimeMillis();
        totalTime = finalTime - initialTime;
        System.out.println("Time Spent using add the array: "+ totalTime + " ms");

        initialTime = System.currentTimeMillis();
        for(int i=0; i<= limitNumber; i++){
            linkedList.add(i);
        }
        finalTime = System.currentTimeMillis();
        totalTime = finalTime - initialTime;
        System.out.println("Time Spent using add the linked list: "+ totalTime + " ms");

        initialTime = System.currentTimeMillis();
        for(int i=0; i< array.size(); i++){
            array.get(i);
        }
        finalTime = System.currentTimeMillis();
        totalTime = finalTime - initialTime;
        System.out.println("Time Spent using get in the array: "+ totalTime + " ms");

        initialTime = System.currentTimeMillis();
        for(int i=0; i< linkedList.size(); i++){
            linkedList.get(i);
        }
        finalTime = System.currentTimeMillis();
        totalTime = finalTime - initialTime;
        System.out.println("Time Spent using get in the linked list: "+ totalTime + " ms");

    }
}
