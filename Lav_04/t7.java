import java.util.Scanner;
public class t7{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter a number");
    int x=sc.nextInt();
    System.out.println("Please enter another number");
    int y=sc.nextInt();
    if(x>y)
      System.out.println("first is greater");
    else if(x<y)
      System.out.println("second is greater");
    else
      System.out.println("number are equal");
  
  }

}