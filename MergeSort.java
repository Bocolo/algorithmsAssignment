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
        userArray= mergeSort(userArray);
        System.out.println("Your Array after sorting is: "+ Arrays.toString(userArray));
            // System.out.println("\nOriginal = " +  Arrays.toString(userArray));
        myObj.close();
    }


    public static int[] mergeSort(int[] array){
        //if the array only has one variable, return the array
        if(array.length == 1){
            return array;
        }
        //else split array into left array and right array
        //left array is copy of main array from index 0 to mid point 
        int[] arrayLeft = Arrays.copyOfRange(array, 0, (array.length/2));
        //right array is copy of main array from main array mid point to main array end 
        int[] arrayRight = Arrays.copyOfRange(array, (array.length/2), array.length);

        //executing merge sort on left and right arrays 
        //arrays will be split repeatedly untill each array is of length 1 
        //-- maybe fix this to length 2?? 
        
        arrayLeft= mergeSort(arrayLeft);
        arrayRight= mergeSort(arrayRight);
        //arrays will then be returned as equal length arrays, with numbers in ascending order
        //e.g first merge - 2 arrays (of length 1) will be merged (into array of length 2) with smallest number on left and largest on right
        return mergeArrays(arrayLeft, arrayRight);
    }
    public static int[] mergeArrays(int[] arrayLeft, int[] arrayRight){
 
        //creating an empty merged array
        //sometidying require here
        int[] arrayMerged = new int[arrayLeft.length +arrayRight.length];


        int count =0;
        //could probably just have these as parameters instead of arrays
        int leftSize=arrayLeft.length;
        int rightSize=arrayRight.length;

        int countLeft=0;
        int countRight=0;


//inver these maybe --- array > ,,,, 
        //While loop that works if countLeft is less than leftSize (size of left array)  AND countRight is less than rightSize (size of right array)
        while(countLeft<leftSize && countRight<rightSize){
            //if the number in arrayLeft at countLeft is less than number in arrayRight at countRight
            if(arrayLeft[countLeft]<= arrayRight[countRight]){
                //add the left array number (that was checked) to the merged array at position count (initialised at 0 and incremented once per while loop)
                arrayMerged[count] =arrayLeft[countLeft];
                //increment count left
                countLeft++;
            }else{
                //if left side is NOT larger than right: add right number to merged array at position count
                arrayMerged[count] =arrayRight[countRight];
                //increment right count
                countRight++;
            }
            // increment count everytime while loop executes 
            count++;
        }
        /* only one of the following loops will execute (depending on while loop above)
        if there are still numbers from the left array not yet merged the first loop will execute
        if there are still numbers from the right array not yet merged the second loop will execute
        */

        /* While loop that adds the remaining numbers in the left array to the merged array
         */
        while(countLeft<leftSize){
            //adding number in left array to merged
            arrayMerged[count] =arrayLeft[countLeft];
            //incrementing count and countleft each time
            countLeft++; 
            count++;
        }
        /* While loop that adds the remaining numbers in the right array to the merged array
         */
        while(countRight<rightSize){
              //adding number in right array to merged
            arrayMerged[count] =arrayRight[countRight];
            //incrementing count and countright each time
            countRight++;
            count++;                
        }
        //outputting the merged array for reference
        System.out.println(Arrays.toString(arrayMerged));
        //rerutning the merged array
        return arrayMerged;
    }
}


       // System.out.println("\n\nMERGE ARRAY START.  \nLeft : "+ Arrays.toString(arrayLeft)+ ". Right: "+ Arrays.toString(arrayRight)+"\n");
        // int arrayMergedLength = arrayLeft.length +arrayRight.length;
        // int[] arrayMerged = new int[arrayMergedLength];
       
    /*    System.out.println("MERGE ARRAY END.  \nLeft : "+ Arrays.toString(arrayLeft)+ ". Right: "+ Arrays.toString(arrayRight) +
        "\nMerged = " + Arrays.toString(arrayMerged)
        +"\n");*/
/*

import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        //  int[] userArray ={100,99,98,97,95,94,93,92};//{99,15,6,23,54,4,2,1,5,67,5,7};
        int[] userArray ={100,993,2,1,55,4,5,99};
       
        mergeSort(userArray);
        System.out.println("\nOriginal = " +  Arrays.toString(userArray));
   
    }
    public static int[] mergeSort(int[] array){
        if(array.length == 1){
            return array;
        }
        int[] arrayLeft = Arrays.copyOfRange(array, 0, (array.length/2));
        int[] arrayRight = Arrays.copyOfRange(array, (array.length/2), array.length);
        arrayLeft= mergeSort(arrayLeft);
        arrayRight= mergeSort(arrayRight);
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