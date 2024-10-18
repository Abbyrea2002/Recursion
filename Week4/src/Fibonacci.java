import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    //map which tracks how many times n is called
    private static Map<Integer, Integer> callTracker = new HashMap<>();

    //recursive fibonacci method
    public static int fibonacci(int n){
        //increment the count for n in the map
        callTracker.put(n, callTracker.getOrDefault(n, 0) + 1);
        //base cases
        if (n == 0) return 0;
        if(n == 1) return 1;
        //recursive calls
        return fibonacci(n - 1)  + fibonacci( n - 2);
    }


    public static void main(String[] args){
        //set n to 20
        int n = 20;
        //calls fibonacci function
        fibonacci(n);
        //iterates over the body for each time eac fibonacci term is called
        for(int i = n; i >= 0; i--) {
            //outputs how many times each fib term is called and each fib term using i
            System.out.println(callTracker.get(i)+ " calls to fibonacci(" + i + ")");
        }
    }
}
