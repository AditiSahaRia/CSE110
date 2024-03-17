import java.util.Scanner;
public class A3_T06{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int [] n = new int[10];
    int count1 = 0;
    
    for(int count=0; count<n.length; count++){
      
      System.out.println("Please enter the value");
      n[count] = sc.nextInt();
    
    }
    
    for(int count=n.length-1; count>=0; count--){
      
      if(n[count]%2!=0){
        
        count1++;
      
      }
      if(n[count]%2!=0){
        if(count1==1){
        
        n[count1] = n[count];
      
        }
      }
    } 
      
          System.out.println(n[1]);
    
  
  }

}