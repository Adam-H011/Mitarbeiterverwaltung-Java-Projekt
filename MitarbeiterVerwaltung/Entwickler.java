public class Entwickler extends Mitarbeiter implements IArbeit {

    private String programmiersprache;
    private int ueberstunden;

    public Entwickler(String name, int personalnummer, double grundgehalt, String programmiersprache, int ueberstunden) {
        super(name, personalnummer, grundgehalt);
        this.programmiersprache = programmiersprache;
        this.ueberstunden = ueberstunden;
    }

    public String getProgrammiersprache() { return programmiersprache; }
    public int getUeberstunden() { return ueberstunden; }

    @Override
    public double berechneGehalt() {
        return super.getGrundgehalt() + (ueberstunden * 25);
    }

    @Override
    public void arbeite() {
        System.out.println(getName() + " programmiert in " + programmiersprache + " (" + ueberstunden + " Überstunden).");
    }

    @Override
    public String toString() {
        return super.toString() + " (" + programmiersprache + ", " + ueberstunden + " Überstunden)";
    }

    @Override
    public void arbeitsAusfuehrung() {
        System.out.println(getName() + " entwickelt Software.");
    }
}