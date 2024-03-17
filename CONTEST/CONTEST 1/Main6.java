import java.util.Scanner;
public class Main6{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long ans = (long)Math.pow(5,n);
    long result = 0L, temp = 0L;
    int count = 0, pow = 0;
      while(count<2){
        pow = (int)Math.pow(10,count);
        temp = ans%10;
        result = result+(temp*pow);
        ans = ans/10;
        count++;
      }
    System.out.println(result);
    
  }
}