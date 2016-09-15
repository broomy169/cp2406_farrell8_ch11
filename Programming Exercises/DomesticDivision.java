/**
 * Created by Graeme on 14/09/2016.
 */
public class DomesticDivision extends Division {

    protected String state;

    public DomesticDivision(String divisionTitle, int account, String state){
        super(divisionTitle, account);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("International Division: " + divisionTitle);
        System.out.println("Account No.: " + accountNum);
        System.out.println("Located: " + state);
    }
}
