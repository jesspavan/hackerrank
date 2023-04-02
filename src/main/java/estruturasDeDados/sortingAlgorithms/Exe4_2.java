package estruturasDeDados.sortingAlgorithms;

import java.util.Arrays;

//2300. Successful Pairs of Spells and Potions
public class Exe4_2 {

    public static void main(String[] args){

        int[] spells = {5, 1, 3, 0};
        int[] potions = {1, 2, 3, 4, 5, 0};
        long success = 15;
        int[] pairs = new int[spells.length];
        pairs = successfulPairs(spells, potions, success);

        for(int i=0; i<pairs.length; i++){
            System.out.println(pairs[i]);
        }

    }

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {

        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];
        Arrays.sort(potions);

        for (int i = 0; i < n; i++) {
            int spell = spells[i];
            int left = 0;
            int right = m - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                long product = (long) spell * potions[mid];
                if (product >= success) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            pairs[i] = m - left;
        }
        return pairs;
    }
}
