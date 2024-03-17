import java.util.Scanner;
public class A2_T10{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int [] number = new int [5];
    int sum = 0;
    for(int count=0; count<number.length; count++){
      
      number[count] = sc.nextInt();
      sum = sum+number[count];
    
    }
    System.out.println(sum);
  
  }

}