import java.util.Scanner;
public class A2_T15{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int [] number = new int [6];
    
    System.out.println("Please enter a number");
    int first = sc.nextInt();
    
    int max = first, min = first;
    
    
    for(int count=0; count<number.length-1; count++){
      
      System.out.println("Please enter another number");
      
      number[count] = sc.nextInt();
      
      if(number[count]>max)
        max = number[count];
      
      else if(number[count]<min)
        min = number[count];
    
    }
    System.out.println("The maximum number is :" + max);
    System.out.println("The minimum number is :" + min);
  
  }

}