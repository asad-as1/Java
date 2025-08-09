class Author{
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender)
    {

        this.name = name;
        this.email = email;
        this. gender = gender;
    }
    public String toString(){
        return this.name+" "+this.email+" "+this.gender;
    }
}
class Book{
    private String name;
    private Author a;
    private double price;
    private int qtyInStock;

    public Book(String name,Author a, double price, int qtyInStock)
    {
        this.name = name;
        this.a = a;
        this. price = price;
        this.qtyInStock = qtyInStock;
    }
    public String toString()
    {
        return this.name+" "+this.a+" "+this.price+" "+this.qtyInStock;
    }
}
public class Main{
    public static void main(String args[])
    {
        Author a = new Author("Amit","abc123@gmail.com",'M');
        System.out.println(a);
        Book b = new Book("Asad",a,123.0,5);
        System.out.println(b);
    }
}