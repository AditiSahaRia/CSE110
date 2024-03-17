import java.util.Scanner;
public class A2_T4{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int count=0,temp=a,b=0;
    while(a!=0){
      a=a/10;
      count=count+1;
    }
     int sum=(int)Math.pow(10,(count-1));
    
    while(temp!=0){
      b=temp/sum;
      
      if(temp==0){
        System.out.println(b+".");
      }
      else{
        System.out.print(b+",");
      }
      temp=temp%sum;
      sum=sum/10;
      
      
    }
  }
}