import java.util.*;
public class Main_14{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in); 
       String s = sc.nextLine();
       int count = 0;
       for(int i=0;i<s.length();i++){
         char ch = s.charAt(i);
         if(ch=='v')
           count++;
       }
       System.out.println(count);
       
    }
}