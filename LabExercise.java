import java.util.Date;

public class LabExercise {

    public static void main(String[] args) {
        // creating instances of Document,Book,and data;
        String[] authors = {"Author 1","Author 2"};
        Date currentDate = new Date();

        Document document = new Document(authors,currentDate);
        Book book = new Book("Example Book", authors,currentDate);
        Email email = new Email("Example subject", new String[]{"cotyreypetrovy@gmail.com"}, authors, currentDate);
        // calling the methods from each call to demonstrate inheritanse

        System.out.println("Document Authors :"+String.join(",", document.getAuthors()));
        System.out.println("Document Date:"+document.getClass());

        System.out.println("Book Title :"+book.getTitle());
        System.out.println("Book Authors : "+String.join(",", book.getAuthors()));
        System.out.println("Book Date :"+book.getDate());

        System.out.println("Email Subject:"+email.getSubject());
        System.out.println("Email To :"+String.join(",",email.getTo())); 
        System.out.println("Email Date :"+email.getDate()); 


    } 
}