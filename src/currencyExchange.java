import java.util.Scanner;

public class currencyExchange {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Main currency is MDL (Leu Moldovenesc)

        // List Currency to MDL Exchange
        double usdValueSell = 18.19;
        double usdValueBuy = 17.91;
        double euroValueSell = 20.36;
        double euroValueBuy = 20.11;
        double ronValueSell = 3.72;
        double ronValueBuy = 3.83;

        // Currency Exchanges
        double usdToEuro = 0.89;
        double euroToUsd = 1.12;
        double usdToRon = 4.77;
        double euroToRon = 5.34;
        double ronToEuro = 0.19;
        double ronToUsd = 0.21;
        double convert = 0;


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

        switch (option) {
            case 1: // USD
                System.out.printf("Enter USD amount: ");
                double usd = input.nextDouble();
                System.out.println("--------------------------");
                System.out.println("What currency you need? : ");
                System.out.println("1 - EURO , 2 - RON , 3 - MDL");
                System.out.printf("Currency : ");
                int option2 = input.nextInt();

                if(option2 == 1){
                    System.out.println("--------------------------");
                    System.out.println("Converting (USD to EURO)");
                    convert = usd * usdToEuro;
                    System.out.println("Converted " + usd + " USD" + " to " + convert + " EURO");
                    System.out.println("--------------------------");
                }else if(option2 == 2){
                    System.out.println("--------------------------");
                    System.out.println("Converting (USD to RON)");
                    convert = usd * usdToRon;
                    convert = Math.floor(convert * 100) / 100;
                    System.out.println("Converted " + usd + " USD" + " to " + convert + " RON");
                    System.out.println("--------------------------");
                }else if(option2 == 3){
                    System.out.println("--------------------------");
                    System.out.println("Converting (USD to MDL)");
                    convert = usd * usdValueBuy;
                    convert = Math.floor(convert * 100) / 100;
                    System.out.println("Converted " + usd + " USD" + " to " + convert + " MDL");
                    System.out.println("--------------------------");
                }

        }
    }
}
