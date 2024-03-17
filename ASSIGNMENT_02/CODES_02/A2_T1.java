import java.util.Scanner;
public class A2_T1{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a number");
    int number = sc.nextInt();
    int count = 0;
    while(number!=0){
      
      number = number/10;
      count++;
    
    }
    System.out.println(count);
  
  }

}