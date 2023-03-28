package estruturasDeDados.sortingAlgorithms;

import java.util.*;

public class MapTests {

    public static void main(String[] args){

        Hashtable<Integer, String> hash = new Hashtable<>();
        Map<Integer, String> tree = new TreeMap<>();
        Dog dog1 = new Dog(1);
        Dog dog2 = new Dog(1);
        Dog dog3 = new Dog(3);

        hash.put(1,"tereza");
        hash.put(1,"tereza");
        hash.put(1,"tereza");

        tree.put(1,"tereza");
        tree.put(1,"tereza");
        tree.put(1,"tereza");

        System.out.println("HashMap: ");
        System.out.println(hash.entrySet());
        System.out.println("\nTreeMap: ");
        System.out.println(tree.entrySet());
    }
}
