import java.util.Scanner;
public class t9{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter a number");
    int x=sc.nextInt();
    System.out.println(x);
    if(x%2==0)
      System.out.println("The number is even");
    else 
      System.out.println("The number is odd");

  }

}