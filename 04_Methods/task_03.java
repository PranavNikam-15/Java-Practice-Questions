// Task: Demonstrate pass-by-value behavior for primitives vs object references.

class NumberContainer {
    int value;
    NumberContainer(int val) {
        this.value = val;
    }
}

public class task_03 {

    public static void modifyPrimitive(int a) {
        a = a + 10;
    }

    public static void modifyReference(NumberContainer obj) {
        obj.value = obj.value + 10;
    }

    public static void main(String[] args) {

        int primitiveVal = 5;

        modifyPrimitive(primitiveVal);
        System.out.println("Primitive after method call: " + primitiveVal);

        NumberContainer objVal = new NumberContainer(5);
        
        modifyReference(objVal);
        System.out.println("Object field after method call: " + objVal.value);
    }
}