import java.util.Scanner;
public class STARLAB_03{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter width number");
    int width = sc.nextInt();
    System.out.println("Please enter length number");
    int length = sc.nextInt();
    for(int i=0; i<length; i++){
      for(int j=0; j<width; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  
  }

}