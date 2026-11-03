import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String cardCorrect = "1234";
        String cvvCorrect = "333";
        String nume = "Carauș Cristian";
        String telefon = "+373 69 456 546";
        double sold = 1000.0;
        double credit = 500.0;

        System.out.println("=============================");
        System.out.printf("Întroduce numărul cardului : ");
        String card = scanner.nextLine();
        System.out.printf("Întroduce CVV-ul cardului : ");
        String cvv = scanner.nextLine();
        System.out.println("=============================");

        if(card.equals(cardCorrect) && cvv.equals(cvvCorrect)) {

            int optiune = -1;

            while(optiune != 0) {

                System.out.println();
                System.out.println("----- MENIU ----");
                System.out.println("1 - Date Personale");
                System.out.println("2 - Depozitare");
                System.out.println("3 - Extragere");
                System.out.println("4 - Achitare Credit");
                System.out.println("0 - Ieșire Sistem");
                System.out.println("--------------------------");
                System.out.printf("Alege opțiunea : ");
                optiune = scanner.nextInt();
                System.out.println("--------------------------");

                switch (optiune) {
                    case 1:
                        System.out.println("Numele, Prenumele : " + nume);
                        System.out.println("Balanța : " + sold);
                        System.out.println("Credit : " + credit);
                        System.out.println("Nr. de Telefon : " + telefon);
                        break;
                    case 2:
                        System.out.printf("Suma de depozitare : ");
                        double depozitare = scanner.nextDouble();
                        sold += depozitare;
                        System.out.println("Balanță nouă : " + sold);
                        break;
                }


            }
        }else{
            System.out.println("Nr. Card sau CVV greșit!");

        }

    }
}
