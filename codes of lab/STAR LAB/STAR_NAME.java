import java.util.Scanner;
public class STAR_NAME{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter line number for latters");
    int a = sc.nextInt();
    while(a<4){
      System.out.println("Please enter another line number for latters");
      int n = sc.nextInt();
      a=n;
    }
    System.out.println("A");
    for(int i=0; i<a; i++){
      for(int j=0; j<a-i-1; j++){
        System.out.print(" ");
      }
      for(int j=0; j<i+1; j++){
        if(j==0||i==a/2)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      for(int j=i; j>0; j--){
        if(j==1||i==a/2)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
      }
    System.out.println("B");
    for(int i=0; i<a; i++){
      for(int j=0; j<a; j++){
        if(i==0||i==a-1||j==0||j==a-1||i==a/2)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
    System.out.println("C");
    for(int i=0; i<a; i++){
      for(int j=0; j<a; j++){
        if(i==0||i==a-1||j==0)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
    System.out.println("D");
    for(int i=0; i<a; i++){
      for(int j=0; j<a; j++){
        if(i==0||i==a-1||j==0||j==a-1)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
    System.out.println("E");
    for(int i=0; i<a; i++){
      for(int j=0; j<a; j++){
        if(i==0||i==a-1||j==0||i==a/2)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
    System.out.println("F");
    for(int i=0; i<a; i++){
      for(int j=0; j<a; j++){
        if(i==0||i==a/2||j==0)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
    System.out.println("G");
    for(int i=0; i<a; i++){
      for(int j=0; j<a; j++){
        if(i==0||i==a-1||j==0||(j==a-1&&i>a/2-1)||(i==a/2&&j>a/2-1)||(j==a/2&&i==a/2+1))
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
    System.out.println("H");
    for(int i=0; i<a; i++){
      for(int j=0; j<a; j++){
        if(j==0||i==a/2||j==a-1)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
    System.out.println("I");
    for(int i=0; i<a; i++){
      for(int j=0; j<a; j++){
        if(i==0||i==a-1||j==a/2)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
    System.out.println("J");
    for(int i=0; i<a; i++){
      for(int j=0; j<a; j++){
        if(i==0||j==a/2||(i==a-1&&j<a/2+1)||(j==0&&i>a/2))
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
    System.out.println("K");
    for(int i=0; i<a; i++){
      for(int j=0; j<a; j++){
          if(j==0||j==a/2-i||j==i-a/2)
            System.out.print("*");
        else
          System.out.print(" ");
        }
      System.out.println();
    }
    System.out.println("L");
    for(int i=0; i<a; i++){
      for(int j=0; j<a; j++){
        if(j==0||i==a-1||(i==a-2&&j==a-1))
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
    System.out.println("M");
    for(int i=0; i<a; i++){
      for(int j=0; j<a; j++){
        if(j==0||j==a-1||(i<=a/2&&(j==i||j==a-1-i)))
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
    System.out.println("N");
    for(int i=0; i<a; i++){
      for(int j=0; j<a; j++){
        if(j==0||j==a-1||j==i)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
    System.out.println("O");
    for(int i=0; i<a; i++){
      for(int j=0; j<a; j++){
        if(j==0||j==a-1||i==0||i==a-1)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
    System.out.println("P");
    for(int i=0; i<a; i++){
      for(int j=0; j<a; j++){
        if(j==0||i==0||i==a/2||(j==a-1&&i<=a/2))
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  
  }

}