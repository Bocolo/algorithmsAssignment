import java.util.*;
public class Exponentiation {
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);

        for(int i = 0; i<10;i++){
        System.out.print("Please input the number to be expo'd....: ");
        int x= myObj.nextInt();
        System.out.print("Please input the exponent...: ");
        int n= myObj.nextInt();

        
        System.out.println(Exponent(x, n)+"...");
        }
        myObj.close();
    }

    public static double Exponent(double z, int y){
      if(y<0){
        System.out.println("Negative");
          double result5 = Exponent(1/z, -y);
          return result5;
      }else if (y ==0){
            System.out.println("zero");
          return 1;
          //should i do another y==1 ? program works without but i suppose doing additional computation
      }else if (y==1){
        System.out.println("One");
        return z;
      }
      else if(y%2==0){
        System.out.println("Even");
          double result2=((Exponent(z*z, y/2)));//*z);
       
          return result2;
      }else{
        System.out.println("Odd");
          double result4 = (Exponent(z*z, (y-1)/2))*z;
         
          return result4;
      }
      
    }

}
    // public static int Exponent2(int a, int b){
    //     if (b ==0){
    //         return 1;
    //     }else{
    //         int result3=((Exponent2(a*a, b/2)));
    //         return result3;
    //   }
    // }
    // System.out.println(Exponent2(x, n)+"...3");
    // System.out.println(ExponentThisMofo(x, n)+"...1");
    //are both number ints or doubles ... ? ask in class
    // public static int ExponentThisMofo(int x, int n){
    //     int y=x; 
    //     for(int i =1 ; i< n;i++){
    //         y*=x;
    //     }
    //     return y;
    // }