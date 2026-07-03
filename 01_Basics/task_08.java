// Task: Calculate simple interest and compound interest.

public class task_08 {
    public static void main(String[] args) {

        double principal = 1000.0;
        double rate = 5.0;
        double time = 2.0;
        
        double simpleInterest = (principal * rate * time) / 100;
        double compoundInterest = principal * Math.pow((1 + rate / 100), time) - principal;
        
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);
    }
}