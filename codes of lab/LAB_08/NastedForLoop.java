import java.util.Scanner;
 
public class NastedForLoop {
 
 public static void main(String[] args) {
 
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter any Int Num:");
  int n = sc.nextInt();
  System.out.println();
 
 
  for (int i = n; i >= 1; i--) {
 
   for (int j = 1; j < i; j++) {
    System.out.print(" ");
   }
   for (int k = i; k <= n; k++) {
    if (i > 1 && i < n - 1) {
     if (k > i && k < n) {
      System.out.print(" ");
     } else
      System.out.print("*");
    } else
     System.out.print("*");
   }
   System.out.println();
  }
 
 }
 
}