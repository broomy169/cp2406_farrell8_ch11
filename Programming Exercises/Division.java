/**
 * Created by Graeme on 14/09/2016.
 */
public abstract class Division {
    protected String divisionTitle;
    protected int accountNum;

    public Division(String divisionTitle, int accountNum){
        this.divisionTitle = divisionTitle;
        this.accountNum = accountNum;
    }

    public abstract void display();
}
