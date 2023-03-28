package estruturasDeDados;

import java.util.LinkedList;

public class StackManufacture {

    private LinkedList linkedList;

    public void push(String newValue){
        this.linkedList.addFirst(newValue);
    }

    public void pop(){
        this.linkedList.remove(this.get());
    }

    public String get(){
        return this.linkedList.getFirst().toString();
    }
}
