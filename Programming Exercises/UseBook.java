/**
 * Created by Graeme on 13/09/2016.
 */
public class UseBook {

    public static void main(String[] args) {
        Fiction fiction = new Fiction("Game of Thrones");
        NonFiction nonFiction = new NonFiction("The Right Stuff");

        System.out.println("Fiction: " + fiction.getTitle() +
                " Cost: $" + fiction.getPrice());
        System.out.println("Non Fiction: " + nonFiction.getTitle() +
                " Cost: $" + nonFiction.getPrice());
    }
}
