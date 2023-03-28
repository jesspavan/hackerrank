package estruturasDeDados;

public class CallStack {

    public static void main(String[] ard){
         StackManufacture stack = new StackManufacture();

         stack.push("E");
         stack.push("B");
         stack.push("Z");
         stack.push("C");

         System.out.println("Top: " + stack.get());
         stack.pop();
         System.out.println("New Top: " + stack.get());

    }
}
