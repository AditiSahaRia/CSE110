import java.util.Scanner;
public class STARLAB_15{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter ROW");
    int row = sc.nextInt();
    
    System.out.println("Please enter COLUMN");
    int column = sc.nextInt();
    
    for(int i=0; i<column; i++){
      
      for(int j=0; j<row; j++){
        
        if(i==0||i==column-1||j==0||j==row-1)
          System.out.print(j+1);
        else
          System.out.print(" ");
      
      }
      
      System.out.println();
    
    }
  
  }

}