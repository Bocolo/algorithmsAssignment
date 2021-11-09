import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.print("Please the number you would like fibonaccied: ");
        int fibNumber = myObj.nextInt();
        int maxFib = 0;

        int start = 0;
        int nextNumber = 1; 
        // int one= 1;
        List<String> fiblist = new ArrayList<>();
        ///if clause here for < than 2 /1 
        fiblist.add(Integer.toString(start));
        if(fibNumber>1){
        fiblist.add(Integer.toString(nextNumber));

        }
        int[] fibonacci;
        while((maxFib+nextNumber)<=fibNumber){
            // System.out.println("\n\n" +maxFib +" <-Fib ...BEFRORE FIB CHANGE... -> Next" +nextNumber);
            maxFib += nextNumber;
            fiblist.add(Integer.toString(maxFib));
            // System.out.println(maxFib +" <-Fib ...AFTER FIB CHANGE: BEFORE NN CHANGE... -> Next" +nextNumber);
            if((maxFib+nextNumber)<=fibNumber){
            nextNumber+=maxFib;
            fiblist.add(Integer.toString(nextNumber));
            // System.out.println(maxFib +" <-Fib ...AFTER NN CHANGE... -> Next" +nextNumber);
            }
            System.out.println(maxFib +" <-Fib ...... -> Next" +nextNumber+"\n\n");
        }
        System.out.print(fiblist);
        myObj.close();
    }
    public static void returnFibonacci(){
        
    }
}

