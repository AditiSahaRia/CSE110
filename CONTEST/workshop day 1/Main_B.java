import java.util.*;
public class Main_B{
    public static void main(String args []){
       Scanner sc = new Scanner(System.in); 
       int T = sc.nextInt();
       
       for(int count=0;count<T;count++){
         long A = sc.nextLong();
         long B = sc.nextLong();
         long C = sc.nextLong();
         long max = 0;
         if((A>B&&A<C)||(A>C&&A<B))
           max = A;
         else if((B>A&&B<C)||(B>C&&B<A))
           max = B;
         else if((C>A&&C<B)||(C>B&&C<A))
           max = C;
                 
         System.out.println(max);
       }
         
      
    }
}