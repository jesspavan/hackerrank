package estruturasDeDados;

public class SomaRecursiva {

    public static void main(String[] args){

        int[] vector = new int[5];

        for(int i=0; i< vector.length; i++){
            vector[i] = (int) (Math.random() * vector.length);
            System.out.println(vector[i]);
        }

        int sum = sum(0, 0, vector);
        System.out.println("Sum: "+sum);
    }

    public static int sum(int sum, int index, int[] vector){
        if(index < vector.length){
            sum += vector[index];
            return sum(sum, index+1, vector);
        }else{
            return sum;
        }

    }
}
