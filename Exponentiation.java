import java.util.*;
public class Exponentiation {
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.print("Please input the number to be expo'd....: ");
        int x= myObj.nextInt();
        System.out.print("Please input the exponent...: ");
        int n= myObj.nextInt();
        myObj.close();
        System.out.println(ExponentThisMofo(x, n)+"...1");
        System.out.println(Exponent(x, n)+"...2");
        System.out.println(Exponent2(x, n)+"...3");
    }
//are both number ints or doubles ... ? ask in class
    public static int ExponentThisMofo(int x, int n){
        int y=x; 
        for(int i =1 ; i< n;i++){
            y*=x;
        }
        return y;
    }
    public static int Exponent(int x, int n){
      if (n ==0){
          return 1;
      }else if(n%2==0){
          int result=((Exponent(x*x, n/2))*x);
          return result;
      }else{
          return 49;
      }
      
    }
    public static int Exponent2(int x, int n){
        if (n ==0){
            return 1;
        }else{
            int result=((Exponent(x*x, n/2)));
            return result;
      }
}
}
