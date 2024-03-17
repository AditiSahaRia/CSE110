import java.util.*;
import java.lang.*;
import java.io.*;

public class Main_DD{
    public static void main(String args []){
       Scanner sc = new Scanner(System.in); 
       int T = sc.nextInt();
       int[] array = new int[T];
       
       for(int count=0;count<array.length;count++){
         array[count] = sc.nextInt();
       }
       
       for(int count=0;count<array.length;count++){
         Arrays.sort(array);
         System.out.println(Arrays.toString(array));
       }
      
    }
}