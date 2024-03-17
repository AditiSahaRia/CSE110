import java.util.Scanner;
public class STARLAB_24{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter a number");
    int n = sc.nextInt();
    
    for(int i=0; i<n; i++){
      
      System.out.print(i+1);
    
    }
    
    for(int i=n-1; i>0; i--){
      
      System.out.print(i);
    
    }
    
    System.out.println();
  
  }

}