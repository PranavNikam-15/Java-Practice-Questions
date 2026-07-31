// Task: Generate power set (all subsets) recursively.

public class task_14 {

    public static void generateSubsets(String str, String current, int index) {
        
        if(index == str.length()) {
            System.out.println("{" + current + "}");
            return;
        }

        generateSubsets(str, current + str.charAt(index), index + 1);
        generateSubsets(str, current, index + 1);
    }

    public static void main(String[] args) {

        String setStr = "ABC";
        
        System.out.println("Subsets of " + setStr + ":");
        generateSubsets(setStr, "", 0);
    }
}