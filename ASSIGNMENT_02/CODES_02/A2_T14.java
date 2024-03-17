import java.util.Scanner;
public class A2_T14{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int [] number = new int [6];
    
    System.out.println("Please enter a number");
    int first = sc.nextInt();
    
    int max = first;
    
    
    for(int count=0; count<number.length-1; count++){
      
      System.out.println("Please enter another number");
      
      number[count] = sc.nextInt();
      
      if(number[count]>max)
        max = number[count];
    
    }
    System.out.println(max);
  
  }

}