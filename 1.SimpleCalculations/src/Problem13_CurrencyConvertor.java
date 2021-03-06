import java.util.Scanner;

public class Problem13_CurrencyConvertor {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double money = Double.parseDouble(console.nextLine());
        String FromCurrency = console.nextLine();
        String ToCurrency = console.nextLine();
        double result;
        //From BGN:

        if (FromCurrency.equals("BGN") && ToCurrency.equals("USD")) {
            result = money * 1 / 1.79549;
            System.out.printf("%.2f USD", result);
        }

        if (FromCurrency.equals("BGN") && ToCurrency.equals("EUR")) {
            result = money * 1 / 1.95583;
            System.out.printf("%.2f EUR", result);
        }

        if (FromCurrency.equals("BGN") && ToCurrency.equals("GBP")) {
            result = money * 1 / 2.53405;
            System.out.printf("%.2f GBP", result);
        }

        //From USD:

        if (FromCurrency.equals("USD") && ToCurrency.equals("BGN")) {
            result = money * (1.79549 / 1);
            System.out.printf("%.2f BGN", result);
        }

        if (FromCurrency.equals("USD") && ToCurrency.equals("EUR")) {
            result = money * 1 / (1.95583 / 1.79549);
            System.out.printf("%.2f EUR", result);
        }

        if (FromCurrency.equals("USD") && ToCurrency.equals("GBP")) {
            result = money * 1 / (2.53405 / 1.79549);
            System.out.printf("%.2f GBP", result);
        }

        //From EUR:

        if (FromCurrency.equals("EUR") && ToCurrency.equals("BGN")) {
            result = money * 1 / (1 / 1.955581);
            System.out.printf("%.2f BGN", result);
        }

        if (FromCurrency.equals("EUR") && ToCurrency.equals("USD")) {
            result = money * 1 / (1.79549 / 1.95583);
            System.out.printf("%.2f USD", result);
        }

        if (FromCurrency.equals("EUR") && ToCurrency.equals("GBP")) {
            result = money * 1 / (2.53405 / 1.955581);
            System.out.printf("%.2f GBP", result);
        }

        //From GBP:

        if (FromCurrency.equals("GBP") && ToCurrency.equals("BGN")) {
            result = money * 1 / (1 / 2.53405);
            System.out.printf("%.2f BGN", result);
        }

        if (FromCurrency.equals("GBP") && ToCurrency.equals("USD")) {
            result = money * 1 / (1.79549 / 2.53405);
            System.out.printf("%.2f USD", result);
        }

        if (FromCurrency.equals("GBP") && ToCurrency.equals("EUR")) {
            result = money * 1 / (1.95583 / 2.53405);
            System.out.printf("%.2f EUR", result);
        }
    }
}

