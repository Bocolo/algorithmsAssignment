import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        //fix weird stering thing im doing here
        Scanner myObj= new Scanner(System.in);
        System.out.print("Please the number you would like fibonaccied: ");

       
        int fibNumber = myObj.nextInt();
      
        //without using a function and producing result where array is of length n
        int maxFib2 = 0;
        int nextNumber2 = 1; 
        int count =0;
        List<Integer> fiblist2 = new ArrayList<>();
       
        while(count<fibNumber){
            if( count<=1){
                fiblist2.add(count);
                count++;
            }else if(count>1){
                maxFib2 += nextNumber2;
                fiblist2.add(maxFib2);
                count++;
                System.out.println("Count in first: " + count);
                if(count<fibNumber){
                    count++;
                    System.out.println("Count in Second: " + count);
                    nextNumber2+=maxFib2;
                    fiblist2.add(nextNumber2);
                }
            }
            // System.out.println(maxFib2 +" <-Fib ...SECOND... -> Next" +nextNumber2+"\n\n");
        }

         //Without function/recursion and producing result where last number is <= n
        int maxFib = 0;
        int start = 0;
        int nextNumber = 1; 
        // int one= 1;
        List<Integer> fiblist = new ArrayList<>();
        ///if clause here for < than 2 /1 
        fiblist.add(start);
        if(fibNumber>1){
        fiblist.add(nextNumber);

        }
        // int[] fibonacci;
        while((maxFib+nextNumber)<=fibNumber){
            // System.out.println("\n\n" +maxFib +" <-Fib ...BEFRORE FIB CHANGE... -> Next" +nextNumber);
            //these numbers are all wrong no need tro be doing so many plus equals

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
        System.out.print(fiblist);
        System.out.print("\n"+fiblist2);
        myObj.close();
    }
 
}

