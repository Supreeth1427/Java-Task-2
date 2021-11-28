import java.util.*;
class ArrayList
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements:")
    int n = sc.nextInt();
    ArrayList<Integer> ar = new ArrayList<>();
    for(int i=0;i<n;i++)
    {
      ar.add(sc.nextInt())
    }
    System.out.print("Enter the element to be removed");
    int del = sc.nextInt();
    boolean r = ar.remove(del);
    System.out.print(r);
  }
}
