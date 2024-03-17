import java.util.Scanner;
public class A3_T11 {
    public static void main (String[]args) {
        Scanner sc= new Scanner(System.in);
        int [] n = new int [10];
        for(int count=0; count<n.length;count++) {
            System.out.println("Enter a number");
            n[count] = sc.nextInt();
            for(int i=0; i<count;i++) {
                if(n[count]==n[i]) {
                    System.out.println("This input is already stored at index "+i);
                    count--;
                    break;
                }
            }
        }
    }
}