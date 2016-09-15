/**
 * Created by Graeme on 14/09/2016.
 */
public class UseDivision {
    public static void main(String[] args) {
        DomesticDivision domesticDivision = new DomesticDivision("Accounting", 1, "QLD");
        DomesticDivision domesticDivision2 = new DomesticDivision("Human Resources", 2, "QLD");
        InternationalDivision internationalDivision = new InternationalDivision("Accounting", 3, "England", "English");
        InternationalDivision internationalDivision2 = new InternationalDivision("Human Resources", 4, "Paris", "French");

        domesticDivision.display();
        domesticDivision2.display();
        internationalDivision.display();
        internationalDivision2.display();

    }
}