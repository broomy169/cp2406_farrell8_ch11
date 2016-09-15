/**
 * Created by Graeme on 13/09/2016.
 */
public class OnlineNewspaperSubscription extends NewspaperSubscription {
    @Override
    public void setAddress(String address) {
        boolean hasAtSign = false;

        this.address = address;
        for (int i = 0; i< address.length(); ++i){
            if(address.charAt(i) == '@') hasAtSign = true;
        }

        if(hasAtSign) {
            rate = 9.00;
        } else {
            rate = 0;
            System.out.println("Address must contain @");
        }
    }
}
