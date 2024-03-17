import java.util.*;
public class Main_D{
    public static void main(String args []){
       Scanner sc = new Scanner(System.in); 
       int T = sc.nextInt();
       int array[] = new int[T];
       
       for(int count=0;count<array.length;count++){
         array[count] = sc.nextInt();
       }
       for(int count=0;count<array.length;count++){
         for(int nextCount=count+1;nextCount<array.length;nextCount++){
           if(array[nextCount]<array[count]){
             int temp = array[count];
             array[count] = array[nextCount];
             array[nextCount] = temp;
           }
         }
       }
       for(int count=0;count<array.length;count++){
         System.out.println(array[count]);
       }
      
    }
}