package estruturasDeDados.sortingAlgorithms;

public class InsertionSort {

    public static void main(String[] args){

        int[] vector = new int[10];

        for(int i=0; i< vector.length; i++){
            vector[i] = (int) (Math.random() * vector.length);
            System.out.println(vector[i]);
        }

        int aux, j;

        // 33 - 4 - 3 - 10 - 20 - 5 - 9-7
        //aux = 4
        for(int i=1; i< vector.length; i++){
            aux = vector[i];
            j= i-1;
            while(j>=0 && j>aux){
               vector[j+1] = vector[j];
               j--;
            }
           vector[j+1] = aux;
        }

        System.out.println("\n\n");
        for(int i=0; i< vector.length; i++){
            System.out.println(vector[i]);
        }

    }
}
