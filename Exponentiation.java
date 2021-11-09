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
    public static int Exponent(int z, int y){
      if (y ==0){
          return 1;
      }else if(y%2==0){
          int result2=((Exponent(z*z, y/2))*z);
          return result2;
      }else{
          return 49;
      }
      
    }
    public static int Exponent2(int a, int b){
        if (b ==0){
            return 1;
        }else{
            int result3=((Exponent2(a*a, b/2)));
            return result3;
      }
}
}
