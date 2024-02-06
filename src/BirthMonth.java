public class BirthMonth
{
    public static void main(String[] args) {
        //declaring variables
        int birthMonth = 0;
        //output prompt
        System.out.println("What is your Birth Month as an integer 1-12.");
        //fake user input
        birthMonth = 80;
        //tests for proper input
        if (birthMonth <= 12 && birthMonth > 0) {
            System.out.print("Your birth month is: " + birthMonth + ".");
        } else {
            System.out.print("You entered an invalid input " + birthMonth + " - Please enter a valid number 1-12.");

        }
    }
}