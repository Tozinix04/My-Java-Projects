import java.util.Scanner;

public class currencyExchange {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double usdValueSell = 18.19;
        double usdValueBuy = 17.91;
        double euroValueSell = 20.36;
        double euroValueBuy = 20.11;
        double ronValueSell = 3.72;
        double ronValueBuy = 3.83;


        System.out.println("\n---- Currency List ----");
        System.out.println("1 - USD");
        System.out.println("2 - EURO");
        System.out.println("3 - RON");
        System.out.println("4 - MDL");
        System.out.println("0 - Exit System");

        System.out.println("--------------------------");
        System.out.printf("What currency you have ? : ");
        int option = input.nextInt();
        System.out.println("--------------------------");


    }
}
