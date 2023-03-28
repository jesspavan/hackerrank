package estruturasDeDados.sortingAlgorithms;

public class SelectionSort {

    public static void main(String[] args){

        int[] vector = new int[10];
        int aux, smallestIndex=0;

        for(int i=0; i<vector.length; i++){
            vector[i] = (int) (Math.random() * vector.length);
            System.out.println(vector[i]);
        }

        for(int i =0; i< vector.length; i++){
            smallestIndex = i;
            for(int j=i+1; j< vector.length; j++){
                if(vector[j] < vector[smallestIndex]){
                    smallestIndex = j;
                }
            }
            aux = vector[smallestIndex];
            vector[smallestIndex] = vector[i];
            vector[i] = aux;
        }

        System.out.println("\n\n");
        for(int i=0; i<vector.length; i++){
            System.out.println(vector[i]);
        }

    }

}
