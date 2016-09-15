/**
 * Created by Graeme on 13/09/2016.
 */
public class IncomingPhoneCall extends PhoneCall {

    public final static double RATE = 0.02;

    public IncomingPhoneCall(String phoneNumber){
        super(phoneNumber);
    }
    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void getInfo() {
        System.out.println("Incoming phone call " + getPhoneNumber());
        System.out.println( RATE + " per call. Total is $" + getPrice());
    }
}
