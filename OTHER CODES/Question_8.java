import java.util.Scanner;
public class Question_8{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter a number");
    int number=sc.nextInt();
    int count=1, dev=0;
    while(count<=number){
      if(number%count==0){
        if(count==number){
          System.out.print(count);
          System.out.print("");
        }
        else{
          System.out.print(count);
          System.out.print(",");
        }
        dev=dev+1;
      }
      count=count+1;
    }
    System.out.println();
    System.out.print("total "+dev+" divisors");
  }
}