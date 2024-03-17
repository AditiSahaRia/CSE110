public class Question_1C{
  public static void main(String[] args){
  int number=18;
  while(number<=63){
    System.out.print(number);
    if(number==63){
      System.out.print("");
    }
    else{
      System.out.print(",");
    }
    number=number+9;
  }
  }
}