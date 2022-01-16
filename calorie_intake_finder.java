        /*
a. - Use the Harris-Benedict equation to estimate the number of calories a man needs to eat to
maintain your weight (called the Basal Metabolic Rate or BMR). (See the textbook if you
want the equation for a woman’s BMR.)
BMR = 66 + (6.3*weight in pounds) + (12.9*height in inches) – (6.8*age in years)
 */


public class practice {
    public static void main(String[] args) throws InterruptedException {
        double weight_in_pounds = 134.482;
        double height_in_inches = 72.0472;
        double age_in_years = 21;
        double bmr = 66 + (6.3*weight_in_pounds) + (12.9*height_in_inches) - (6.8*age_in_years);
        System.out.println(bmr);
    }
}
/*seems my calorie is not enough for my workout !*/
