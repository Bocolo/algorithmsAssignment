import java.util.*;
//compare to class example to be sure
public class MergeSort {
    public static void main(String[] args) {
        //  int[] userArray ={100,99,98,97,95,94,93,92};//{99,15,6,23,54,4,2,1,5,67,5,7};
        //   int[] userArray ={100,993,2,1,55,4,5,99};
        Scanner myObj= new Scanner(System.in);
        System.out.print("Please enter the number of elements you would like in your array: ");
        int arrayLength = myObj.nextInt();
        int[] userArray = new int[arrayLength];
        for(int i=0; i<arrayLength;i++){
            System.out.print(i+1+". Please enter a number: ");
            userArray[i] = myObj.nextInt();
        }
        System.out.println("Your Array before sorting was: "+ Arrays.toString(userArray));
        userArray= splitArrays(userArray);
        System.out.println("Your Array after sorting is: "+ Arrays.toString(userArray));
            // System.out.println("\nOriginal = " +  Arrays.toString(userArray));
        myObj.close();
    }
    public static int[] splitArrays(int[] array){
        if(array.length == 1){
            return array;
        }
        int[] arrayLeft = Arrays.copyOfRange(array, 0, (array.length/2));
        int[] arrayRight = Arrays.copyOfRange(array, (array.length/2), array.length);

        //splitting left and right array
        arrayLeft= splitArrays(arrayLeft);
        arrayRight= splitArrays(arrayRight);
        return mergeArrays(arrayLeft, arrayRight);
    }
    public static int[] mergeArrays(int[] arrayLeft, int[] arrayRight){
        // System.out.println("\n\nMERGE ARRAY START.  \nLeft : "+ Arrays.toString(arrayLeft)+ ". Right: "+ Arrays.toString(arrayRight)+"\n");
        int arrayMergedLength = arrayLeft.length +arrayRight.length;
        int[] arrayMerged = new int[arrayMergedLength];
        int count =0;
        //could probably just have these as parameters instead of arrays
        int leftSize=arrayLeft.length;
        int rightSize=arrayRight.length;
        int countLeft=0;
        int countRight=0;
//inver these maybe --- array > ,,,, 
        while(countLeft<leftSize && countRight<rightSize){
            if(arrayLeft[countLeft]<= arrayRight[countRight]){
                arrayMerged[count] =arrayLeft[countLeft];
                countLeft++;
            }else{
                arrayMerged[count] =arrayRight[countRight];
                countRight++;
            }
            count++;
        }
        while(countLeft<leftSize){
            arrayMerged[count] =arrayLeft[countLeft];
                countLeft++;
                count++;
        }
        while(countRight<rightSize){
            arrayMerged[count] =arrayRight[countRight];
                countRight++;
                count++;                
        }
        System.out.println(Arrays.toString(arrayMerged));
    /*    System.out.println("MERGE ARRAY END.  \nLeft : "+ Arrays.toString(arrayLeft)+ ". Right: "+ Arrays.toString(arrayRight) +
        "\nMerged = " + Arrays.toString(arrayMerged)
        +"\n");*/
        return arrayMerged;
    }
}




/*

import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        //  int[] userArray ={100,99,98,97,95,94,93,92};//{99,15,6,23,54,4,2,1,5,67,5,7};
        int[] userArray ={100,993,2,1,55,4,5,99};
       
        splitArrays(userArray);
        System.out.println("\nOriginal = " +  Arrays.toString(userArray));
   
    }
    public static int[] splitArrays(int[] array){
        if(array.length == 1){
            return array;
        }
        int[] arrayLeft = Arrays.copyOfRange(array, 0, (array.length/2));
        int[] arrayRight = Arrays.copyOfRange(array, (array.length/2), array.length);
        arrayLeft= splitArrays(arrayLeft);
        arrayRight= splitArrays(arrayRight);
        return mergeArrays(arrayLeft, arrayRight);
        // return array;
    }
    public static int[] mergeArrays(int[] arrayLeft, int[] arrayRight){
        System.out.println("MERGE ARRAY START.  \nLeft : "+ Arrays.toString(arrayLeft)+ ". Right: "+ Arrays.toString(arrayRight));
        int arrayMergedLength = arrayLeft.length +arrayRight.length;
        int[] arrayMerged = new int[arrayMergedLength];
        int count =0;
        int leftSize=arrayLeft.length;
        int rightSize=arrayRight.length;
        int countLeft=0;
        int countRight=0;
//inver these maybe --- array > ,,,, 
        while(countLeft<leftSize && countRight<rightSize){
            if(arrayLeft[countLeft]<= arrayRight[countRight]){
                // System.out.println(arrayLeft[countLeft]+" <- left ...in first... right ->"+ arrayRight[countRight]);
                arrayMerged[count] =arrayLeft[countLeft];
                countLeft++;
                // System.out.println(Arrays.toString(arrayMerged)+ ". :Left : " +countLeft);
            }else{
                // System.out.println(arrayLeft[countLeft]+" <- left...in second... roght ->"+ arrayRight[countRight]);
                arrayMerged[count] =arrayRight[countRight];
                // System.out.println("\n\n"+Arrays.toString(arrayMerged)+ ".  Right : " +countRight+ 
                //  "\n Right value: " +arrayRight[countRight]+"\n merged value : "+ arrayMerged[count]+"\n\n");
                countRight++;
             
            }
            count++;
            // System.out.println(Arrays.toString(arrayMerged)+ ". Count : " +count);
        }
        while(countLeft<leftSize){
            arrayMerged[count] =arrayLeft[countLeft];
                countLeft++;
                count++;
                // System.out.println(Arrays.toString(arrayMerged)+ ". :Left : " +countLeft);

        }
        while(countRight<rightSize){
            arrayMerged[count] =arrayRight[countRight];
                countRight++;
                count++;                
                // System.out.println(Arrays.toString(arrayMerged)+ ".  Right : " +countRight);

        }
        System.out.println(Arrays.toString(arrayMerged));
        System.out.println("MERGE ARRAY END.  \nLeft : "+ Arrays.toString(arrayLeft)+ ". Right: "+ Arrays.toString(arrayRight) +
        "\nMerged = " + Arrays.toString(arrayMerged)
        );
        // mergeCounts++;
        // System.out.println(mergeCounts);
        return arrayMerged;


    }
}







*/






























      // System.out.println("array is length 1");
                    // System.out.println("length : " +array.length+". length divided : " +array.length/2);
     // bubbleSorts(userArray);
        // System.out.println("Your Array after sorting is: "+ Arrays.toString(userArray));
        // myObj.close();
    // System.out.println(Arrays.toString(arrayLeft));

        //array[0:(array.length/2)];
     // Scanner myObj= new Scanner(System.in);
        // System.out.print("Please enter the number of elements you would like in your array: ");
        // int arrayLength = myObj.nextInt();
        // int[] userArray = new int[arrayLength];
        // for(int i=0; i<arrayLength;i++){
        //     System.out.print(i+1+". Please enter a number: ");
        //     userArray[i] = myObj.nextInt();
        // }
        // System.out.println("Your Array before sorting is: "+ Arrays.toString(userArray));
        // mergeSort(userArray);

//pseudo code
//https://www.youtube.com/watch?v=4VqmGXwpLqc

  // System.out.println(Arrays.toString(arrayRight));
        // int count =0;
        // count++;
        // System.out.println("BEFOOOORRRE ....  " +count);
        // mergeArrays(arrayLeft, arrayRight);
        // System.out.println("AFTERRRRRRRR ....  " +count);
        // mergeArrays(arrayLeft, arrayRight);

        
        // for(int i = 0; i<leftSize ; i ++){
        //     count++;
        //     arrayMerged[i] = arrayLeft[i];
        //     // System.out.println("Left i: " +i+ "\n mergedlength: " +arrayMergedLength + "\nLeft length: " + arrayLeft.length +"\n Count: "+count);
        //     System.out.println(Arrays.toString(arrayMerged));
        // }
        // for(int i = leftSize; i<arrayMergedLength ; i ++){
        //     count++;
        //     arrayMerged[i] = arrayRight[i-rightSize];
        //     System.out.println(Arrays.toString(arrayMerged));
        //     // System.out.println("Right i: " +i+ "\n mergedlength: " +arrayMergedLength+"\nRight i: "+(i-arrayRight.length)+"\n Count: "+count);
        // }
        // System.out.println("Count --- "+count);
        // System.out.println(Arrays.toString(arrayMerged));

        
        
        
        
        // return arrayLeft;