import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int input = 0;
        String quit = "nein";
        Arbeitnehmer[] liste = new Arbeitnehmer[1000];
        int i = 0;

        while (!quit.equalsIgnoreCase("ja")) {
        System.out.print("Wollen Sie einen Arbeiter (1) oder einen Angestellten (2) eingeben: ");
        input = scanner.nextInt();

        do {
            switch (input) {
                case 1:
                    newArbeiter(liste, i);
                    break;
                case 2:
                    newAngestellter(liste, i);
                    break;
                default:
                    System.out.print("Bitte neu eingeben: ");
                    input = scanner.nextInt();
                    switch (input) {
                        case 1:
                            newArbeiter(liste, i);
                            break;
                        case 2:
                            newAngestellter(liste, i);
                            break;
                    }
                    break;
            }
        } while (input < 1 || input > 2);
        printListe(liste);
        System.out.print("Wollen Sie das Programm beenden? ");
        quit = scanner.next();

        i++;
        }

    }

    private static void newAngestellter(Arbeitnehmer[] liste, int i) {
        double gehalt = 0d;
        String beruf = "";
        String arbeitgeber = "";


        System.out.print("\nBeruf des Angestellten: ");
        beruf = scanner.next();

        System.out.print("Arbeitgeber des Angestellten: ");
        arbeitgeber = scanner.next();

        System.out.print("Gehalt des Angestellten: ");
        gehalt = scanner.nextDouble();

        liste[i] = new Angestellter(beruf, arbeitgeber, gehalt);
    }

    private static void newArbeiter(Arbeitnehmer[] liste, int i) {
        String beruf = "";
        String arbeitgeber = "";
        double stundenlohn = 0d;

        System.out.print("\nBeruf des Arbeiters: ");
        beruf = scanner.next();

        System.out.print("Arbeitgeber des Arbeiters: ");
        arbeitgeber = scanner.next();

        System.out.print("Stundenlohn des Arbeiters: ");
        stundenlohn = scanner.nextDouble();

        liste[i] = new Arbeiter(beruf, arbeitgeber, stundenlohn);
    }

    private static void printListe(Arbeitnehmer[] liste) {

        System.out.println("\n\n");
        for (int i = 0; i < liste.length; i++) {
            if (liste[i] instanceof Angestellter) {
                System.out.printf("Angestellter: Mit dem Beruf %s beim Arbeitgeber %s verdient %.2f€ Gehalt.%n", liste[i].beruf, liste[i].arbeitGeber, liste[i].getEntgelt());
            }
            else if (liste[i] instanceof Arbeiter) {
                System.out.printf("Arbeiter: Mit dem Beruf %s beim Arbeitgeber %s verdient %.2f€ Stundenlohn.%n", liste[i].beruf, liste[i].arbeitGeber, liste[i].getEntgelt());
            }
        }
    }
}
