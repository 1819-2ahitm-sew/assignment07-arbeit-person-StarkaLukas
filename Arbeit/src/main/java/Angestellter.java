public class Angestellter extends Arbeitnehmer{

    private double gehalt;

    public Angestellter(String beruf, String arbeitGeber, double gehalt) {
        super(beruf, arbeitGeber);
        this.gehalt = gehalt;
    }

    @Override
    public double getEntgelt() {

        return gehalt;
    }
}
