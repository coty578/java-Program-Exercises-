import java.util.Date;
public class Document {
    private String[] authors;
    private Date date;

    public Document(String[] authors,Date date){
        this.authors = authors;
        this.date = date;
    }
    public String[] getAuthors(){
        return authors;
    }
    public void addAuthor(){
        // code to add an author to the array
        // Assuming the name is added to the existing array or a new is created with additional authors
    }
    public Date getDate(){
        return date;
    }
}
