import java.util.Scanner;
public class Main7{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long result = 0;
    if(n==0)
      result = 1;
    else if(n==1)
      result = 5;
    else
      result = 25;
    System.out.println(result);
    
  }
}