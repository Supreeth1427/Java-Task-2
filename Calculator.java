import java.util.*;
class Main
{
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number:");
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println("Enter the operator:");
      String opr = sc.next();
      switch(opr)
      {
        case "+" : System.out.println(a+b); 
          break;
        case "-" : System.out.println(a-b); 
          break;
        case "*" : System.out.println(a*b); 
          break;
       case "/" : System.out.println(a/b); 
          break;
      default: System.out.print("Wrong operator input");
      }
  }
}
