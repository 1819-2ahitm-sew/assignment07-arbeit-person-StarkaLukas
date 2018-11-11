import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        String filename = "./personen.csv";
        Person[] people = new Person[getNumberofPersons(filename)];


        printPeople(readFile(filename, person, people));



    }

    private static void printPeople(Person[] readFile) {
        for (int i = 0; i < readFile.length; i++) {
            System.out.println(readFile[i].personToString());
        }
    }

    private static int getNumberofPersons(String filename) {
        int number = -1;

        try (Scanner scanner = new Scanner(new FileReader(filename))) {
            while (scanner.hasNextLine()) {
                number++;
                scanner.nextLine();
            }
        }
        catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

        return number;
    }

    private static Person[] readFile(String filename, Person person, Person[] people) {
        String line = "";
        int i = 0;

        try (Scanner scanner = new Scanner(new FileReader(filename))) {
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                String[] names = line.split(";");


                people[i] = new Person(names[0], names[1]);
                i++;
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return people;
    }
}
