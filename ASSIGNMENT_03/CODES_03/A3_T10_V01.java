import java.util.Scanner;
public class A3_T10_V01{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int [] ary=new int[10];
    for(int count2=0;count2<ary.length;count2++){
      System.out.println("Please enter the value");
      ary[count2]=sc.nextInt();
    }
    for(int count=0;count<ary.length;count++){
      for(int count1=0;count1<(count+1);count1++){
        if(count1==count){
          System.out.print(ary[count1]+".");
        }
        else{
          System.out.print(ary[count1]+",");
        }
      }
      System.out.println();
    }
  }
}