import java.util.*;
public class Main_C{
    public static void main(String args []){
       Scanner sc = new Scanner(System.in); 
       int T = sc.nextInt();
       
       for(int count=0;count<T;count++){
         int A = sc.nextInt();
         int B = sc.nextInt();
         
         int div = A%B;      
         System.out.println(div);
       }
         
      
    }
}