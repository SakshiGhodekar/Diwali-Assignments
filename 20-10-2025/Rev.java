import java.util.*;
public class Rev {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to reverse");
int num=sc.nextInt();
int rev=0;
int rem;
while(num!=0){
    rem=num%10;
    rev=rev*10+rem;
    num=num/10;
}
System.out.println(rev);
    }
}
