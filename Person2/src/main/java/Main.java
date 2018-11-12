import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        Person[] personenliste = new Person[1000];
        int input = 0;
        int personenlisteLength = 0;
        int i = 0;




        writeMenu();
        input = scanner.nextInt();

        while (input != 6) {
            switch (input) {
                case 1:
                    inputPupil(personenliste, i);
                    break;
                case 2:
                    inputStudent(personenliste, i);
                    break;
                case 3:
                    personenlisteLength = getLengthofList(personenliste);
                    writeList(personenliste, personenlisteLength);
                    break;
                case 4:
                    personenlisteLength = getLengthofList(personenliste);
                    writePupil(personenliste, personenlisteLength);
                    break;
                case 5:
                    personenlisteLength = getLengthofList(personenliste);
                    writeStudent(personenliste, personenlisteLength);
                    break;
            }
            writeMenu();
            input = scanner.nextInt();
            i++;
        }
    }

    private static int getLengthofList(Person[] personenliste) {
        int length = 0;

        for (int i = 0; i < personenliste.length; i++) {
            if (personenliste[i] != null) {
                length++;
            }
        }

        return length;
    }

    private static void writeStudent(Person[] personenliste, int personenlisteLength) {
        for (int i = 0; i < personenlisteLength; i++) {

            if (personenliste[i] instanceof Student) {

                Student student = (Student) personenliste[i];
                System.out.println(student.personToString());
            }
        }
    }

    private static void writePupil(Person[] personenliste, int personenlisteLength) {
        for (int i = 0; i < personenlisteLength; i++) {

            if (personenliste[i] instanceof Schueler) {

                Schueler schueler = (Schueler) personenliste[i];
                System.out.println(schueler.personToString());
            }
        }
    }

    private static void inputStudent(Person[] personenliste, int i) {
        String vorname = "";
        String nachname = "";
        String universitaet = "";
        String studienfach = "";
        int matrikelNr = 0;

        System.out.print("\nVorname des Studenten: ");
        vorname = scanner.next();

        System.out.print("Nachname des Studenten: ");
        nachname = scanner.next();

        System.out.print("Universiät, auf der der Student studiert: ");
        universitaet = scanner.next();

        System.out.print("Fach, welches der Student studiert: ");
        studienfach = scanner.next();

        System.out.print("Matrikelnummer des Studenten: ");
        matrikelNr = scanner.nextInt();

        personenliste[i] = new Student(vorname, nachname, universitaet, matrikelNr, studienfach);

    }

    private static void inputPupil(Person[] personenliste, int i) {
        String vorname = "";
        String schule = "";
        String klasse = "";
        int katalogNr = 0;
        String nachname = "";

        System.out.print("Vorname des Schülers: ");
        vorname = scanner.next();

        System.out.print("Nachname des Schülers: ");
        nachname = scanner.next();

        System.out.print("Schule, welche der Schülers besucht: ");
        schule = scanner.next();

        System.out.print("Klasse, in welche der Schüler geht: ");
        klasse = scanner.next();

        System.out.print("Katalognummer des Schülers: ");
        katalogNr = scanner.nextInt();


        personenliste[i] = new Schueler(vorname, nachname, schule, klasse, katalogNr);
    }

    private static void writeList(Person[] personenliste, int personenlisteLength) {
        if (personenlisteLength == 0) {
            System.out.println("\nEs sind derzeit noch keine Personen vorhanden!");
        }
        else {


            for (int i = 0; i < personenlisteLength; i++) {

                if (personenliste[i] instanceof Schueler) {

                    Schueler s = (Schueler) personenliste[i];
                    System.out.println(s.personToString());

                } else if (personenliste[i] instanceof Student) {

                    Student s = (Student) personenliste[i];
                    System.out.println(s.personToString());
                }
            }
        }
    }



    private static void writeMenu() {
        System.out.printf("%n1 - Eingabe eines Schülers%n2 - Eingabe eines Studenten%n3 - Ausgabe der Liste am Bildschirm%n4 - Ausgabe aller Schüler am Bildschirm%n5 - Ausgabe aller Studenten am Bildschirm%n6 - Beenden des Programmes%n%nWelche Option möchten Sie durchführen: ");
    }
}
