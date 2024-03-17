import java.util.Scanner;
public class Main3{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int [] array = new int[n];
    int sum = 0;
    for(int count=0;count<array.length;count++){
      array[count] = sc.nextInt();
      sum = sum+array[count];
    }
    System.out.println(sum);
    
  }
}