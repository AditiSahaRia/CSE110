import java.util.Scanner;
public class t8{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("please enter a number");
    int x=sc.nextInt();
    System.out.println("please enter another number");
    int y=sc.nextInt();
    if(x>y){
      int sub = x-y;
      System.out.println(sub);
    }
    else if(y>x){
      int sub=y-x;
      System.out.println(sub);
    }
  
  }

}
