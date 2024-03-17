import java.util.Scanner;
public class STARLAB_17{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter line number");
    int line = sc.nextInt();
    
    for(int i=0; i<line; i++){
      
      for(int j=0; j<i+1; j++){
        
          if(j==0||j==i||i==line-1)
            System.out.print(j+1);
          else
            System.out.print(" ");
          
      }
      
      System.out.println();
    
    }
  
  }

}