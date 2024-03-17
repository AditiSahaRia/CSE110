import java.util.Scanner;
public class Main4{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int T = sc.nextInt();
    long salary = 0;
    for(int count=0;count<T;count++){
      long A = sc.nextLong();
      long B = sc.nextLong();
      long C = sc.nextLong();
      
      if((A>B&&A<C)||(A>C&&A<B))
        salary = A;
      else if((B>A&&B<C)||(B>C&&B<A))
        salary = B;
      else if((C>A&&C<B)||(C>B&&C<A))
        salary = C;
      System.out.println("Case "+(count+1)+": "+salary);
        
    }
    
    
  }
}