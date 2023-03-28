package estruturasDeDados.sortingAlgorithms;

public class BubbleSort {

    public static void main(String[] args){

        int[] vector = new int[10];
        int aux, biggest=0, smallest=0;

        for(int i=0; i<vector.length; i++){
            vector[i] = (int) (Math.random() * vector.length);
            System.out.println(vector[i]);
        }

        for(int i =0; i< vector.length; i++){
            for(int j=i+1; j< vector.length; j++){

                if(vector[j] < vector[i]){
                    aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;

                }
            }
        }

        System.out.println("\n\n");
        for(int i=0; i<vector.length; i++){
            System.out.println(vector[i]);
        }

    }
}
