public class Schueler extends Person{

    private String schule;
    private String klasse;
    private int katalogNr;

    public Schueler(String vorname, String nachname, String schule, String klasse, int katalogNr) {
        super(vorname, nachname);
        this.schule = schule;
        this.klasse = klasse;
        this.katalogNr = katalogNr;
    }

    @Override
    String personToString() {
        return "Schüler: " + nachname + " " + vorname + " geht auf die " + schule + " und besucht dort die Klasse " + klasse + ". Er besitzt die Katalognummer " + katalogNr;
    }
}
