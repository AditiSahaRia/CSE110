import java.util.Scanner;
public class Question_10{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter a number");
    int number=sc.nextInt();
    int count=1, sum=0;
    while(count<=number){
      if(number%count==0){
        sum=sum+count;
      }
      count=count+1;
    }
    if(sum==number+1){
      System.out.println(number+" is a prime number");
    }
    else{
      System.out.println(number+" is not a prime number");
    }
  }
}