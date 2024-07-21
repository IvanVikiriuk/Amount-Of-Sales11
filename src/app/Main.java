package app;

public class Main {

    static double quota;
    static double price;
    private final static String CURRENCY = "EUR";

    public static void main(String[] args) {

        quota = 5;
        price = 2430.682;

        double cost = quota * price;
        double total = 12153.41;
        double day = 5;
        double res = total / day;

        System.out.printf("Product No 1: smartphone," +
                "\ntotal sales for 5 days is %s %.2f," +
                "\nsales by day is %s %.2f.", CURRENCY, cost, CURRENCY, res);

        quota = 7;
        price = 1498.12143;

        cost = quota * price;
        total = 10486.85;
        day = 7;
        res = total / day;

        System.out.printf("\nProduct No 2: laptop," +
                "\ntotal sales for 7 days is %s %.2f," +
                "\nsales by day is %s %.2f.", CURRENCY, cost, CURRENCY, res);
    }
}
