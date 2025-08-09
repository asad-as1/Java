import java.util.Scanner;
class panagram1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        sc.close();
        int count=0;
        for(char i='a',j='A';i<='z';i++,j++)
        {
            for(int k=0;k<s.length();k++)
            {
                if(s.charAt(k)==i || s.charAt(k)==j)
                {
                count=1;
                break;
                }
            }
            if(count==0)
            break;
        }
        if(count==1)
        System.out.print("Panagram");
        else
        System.out.print("not");
    }
}