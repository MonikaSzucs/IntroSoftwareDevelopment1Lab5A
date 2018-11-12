
/**
 * Write a description of class Person here.
 *
 * @author Monika Szucs
 * @version October 13 2018
 */
public class Person
{
    private static final double POUNDS_TO_KILOGRAMS = 0.454;
    private static final int    CURRENT_YEAR = 2018;

    // instance variables - replace the example below with your own
    private String  firstName;
    private String  lastName;
    private int     birthYear;
    private String    sex;
    private double  weightPounds;
    private String  educationLevel;

    /**
     * Constructor for objects of class Person taking all 6 values
     */
    public Person(  String  firstName,
    String  lastName,
    int     birthYear,
    String  sex,
    double  weightPounds,
    String  educationLevel
    )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.sex = sex;
        this.weightPounds = weightPounds;

        switch(educationLevel){
            case "high school":
            case "undergraduate":
            case "graduate":
            this.educationLevel = educationLevel;
            break;
            default:
            System.out.println("Invalid Education Level.");
            break;
        }

        switch(sex){
            case "male":
            case "female":
            this.sex = sex;
            break;
            default:
            System.out.println("No defined sex");
            break;
        }

    }

    /**
     * Constructor for objects of class Person taking 5 values but setting BirthYear to 2018
     */
    public Person(  String  theFirstName,
    String  theLastName,
    String    theSex,
    double  theWeightPounds,
    String  educationLevel
    )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = 2018;
        this.sex = sex;
        this.weightPounds = weightPounds;

        switch(educationLevel){
            case "high school":
            case "undergraduate":
            case "graduate":
            this.educationLevel = educationLevel;
            break;
            default:
            System.out.println("Invalid Education Level.");
            break;
        }

        switch(sex){
            case "male":
            case "female":
            this.sex = sex;
            break;
            default:
            System.out.println("No defined sex");
            break;
        }
    }

    /**
     * Constructor for objects of class Person taking 3 values but setting birthYear to 2018, sex to female, and eduvational level to high school
     */
    public Person(  String  firstName,
    String  lastName,
    double  weightPounds
    )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = 2018;
        this.sex = "female";
        this.weightPounds = weightPounds;
        this.educationLevel = "High School";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printDetails()
    {
        // put your code here
        System.out.println(firstName + " " + lastName + " was born in " + birthYear + "." + sex() + " weighs " + weightPounds + " pounds and " + sex() + " he has an " + educationLevel);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printDetails(boolean kilograms)
    {
        // put your code here
        System.out.println(firstName + " " + lastName + " was born in " + birthYear + ". " + firstSex() + " weighs " + weight(kilograms) + " and " + sex() + " has an " + educationLevel + " degree.");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printDetails(boolean kilograms, boolean uppercase)
    {
        // put your code here
        System.out.println(names(uppercase) + " was born in " + birthYear + ". " + firstSex() + " weighs " + weight(kilograms) + " and " + sex() + " has an " + educationLevel + " degree.");
    }

    private String firstSex()
    {

        if(sex.equals("male"))
        {
            return "He";
        }
        else if(sex.equals("female"))
        {
            return "She";
        }
        else{
            throw new IllegalArgumentException("There is no sex defined.");
        }

    }

    private String sex()
    {

        if(sex.equals("male"))
        {
            return "he";
        }
        else if(sex.equals("female"))
        {
            return "she";
        }
        else{
            throw new IllegalArgumentException("There is no sex defined.");
        }

    }

    private String weight(boolean showKilograms)
    {
        double kilogram = weightPounds * POUNDS_TO_KILOGRAMS;

        if(showKilograms){
            return kilogram + " kilograms ";
        }
        else {
            return weightPounds + " pounds ";
        }

    }

    private String names(boolean uppercase)
    {

        if(uppercase){
            return firstName.toUpperCase() + " " + lastName.toUpperCase();
        }
        else {
            return firstName.toLowerCase() + " " + lastName.toLowerCase();
        }

    }

    public void displayAges(){
        int year = birthYear;
        int age = 0;

        while (year <= CURRENT_YEAR){

            if(year < CURRENT_YEAR){
                System.out.println("In " + year + " " + firstName + " " + lastName + " was " + age + " years old.");
                age++;
                year++;
            }
            else {
                System.out.println("In " + year + " " + firstName + " " + lastName + " is " + age + " years old.");
                age++;
                year++;
            }
        }

    }
}
