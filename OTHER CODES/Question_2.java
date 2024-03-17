public class Question_2{
  public static void main(String[] args){
    int number=0;
    int sum=0;
    while(number<=600){
      if(number%7==0){
        if(number%9==0){
          sum=sum+number;
        }
      }
      number=number+1;
    }
    System.out.println(sum);
  }
}
    