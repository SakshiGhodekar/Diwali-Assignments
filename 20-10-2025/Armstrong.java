import java.util.*;
public class Armstrong {
public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int num=sc.nextInt();
    int temp=num;
    int rem;
    int sum=0;

    while(num!=0){
    
        rem=num%10;
        sum=sum+(rem*rem*rem);
        num=num/10;
    }
    
    if(sum==temp){
        System.out.println("True");
    }else{
        System.out.println("False");
    }
}    
}
