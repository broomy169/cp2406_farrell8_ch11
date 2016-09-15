/**
 * Created by Graeme on 13/09/2016.
 */
public class PhysicalNewspaperSubscription extends NewspaperSubscription {

    @Override
    public void setAddress(String address) {
        boolean hasDigit = false;

        this.address = address;
        for (int i = 0; i< address.length(); ++i){
            if(Character.isDigit(address.charAt(i))) hasDigit = true;
        }

        if(hasDigit) {
            rate = 15.00;
        } else {
            rate = 0;
            System.out.println("Address must contain digit");
        }
    }
}
