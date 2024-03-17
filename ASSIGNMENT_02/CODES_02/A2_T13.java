import java.util.Scanner;
public class A2_T13{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int [] number = new int [6];
    
    
    for(int count=0; count<number.length; count++){
      
      System.out.println("Please enter a number");
      
      number[count] = sc.nextInt();
    
    }
  
  }

}