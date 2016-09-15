/**
 * Created by Graeme on 13/09/2016.
 */
public abstract class PhoneCall {
    String phoneNumber;
    double price;

    public PhoneCall(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        price = 0.0;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public abstract String getPhoneNumber();
    public abstract double getPrice();
    public abstract void getInfo();

}
