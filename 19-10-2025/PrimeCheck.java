import java.util.*;
public class PrimeCheck{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to check");
        int num=sc.nextInt();
        boolean isPrime=true;
        if(num<=1){
            isPrime=false;
        }else{
            for(int i=2;i<num;i++){
                if(num%2==0){
                    isPrime=false;
                    break;
                }
            }
        }
        System.out.println(isPrime);
    }
}