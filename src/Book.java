import java.util.LinkedHashSet;

public class Book {
    int id, qty;
    String name, author, publisher;

    public Book(int id, String name, String author, String publisher, int qty) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.qty = qty;
    }
}
class setHashLinked{
    public static void main(String[] args) {
        LinkedHashSet<Book> lhs = new LinkedHashSet<Book>();
        Book b1 = new Book(1234, "Java for Begginers","James Gozlin", "Sun Micro System",10 );
        Book b2 = new Book(1235, "C for Begginers","C Creator", "C Company",7 );
        Book b3 = new Book(1236, "How to steel Tempered","Nokolai Owsthrowski", "ABC Books", 9 );
        lhs.add(b1);
        lhs.add(b2);
        lhs.add(b3);
        for(Book b: lhs){
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.qty);
        }
    }
}
