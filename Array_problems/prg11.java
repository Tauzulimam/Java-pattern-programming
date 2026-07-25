//Dynamic concatinating of string ....
import java.util.Scanner;

class DynamicConcatination
{
public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();  //Hello
    String str2 = sc.next();  //World
    str1 = str1 + " " + str2;
    System.out.print("Concatinated String : "+str1);  //Hello World
  }
}
