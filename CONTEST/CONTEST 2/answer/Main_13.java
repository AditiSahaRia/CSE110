import java.util.*;
public class Main_13{
    public static void main(String args []){
       Scanner sc = new Scanner(System.in); 
       int T = sc.nextInt();
       sc.nextLine();
       for(int x=1;x<=T;x++){
         String N = sc.nextLine();
         
         char ch = N.charAt(N.length()-1);
         int count = Character.getNumericValue(ch);
       
         if(count%2==1)
           System.out.println("Case #"+x+": Odd");
         else
           System.out.println("Case #"+x+": Even");
        
       }
    }
}