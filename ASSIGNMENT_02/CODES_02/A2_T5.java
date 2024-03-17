import java.util.Scanner;
public class A2_T5{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a number");
    int number = sc.nextInt();
    int sum = 0, temp = number;
    for(int result=0; number!=0; number=number/10){
      
      result = number%10;
      System.out.println(result);
      
    }
    
    for(int result=0; temp!=0; temp=temp/10){
      
      result = temp%10;
      sum = sum+result;
      
    }
    System.out.println(sum);
  
  }

}