import java.util.*;
public class bubble{
    public static void main(String[] args) {
        // int[] intarray ={100,99,98,97,95,94,93,92};//{99,15,6,23,54,4,2,1,5,67,5,7};
        Scanner myObj= new Scanner(System.in);
        System.out.print("Please enter the number of elements you would like in your array: ");
        int arrayLength = myObj.nextInt();
        int[] userArray = new int[arrayLength];
        for(int i=0; i<arrayLength;i++){
            System.out.print(i+1+". Please enter a number: ");
            userArray[i] = myObj.nextInt();
        }
        System.out.println("Your Array before sorting was: "+ Arrays.toString(userArray));
        bubbleSort(userArray);
        System.out.println("Your Array after sorting is: "+ Arrays.toString(userArray));
        myObj.close();
    }

    
    public static void bubbleSort(int[] array){
        //creating a temporary variable to store the integer being moved
         int temp ;
        //outer for loop
        for(int j=0;j<array.length-1;j++){
            //inner for loop
            for(int i =0; i<array.length-j-1; i++){
                //check is number on left larger than number on right
                if(array[i]>array[i+1]){
                    //if it is: store left number in temp variable
                    temp = array[i];
                    //store right number in left
                    array[i] = array[i+1];
                    //store temp variable (originally left number) in right
                    array[i+1] =temp;
                    //outputting array as it is at each sorting step
                    System.out.println(Arrays.toString(array));
                }
            }
        }
    }
}