public class Qustion_1A{
  public static void main(String [] args){
    int first=24;
    while(first>=-6){
      System.out.print(first);
      if(first==-6){
        System.out.print("");
      }
      else{
        System.out.print(",");
      }
      first=first-6;
    }
  }
}