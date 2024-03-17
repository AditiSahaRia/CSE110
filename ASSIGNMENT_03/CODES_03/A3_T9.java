import java.util.Scanner;
public class A3_T9{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int [] n = new int[10];
    int count1 = 0;
    
    for(int count=0; count<n.length; count++){
      
      System.out.println("Please enter the value");
      n[count] = sc.nextInt();
    
    }
    
    System.out.println("Please enter a number");
    int number = sc.nextInt();
    
    for(int count=0; count<n.length; count++){
      
      if(number==n[count])
        count1++;
    
    }
    if(count1!=0){
      System.out.println("YES");
    }

    else {
      System.out.println("NO");
    }
    
  
  }

}