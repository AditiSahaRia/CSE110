import java.util.Scanner;
public class STARLAB_25{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter a number");
    int n = sc.nextInt();
    
    for(int i=0; i<n; i++){
      
      for(int j=0; j<n-i-1; j++){
        
        System.out.print(" ");
      
      }
      
      for(int j=0; j<i+1; j++){
        
        System.out.print(j+1);
      
      }
      
      for(int j=i; j>0; j--){
        
        System.out.print(j);
      
      }
      
      System.out.println();
    
    }
  
  }

}