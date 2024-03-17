public class logic{
  public static void main(String [] args){
    
    int x=300;
    int i=x;
    int count=0;
    while(x>0){
      
      x=x/10;
      count++;
    
    }
    
    while(i>0){
      
      int pow =10^(count-1);
      int div =i/pow;
      System.out.println(div);
      i=i%pow;
      count--;
    
    }
  
  
  }


}