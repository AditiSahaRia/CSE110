import java.util.Scanner;
public class STARLAB_06{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter line number");
    int line = sc.nextInt();
    for(int i=0; i<line; i++){
      for(int j=0; j<i+1; j++){
        System.out.print(j+1);
      }
      System.out.println();
    }
  
  }

}