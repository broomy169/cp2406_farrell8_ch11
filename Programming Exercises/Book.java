/**
 * Created by Graeme on 13/09/2016.
 */
public abstract class Book {
    String title = new String();
    double price;

    public Book(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public double getPrice(){
        return price;
    }

    public abstract void setPrice();

}
