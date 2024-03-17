import java.util.Scanner;
public class A2_T2{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a number");
    int number = sc.nextInt();
    int base = 10, result=1;
    for(int power=number; power!=0; power--){
      
      result*= base; 
    
    }
    System.out.println(result);
  
  }

}