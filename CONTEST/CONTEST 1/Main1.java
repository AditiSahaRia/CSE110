import java.util.Scanner;
public class Main1{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int T = sc.nextInt();
    int sum = 0;
    for(int count=1;count<=T;count++){
      int A = sc.nextInt();
      int B = sc.nextInt();
      sum = A+B;
      System.out.println("Case "+count+": "+sum);
    }
    
  }
}