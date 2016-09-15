/**
 * Created by Graeme on 14/09/2016.
 */
public class InternationalDivision extends Division {
    protected String country;
    protected String language;

    public InternationalDivision(String divisionTitle, int account, String country, String language ){
        super(divisionTitle, account);
        this.country = country;
        this.language = language;
    }


    @Override
    public void display() {
        System.out.println("International Division: " + divisionTitle);
        System.out.println("Account No.: " + accountNum);
        System.out.println("Located: " + country);
        System.out.println("Language: " + language);
    }
}
