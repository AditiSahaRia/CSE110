import java.util.Scanner;
public class Main2{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    long dif = 0;
    while(sc.hasNext()){
      long A = sc.nextLong();
      long B = sc.nextLong();
      if(A>=B)
        dif = B-A;
      else{
        dif = A-B;
      }
        
      System.out.println(dif);
    }
    
  }
}