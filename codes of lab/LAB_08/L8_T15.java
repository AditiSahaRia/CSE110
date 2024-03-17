import java.util.Scanner;
public class L8_T15{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the LENGTH");
    int length = sc.nextInt();
    
    System.out.println("Please enter the WIDTH");
    int width = sc.nextInt();
    
    for(int i=0; i<length; i++){
      
      for(int j=0; j<width;j++){
        
        if (i == 0 || i == length-1 ||  j == 0 || j == width-1)             
                    System.out.print(j+1);
        
        else
                    System.out.print(" ");
      
      }
      
      System.out.println(); 
    
    }
    
    
  
  }

}