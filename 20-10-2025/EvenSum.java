        import java.util.*;

        public class EvenSum {
            // sum of first even numbers 
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int num=sc.nextInt();
    int sum=0;
    for(int i=1;i<=num;i++){
        if(i%2==0){
            sum=sum+i;
        }
    }
System.out.println("sum of even numbers is "+sum);
        }
        }