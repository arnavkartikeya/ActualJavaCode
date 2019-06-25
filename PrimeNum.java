import java.util.Scanner;
class PrimeNum{
  public static void main(String[] args){
    Scanner UI = new Scanner(System.in);
    int num = UI.nextInt();
    if(isPrime(num)){
      System.out.println(num + " is prime");
    }else{
      System.out.println(num + " is not prime");
    }
  }
  public static boolean isPrime(int x){
    int max = (int) Math.sqrt(x) + 1;
    for(int i  = 3; i <= max; i+= 2){
      if(x % i == 0){
        return false;
      }
    }
    if(x > 2 && x % 2 == 0){
      return false;
    }
    return true;
  }
}
