import java.util.*;
public class Exponentiation {
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.print("Please input the number to be expo'd....: ");
        int x= myObj.nextInt();
        System.out.print("Please input the exponent...: ");
        int n= myObj.nextInt();
        myObj.close();
        System.out.println(ExponentThisMofo(x, n));

    }

    public static int ExponentThisMofo(int x, int n){
        int y=x; 
        for(int i =1 ; i< n;i++){
            y*=x;
        }
        return y;
    }
}
