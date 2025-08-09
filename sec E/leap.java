class leap{
    public static void main(String args[])
  {
    int y = 1210;
    boolean b = (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    System.out.println(b);
  }
}
  