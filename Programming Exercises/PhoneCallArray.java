/**
 * Created by Graeme on 13/09/2016.
 */
public class PhoneCallArray {
    public static void main(String[] args) {
        PhoneCall calls[] = new PhoneCall[10];
        calls[0] = new IncomingPhoneCall("1111-1111");
        calls[1] = new IncomingPhoneCall("2222-2222");
        calls[2] = new IncomingPhoneCall("3333-3333");
        calls[3] = new IncomingPhoneCall("4444-4444");
        calls[4] = new IncomingPhoneCall("5555-5555");
        calls[5] = new OutgoingPhoneCall("1111-1111", 5);
        calls[6] = new OutgoingPhoneCall("2222-2222", 10);
        calls[7] = new OutgoingPhoneCall("3333-3333", 15);
        calls[8] = new OutgoingPhoneCall("4444-4444", 20);
        calls[9] = new OutgoingPhoneCall("5555-5555", 25);

        for (int i = 0; i < calls.length; ++i){
            calls[i].getInfo();
        }
    }
}
