public class AccessModifiers {
    public static void main(String[] args) {
        Bank acc = new Bank();
        
    /*  It gives an error :- The field Bank.password is not visible
        acc.password = "asad";   */
        acc.setPassword("asad");

        acc.username = "Mohd Asad Ansari";
        System.out.println(acc.username);
    }
}

class Bank{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
        System.out.println("Your password is :-  " + password);
    }
}
