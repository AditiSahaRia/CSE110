  import java.util.Scanner;
  public class A3_T01{
    public static void main(String [] args){
      Scanner sc = new Scanner (System.in);
      int [] array = new int [3];
      int sum = 0;
      
      for(int count=0; count<array.length; count++){
        
        System.out.println("Please enter number");
        array[count] = sc.nextInt();
        
        sum = sum+array[count];
      
      }
      
      System.out.println(sum);
      
      for(int count=0; count<array.length; count++){
        
        System.out.println(array[count]);
      
      }
    
    }
  
  }