public class string1
{
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        String name = "Mohd Asad";
        String lastName = "Ansari";
        //Concatenation of two string.
        String fullName = name+" "+lastName;
        System.out.println("Your full name is: "+fullName);
        // Length function.
        System.out.println("Length of the full name: "+fullName.length());

// Character at function    {charAt(i)}.
        for(int i=0;i<fullName.length();i++)
        System.out.println(fullName.charAt(i));
    }
}
