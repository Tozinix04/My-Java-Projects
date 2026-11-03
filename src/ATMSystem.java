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
                    case 3:
                        System.out.printf("Suma de extras : ");
                        double extras = scanner.nextDouble();
                        if(extras <= sold) {
                            sold -= extras;
                            System.out.println("Balanță nouă : " + sold);
                        }else{
                            System.out.println("Nu ai destui bani!");
                        }
                        break;
                    case 4:
                        System.out.println("Suma creditului : " + credit);
                        System.out.printf("Suma de achitat : ");
                        double achitat = scanner.nextDouble();

                        if (achitat <= sold && achitat <= credit) {
                            sold = sold - achitat;
                            credit = credit - achitat;
                            System.out.println("Credit ramas : " + credit);
                        } else {
                            System.out.println("Suma nu este valida!");
                        }
                        break;
                    case 0:
                        System.out.println("La revedere! (Sistemul se închide...)");
                        break;

                    default:
                        System.out.println("Optiune greșită!");
                }
            }
        }else{
            System.out.println("Nr. Card sau CVV greșit!");

        }

    }
}
