/**
 * Created by Graeme on 13/09/2016.
 */
public abstract class NewspaperSubscription {
    protected String name;
    protected String address;
    protected double rate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public double getRate() {
        return rate;
    }

    public abstract void setAddress(String address);
}
