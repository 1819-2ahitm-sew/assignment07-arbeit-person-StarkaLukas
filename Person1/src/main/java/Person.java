public class Person {

    protected String vorname;
    protected String nachname;

    protected Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    protected Person() {

    }

    protected String personToString() {
        String person;

        person = vorname + " " + nachname;

        return person;
    }

}