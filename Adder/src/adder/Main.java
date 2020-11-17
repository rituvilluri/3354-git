package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            if (!args[0].matches("^[0-9]+$")) {
            System.err.println("Error: Invalid Character”);
        } else {
            System.err.println("Error: Not enough arguments");
        }
    }
 }

    private static int addArguments(String[] args) {
        int final_result = 0;
         for (int i = 0; i < args.length; i++) {
             final_result = final_result + Integer.valueOf(args[i]);
         }
         return final_result;
     }
 }
