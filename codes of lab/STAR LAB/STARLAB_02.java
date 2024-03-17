import java.util.Scanner;
public class STARLAB_02{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter line number");
    int line = sc.nextInt();
    for(int i=0; i<line; i++){
      System.out.print("*");
    }
    System.out.println();
  
  }

}