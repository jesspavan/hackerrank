package estruturasDeDados.sortingAlgorithms;

import java.util.Iterator;
import java.util.TreeSet;

public class IteratorExample {

    public static void main(String[] args) {
        TreeSet<Dog> dset = new TreeSet<Dog>();
        dset.add(new Dog(2));
        dset.add(new Dog(1));
        dset.add(new Dog(3));

        Iterator<Dog> iterator = dset.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
