/**
 * Created by Graeme on 13/09/2016.
 */
public class Fiction extends Book {
    public Fiction(String title){
        super(title);
        setPrice();
    }

    @Override
    public void setPrice() {
        super.price = 24.99;
    }
}
