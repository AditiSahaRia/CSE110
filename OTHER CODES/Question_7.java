import java.util.Scanner;
public class Question_7{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter a quantity");
    int quantity=sc.nextInt();
    System.out.println("please enter first number");
    int first=sc.nextInt();
    int count=1, sum=first, max=first, min=first;
    while(count<quantity){
      System.out.println("please enter another number");
      int another=sc.nextInt();
      if(another>max){
        max=another;
      }
      else if(another<min){
        min=another;
      }
      sum=sum+another;
      count=count+1;
    }
    int avg=sum/quantity;
    System.out.println("maximum number is "+max);
    System.out.println("minimum number is "+min);
    System.out.println("avarage of the number is "+avg);
  }
}