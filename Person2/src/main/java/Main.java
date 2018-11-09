import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String filename = "personen.csv";

    }

    private static String readFile(String filename) {
        StringBuilder stringBuilder = new StringBuilder();

        try (Scanner scanner = new Scanner(new FileReader(filename))) {
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine());
                stringBuilder.append("\n");
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return stringBuilder.toString();
    }
}
