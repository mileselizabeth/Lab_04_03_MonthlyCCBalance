// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double creditCardBalance = 5000;
        double interestAfterOneMonth = creditCardBalance * .17;
        double interestAfterTwoMonths = .17 * (creditCardBalance + interestAfterOneMonth);
        System.out.println( " The interest on your credit card balance of " + creditCardBalance + " after one month is " + interestAfterOneMonth);
        System.out.println( " The interest on your credit card balance of " + creditCardBalance + " after two months is " + interestAfterTwoMonths);
    }
}