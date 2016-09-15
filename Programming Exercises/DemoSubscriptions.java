/**
 * Created by Graeme on 13/09/2016.
 */
public class DemoSubscriptions {
    public static void main(String[] args) {
        PhysicalNewspaperSubscription sub1 = new PhysicalNewspaperSubscription();
        PhysicalNewspaperSubscription sub1wrong = new PhysicalNewspaperSubscription();

        OnlineNewspaperSubscription sub2 = new OnlineNewspaperSubscription();
        OnlineNewspaperSubscription sub2wrong = new OnlineNewspaperSubscription();

        sub1.setName("Eric");
        sub1.setAddress("10 Yellow St");
        display(sub1);

        sub1wrong.setName("John");
        sub1wrong.setAddress("Jelly Court");
        display(sub1wrong);

        sub2.setName("Tim");
        sub2.setAddress("tim@gmail.com");
        display(sub2);

        sub2wrong.setName("Jerry");
        sub2wrong.setAddress("jerryatgmail.com");
        display(sub2wrong);

    }

    public static void display(NewspaperSubscription subscription) {
        System.out.println("Name: " + subscription.getName());
        System.out.println("Address: " + subscription.getAddress());
        System.out.println("Rate: " + subscription.getRate());
        System.out.println();
    }
}
