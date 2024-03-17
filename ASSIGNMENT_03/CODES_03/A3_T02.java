import java.util.Scanner;
public class A3_T02{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int [] n = new int[10];
    
    for(int count=0; count<n.length; count++){
      
      System.out.println("Please enter the value");
      n[count] = sc.nextInt();
    
    }
    
    System.out.println("Please enter between 0 to 9");
    int count1 = sc.nextInt();
    System.out.println(n[count1]);
  
  }

}