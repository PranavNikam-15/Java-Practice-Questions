// Task: Demonstrate scope with static and instance variables.

public class task_16 {

    static int staticCount = 0;
    int instanceCount = 0;

    public void increment() {
        staticCount++;
        instanceCount++;
    }

    public void display() {
        System.out.println("Static Count: " + staticCount + ", Instance Count: " + instanceCount);
    }

    public static void main(String[] args) {
        
        task_16 obj1 = new task_16();
        task_16 obj2 = new task_16();

        obj1.increment();
        obj1.display();

        obj2.increment();
        obj2.display();
    }
}