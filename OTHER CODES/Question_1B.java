public class Question_1B{
  public static void main(String[] args){
    int number=-10;
    while(number<=20){
      System.out.print(number);
      if(number==20){
        System.out.print("");
      }
      else{
        System.out.print(",");
      }
      number=number+5;
    }
  }
}