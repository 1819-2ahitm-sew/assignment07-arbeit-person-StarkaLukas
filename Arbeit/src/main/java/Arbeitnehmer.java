abstract class Arbeitnehmer {

    public String beruf;
    public String arbeitGeber;

    abstract public double getEntgelt();

    public Arbeitnehmer(String beruf, String arbeitGeber) {
        this.beruf = beruf;
        this.arbeitGeber = arbeitGeber;
    }
}
