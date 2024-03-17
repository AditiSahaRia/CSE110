import java.util.Scanner;
public class t4{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter radius");
    int radius=sc.nextInt();
    double area=3.1416*radius*radius;
    System.out.println(area);
    double circumference=2*3.1416*radius;
    System.out.println(circumference);
    
  
  }

}