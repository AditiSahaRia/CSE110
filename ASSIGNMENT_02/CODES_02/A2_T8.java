import java.util.Scanner;
public class A2_T8{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter First Quiz Mark");
    int quiz1 = sc.nextInt();
    
    System.out.println("Please enter Second Quiz Mark");
    int quiz2 = sc.nextInt();
    
    System.out.println("Please enter Third Quiz Mark");
    int quiz3 = sc.nextInt();
    
    int sum = 0;
    
    if(quiz1>quiz3 && quiz2>quiz3)
      sum = quiz1+quiz2;
    
    if(quiz1>quiz2 && quiz3>quiz2)
      sum = quiz1+quiz3;
    
    if(quiz2>quiz1 && quiz3>quiz1)
      sum = quiz2+quiz3;
    
    System.out.println(sum);
  
  }

}