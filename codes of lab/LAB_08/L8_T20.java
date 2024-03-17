import java.util.Scanner;
 
public class L8_T20 {
 
 public static void main(String[] args) {
 
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter any Int Num:");
  int n = sc.nextInt();
  System.out.println();
 
  for (int i = 0; i < n; i++) {
 
   for (int j = i; j < n - 1; j++) {
 
    System.out.print(" ");
   }
 
   for (int k = 1; k <= ((2 * i) + 1); k++) { 
 
    if (i > 0 && i < n - 1) {
     if (k > 1 && k < 2 * i + 1) {
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
