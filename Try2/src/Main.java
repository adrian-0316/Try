import javax.print.MultiDocPrintService;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int number1, number2;
    static Operation operation;
    static String stringResult;
    static int result = Integer.parseInt(stringResult);
    static String userInput = scanner.nextLine();
    public static String calc(String userInput) {
        return stringResult;
    }
    //String valueOfCalc = String.valueOf(calc());
    //num = Roman.valueOf("II").getValue();
    public static void main(String[] args) {
        System.out.println("Enter your expression:");
        char[] under_char = new char[10];
        String userInput = scanner.nextLine();
        for (int i = 0; i < userInput.length(); i++) {
            under_char[i] = userInput.charAt(i);
            if (under_char[i] == '+') {
                operation = Operation.SUM;
            }
            if (under_char[i] == '-') {
                operation = Operation.SUB;
            }
            if (under_char[i] == '*') {
                operation = Operation.MULT;
            }
            if (under_char[i] == '/') {
                operation = Operation.DIV;
            }
            System.out.println(i);
        }
    String under_charString = String.valueOf(under_char);
    String[] parts = under_charString.split("[+-/*]");
    String numera0 = parts[0];
    String numera1 = parts[1];
    String cutNumera1 = numera1.trim();
    number1 = romanToNum(numera0);
    number2 = romanToNum(cutNumera1);
        if (number1 < 0 && number2 < 0) {
        result = 0;
    } else {
        result = operation.action(number1, number2);
        //римские цифры
        String resultRoman = inputToRoman(result);
        System.out.println(resultRoman);
    }
    number1 = Integer.parseInt(numera0);
    number2 = Integer.parseInt(cutNumera1);
    result = operation.action(number1, number2);
    //арабские цифры
        System.out.println(result);
}

    private static String inputToRoman (int numArabian) {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"
        };
        final String s = roman[numArabian];
        return s;
    }


    private static int romanToNum (String roman) {
        try {
            switch (roman) {
                case "I":
                    return 1;
                case "II":
                    return 2;
                case "III":
                    return 3;
                case "IV":
                    return 4;
                case "V":
                    return 5;
                case "VI":
                    return 6;
                case "VII":
                    return 7;
                case "VIII":
                    return 8;
                case "IX":
                    return 9;
                case "X":
                    return 10;
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Incorrect data form");
        }
        return -1;
    }
}