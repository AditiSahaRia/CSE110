import java.util.Scanner;
public class A2_T7{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a number");
    int first = sc.nextInt();
    int sum = 0, result = 0;
    int max = first;
    
    for(int count=0; count<9; count++){
      
      System.out.println("Please enter another number");
    int another = sc.nextInt();
    
    if(another>max)
      max = another;
    
    }
    
    for(int temp=max; temp!=0; temp=temp/10){
      
      result = temp%10;
      sum = sum+result;
      
    }
    System.out.println(sum);
  
  }

}