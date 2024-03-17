import java.util.Scanner;
public class A3_T03{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int [] n = new int [10];
    
    for(int count=0; count<n.length;count++){
      
      System.out.println("Please enter the value");
      n[count] = sc.nextInt();
    
    }
    
    for(int count=n.length-1; count>=0; count--){
      
      System.out.println(n[count]);
    
    }
  
  }

}