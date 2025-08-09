import java.util.*;
public class panagram2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1=sc.nextLine();
        // converting all characters into small characters.
        String s = s1.toLowerCase();
        sc.close();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            set.add(s.charAt(i));
        }
        int c=0;
        for(char i='a';i<='z';i++)
        {
            if(!set.contains(i))
            {
                c=1;
                System.out.print("Not panagram");
                break;
            }
        }
        if(c==0)
        System.out.print("Panagram");
    }
}
