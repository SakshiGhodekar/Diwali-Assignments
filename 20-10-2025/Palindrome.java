import java.util.*;
public class Palindrome{

    public static void main(String[]args){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter number to check palindrome");
 int num=sc.nextInt();
 int temp=num;
 int rev=0;
 int rem;
 while(num!=0){
    rem=num%10;
    rev=rev*10+rem;
    num=num/10;

 }
 if(rev==temp){
    System.out.println("True");
 }else{
    System.out.println("false");
 }
    }
}