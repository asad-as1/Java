import java.util.Scanner;
class combination{

  public static int fact(int n)
  {
    int f = 1;
    while(n > 1)
    {
      f *= n;
      n-- ;
    }
    return f;
  }

  public static int comb(int n, int r)
  {
    return fact(n)/(fact(r) * fact(n-r));
  }

  public static void main(String args[])
  {
    Scanner sc  = new Scanner(System.in);
    System.out.println("Combinations : " + comb(9,5));
    sc.close();
  }
}