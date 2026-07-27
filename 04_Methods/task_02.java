// Task: Method overloading for area calculations (circle, rectangle, triangle).

public class task_02 {
    
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static double area(double length, double width) {
        return length * width;
    }

    public static double area(double base, double height, boolean isTriangle) {
        if(isTriangle) {
            return 0.5 * base * height;
        }
        return base * height;
    }

    public static void main(String[] args) {

        System.out.println("Circle Area: " + area(5.0));
        System.out.println("Rectangle Area: " + area(4.0, 6.0));
        System.out.println("Triangle Area: " + area(3.0, 8.0, true));
    }
}