import java.util.Scanner;
public class Main5{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int T=sc.nextInt();
    int i =0;
    while(i<T){
      int a=sc.nextInt();
      int count=0,temp=a,b=0;
      int var=0,count1=0;
      while(a!=0){
        a=a/10;
        count=count+1;
      }
      int sum=(int)Math.pow(10,(count-1));
      int pow=(int)Math.pow(10,count1);
      while(temp!=0){
        
        b=temp/sum;
        var=var+(b*pow);
        temp=temp%sum;
        sum=sum/10;
        pow=pow*10;
        
      }
      System.out.println(var);
      i++;
    }
  }
}