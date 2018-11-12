abstract class Person {

    protected String vorname;
    protected String nachname;

    protected Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    protected Person() {
    }

    abstract String personToString();

}