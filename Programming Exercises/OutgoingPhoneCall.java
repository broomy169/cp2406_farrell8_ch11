/**
 * Created by Graeme on 13/09/2016.
 */
public class OutgoingPhoneCall extends PhoneCall {

    public final static double RATE = 0.04;
    private int minutes;

    public OutgoingPhoneCall(String phoneNumber, int minutes){
        super(phoneNumber);
        this.minutes = minutes;
        price = minutes * RATE;
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
        System.out.println("Outgoing phone call " + getPhoneNumber());
        System.out.println( RATE + " per call. Total is $" + getPrice());
    }
}
