import java.util.Scanner;
public class A3_T05{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int [] n = new int[10];
    int count1 = 0;
    
    for(int count=0; count<n.length; count++){
      
      System.out.println("Please enter the value");
      n[count] = sc.nextInt();
    
    }
    
    for(int count=0; count<n.length; count++){
      
      if(n[count]%2==0){
        
        count1++;
      
      }
      if(n[count]%2==0){
        if(count1==1){
        
        n[count1] = n[count];
      
        }
      }
    }
      
      for(count1=0; count1<n.length; count1++){
        
        if(count1==1){
          System.out.println(n[count1]);
        }
      
      }
    
  
  }

}