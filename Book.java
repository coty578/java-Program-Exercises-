import java.util.Date;
public class Book extends Document {
    private String title;

    public Book(String title,String[] authors,Date date){
        super(authors,date);
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    
}
