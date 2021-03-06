import java.util.*;
public class FibonacciWithRecursion {
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.print("Please the number you would like fibonaccied: ");
        int fibNumber = myObj.nextInt();
        System.out.println(FibNum(fibNumber));
        System.out.println(Arrays.toString(FibNum2(fibNumber)));
        myObj.close();
    }
    //fibbing to nth element
    public static int[] FibNum2(int fibNumber){
         int[] fibArray = new int[fibNumber];
        for(int j=0; j<fibNumber;j++){
            fibArray[j] = FibonacciNumber2(j);
        }
        System.out.println(Arrays.toString(fibArray));
        return fibArray;
    }
    public static int FibonacciNumber2(int fibNumber){
        if(fibNumber<= 1){
            return fibNumber;
        }
        else{
            return FibonacciNumber2(fibNumber-1) + FibonacciNumber2(fibNumber-2);
        }
    }

    //fibbing untill last no is seq <= n 
    public static List<Integer> FibNum(int fibNumber){
        List<Integer> fiblist = new ArrayList<>();
        int i =0;
        while(FibonacciNumber(i)<=fibNumber){
            fiblist.add(FibonacciNumber(i));
            i++;
        }
        return fiblist;
    }
    public static int FibonacciNumber(int fibNumber){
        if(fibNumber<= 1){
            return fibNumber;
        }
        else{
            return FibonacciNumber(fibNumber-1) + FibonacciNumber(fibNumber-2);
        }
    }
}
//https://dyclassroom.com/recursion-algorithm/fibonacci-series --- just saw this has non recursive --- changes may be needed late now
    // public static List<Integer> Fibonacci(int fibNumber){
    //     int maxFib = 0;

    //     int start = 0;
    //     int nextNumber = 1; 

    //     List<Integer> fiblist = new ArrayList<>();

    //     fiblist.add(start);
    //     if(fibNumber>1){
    //     fiblist.add(nextNumber);

    //     }
       
    //     while((maxFib+nextNumber)<=fibNumber){
    //         // System.out.println("\n\n" +maxFib +" <-Fib ...BEFRORE FIB CHANGE... -> Next" +nextNumber);
    //         maxFib += nextNumber;
    //         fiblist.add(maxFib);
    //         // System.out.println(maxFib +" <-Fib ...AFTER FIB CHANGE: BEFORE NN CHANGE... -> Next" +nextNumber);
    //         if((maxFib+nextNumber)<=fibNumber){
    //         nextNumber+=maxFib;
    //         fiblist.add(nextNumber);
    //         // System.out.println(maxFib +" <-Fib ...AFTER NN CHANGE... -> Next" +nextNumber);
    //         }
    //         System.out.println(maxFib +" <-Fib ...... -> Next" +nextNumber+"\n\n");
    //     }
    //     return  fiblist;

    // }

/*

import java.util.*;
public class FibonacciWithRecursion {
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.print("Please the number you would like fibonaccied: ");
        int fibNumber = myObj.nextInt();
        // System.out.println(FibonacciNumber(fibNumber));
        // System.out.println("here 4444444444444");
        // System.out.println(Fibonacci(fibNumber));
        // System.out.println("here I444444444");
         System.out.println(FibNum(fibNumber));
        // int i = 0;


        // for (int i =0; i<= fibNumber;i++){
        //     System.out.println(FibonacciNumber(i));
        // }
        myObj.close();
    }

    //getting fib to counf fibnumber
    //need fib to <=equal fibnumber
    public static List<Integer> FibNum(int fibNumber){
        List<Integer> fiblist = new ArrayList<>();
        for (int i =0; i<= fibNumber-1;i++){
            fiblist.add(FibonacciNumber(i));
        }
        return fiblist;
    }
     
    public static int FibonacciNumber(int fibNumber){
        // System.out.println("working");
        // int temp;
        if(fibNumber<= 1){
            //  System.out.print(fibNumber+", ");
            
            return fibNumber;
        }
        else{
            //  System.out.println((FibonacciNumber(fibNumber-1) + FibonacciNumber(fibNumber-2))+", ");

            return FibonacciNumber(fibNumber-1) + FibonacciNumber(fibNumber-2);
        }
        
        
        // return fibNumber;
    }
    public static List<Integer> Fibonacci(int fibNumber){
        int maxFib = 0;

        int start = 0;
        int nextNumber = 1; 

        List<Integer> fiblist = new ArrayList<>();

        fiblist.add(start);
        if(fibNumber>1){
        fiblist.add(nextNumber);

        }
       
        while((maxFib+nextNumber)<=fibNumber){
            // System.out.println("\n\n" +maxFib +" <-Fib ...BEFRORE FIB CHANGE... -> Next" +nextNumber);
            maxFib += nextNumber;
            fiblist.add(maxFib);
            // System.out.println(maxFib +" <-Fib ...AFTER FIB CHANGE: BEFORE NN CHANGE... -> Next" +nextNumber);
            if((maxFib+nextNumber)<=fibNumber){
            nextNumber+=maxFib;
            fiblist.add(nextNumber);
            // System.out.println(maxFib +" <-Fib ...AFTER NN CHANGE... -> Next" +nextNumber);
            }
            System.out.println(maxFib +" <-Fib ...... -> Next" +nextNumber+"\n\n");
        }
        return  fiblist;

    }
 
}*/
