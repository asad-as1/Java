public class Var
{
    int i=10;
    public void methodOne()
    {
        System.out.println(i);     //10(valid)
    }

    public static void main(String[] args) 
    {
    //System.out.println(i);//C.E:non-static variable i cannot be referenced from a static context(invalid)

        Var t = new Var();
        System.out.println(t.i);//10(valid)
        t.methodOne();
    } 
}