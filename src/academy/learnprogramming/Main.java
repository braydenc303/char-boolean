package academy.learnprogramming;

public class Main {
    public static void main(String[] args) throws Exception {

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        char myCopyrightChar = '\u00a9';

        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        // boolean values are typically named starting with is, in order to convey that they are storing a boolean answer to a question.
        boolean isCustomerOverTwentyOne = true;

        System.out.println(myTrueBooleanValue);

    }
}