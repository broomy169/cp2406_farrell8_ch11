/**
 * Created by Graeme on 13/09/2016.
 */
public class DemoPhoneCall {

    public static void main(String[] args) {
        IncomingPhoneCall incomingPhoneCall = new IncomingPhoneCall("1234-1234");
        OutgoingPhoneCall outgoingPhoneCall = new OutgoingPhoneCall("1111-2222", 5);

        incomingPhoneCall.getInfo();
        outgoingPhoneCall.getInfo();
    }
}
