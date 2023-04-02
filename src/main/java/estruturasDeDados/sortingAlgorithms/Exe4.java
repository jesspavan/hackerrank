package estruturasDeDados.sortingAlgorithms;

public class Exe4 {

    public static void main(String[] args){

        int[] spells = {5, 1, 3, 0};
        int[] potions = {1, 2, 3, 4, 5, 0};
        long success = 1651505078;
        int[] pairs = new int[spells.length];
        pairs = successfulPairs(spells, potions, success);

        for(int i=0; i<pairs.length; i++){
            System.out.println(pairs[i]);
        }

    }

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {

        int[] pairs = new int[spells.length];
        long product = 0;

        for(int i=0; i <spells.length; i++){

            for(int j=0; j < potions.length; j++){

                product = spells[i] * potions[j];
                if(product >= success){
                    pairs[i]++;
                }
            }
        }

        return pairs;
    }
}
