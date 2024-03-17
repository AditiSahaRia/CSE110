import java.util.Scanner;
public class A2_T12{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int [] number = new int [10];
    
    
    for(int count=0; count<number.length; count++){
      
      System.out.println("Please enter a number");
      
      number[count] = sc.nextInt();
      
      if(number[count]%2==0)
    System.out.println(number[count]);
    
    }
  
  }

}