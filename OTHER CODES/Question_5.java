import java.util.Scanner;
public class Question_5{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int count=1;
    while(count<=20){
      System.out.println("please enter a number");
      int number=sc.nextInt();
      if(number%2==0){
        System.out.println(number+" is even");
      }
      else{
        System.out.println(number+" is odd");
      }
      count=count+1;
    }
  }
}