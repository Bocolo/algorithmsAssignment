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
        // bubbleSorts(userArray);
        System.out.println("Your Array after sorting is: "+ Arrays.toString(userArray));
        myObj.close();
    }

    
    public static void bubbleSort(int[] array){
        //  int[] tempArray= new int[array.length];
         int temp ;
        //  int total =0;
        //  int reduction=0;
        //List<int> tempArray = new ArrayList<>();
        for(int j=0;j<array.length-1;j++){
            // reduction++;
            for(int i =0; i<array.length-j-1; i++){
                // for(int i =j; o>0; i++){
                // total++;
                // System.out.println("Loop count inner : " +total);
                // System.out.println("Loop count inner: " +i);
                if(array[i]>array[i+1]){
                // tempArray[i] = array[i];
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] =temp;
                    System.out.println(Arrays.toString(array));
                }
            }
        }
    }
}