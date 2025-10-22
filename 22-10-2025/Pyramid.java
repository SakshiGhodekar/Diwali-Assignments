import java.util.*;
public class Pyramid {
    public static void main(String[]args){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter no of rows");
 int rows=sc.nextInt();
 for(int i=1;i<=rows;i++){
    int space=rows-i;
    for(int j=1;j<=space;j++){
        //for spaces
      System.out.print(" ");

    }
    for(int k=1;k<=i;k++){
        System.out.print("* ");
    }
    System.out.println();
 } 
}
}