public class Arbeiter extends Arbeitnehmer{

    private double stundenlohn;

    public Arbeiter(String beruf, String arbeitGeber, double stundenlohn) {
        super(beruf, arbeitGeber);
        this.stundenlohn = stundenlohn;
    }

    @Override
    public double getEntgelt() {

        return stundenlohn * 40;
    }
}
