import java.util.Scanner;
public class A2_T3{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a number");
    int number = sc.nextInt();
    for(int result=0; number!=0; number=number/10){
      result = number%10;
      System.out.println(result);
    }
  
  }

}