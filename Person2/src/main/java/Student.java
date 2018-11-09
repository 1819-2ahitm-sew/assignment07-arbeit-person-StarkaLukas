public class Student extends Person{

    private String universitaet;
    private int matrikelNr;
    private String studienfach;

    public Student(String vorname, String nachname, String universitaet, int matrikelNr, String studienfach) {
        super(vorname, nachname);
        this.universitaet = universitaet;
        this.matrikelNr = matrikelNr;
        this.studienfach = studienfach;
    }
}
