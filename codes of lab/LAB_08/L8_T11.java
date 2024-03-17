import java.util.Scanner;
public class L8_T11{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter number of lines");
    int n = sc.nextInt();
    for(int i=0; i<n; i++){
      
      for(int j=0; j<n-i-1; j++){
        
        System.out.print(" ");
      
      }
      
      for(int k=n-i; k<n+1; k++){
        
        System.out.print(k);
      
      }
      
      System.out.println();
    }
  
  }

}