import java.util.Scanner;
public class STARLAB_22{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter line number");
    int line = sc.nextInt();
    
    for(int i=0; i<line; i++){
      
      for(int j=0; j<line-1-i; j++){
        
          System.out.print(" ");
          
      }
      
      for(int k=0; k<2*i+1; k++){
        
        if(k==0||k==2*i)
            System.out.print("*");
          else
            System.out.print(" ");
      
      }
      
      System.out.println();
    
    }
    
    for(int i=0; i<line; i++){
      
      for(int j=0; j<i+1; j++){
        
        System.out.print(" ");
      
      }
      
      for(int k=0; k<2*(line-i)-3; k++){
        
        if(k==0||k==2*(line-i)-4)
          System.out.print("*");
        else
          System.out.print(" ");
      
      }
      
      System.out.println();
    
    }
  
  }

}