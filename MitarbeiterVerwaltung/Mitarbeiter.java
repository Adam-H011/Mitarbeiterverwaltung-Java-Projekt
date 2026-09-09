public abstract class Mitarbeiter {

    // hier sind die attribute
    private String name;
    private int personalnummer;
    private double grundgehalt;

    //konstruktoren
    public Mitarbeiter(String name, int personalnummer, double grundgehalt) {
        this.name = name;
        this.personalnummer = personalnummer;
        this. grundgehalt = grundgehalt;
    }

    public Mitarbeiter(String name, int personalnummer) {
        this(name, personalnummer, 3000.0);
    }

    // getter und setter. MERK DIR getter gibt wert zurück und setter setzt den wert neu
    public String getName() { return name; }
    public int getPersonalnummer() { return personalnummer; }
    public double getGrundgehalt() { return grundgehalt; }
    public void setName(String name) { this.name = name; }
    public void setGrundgehalt(double grundgehalt) { this.grundgehalt = grundgehalt; }

    // abstrakte methode um die subklassen zu überschreiben
    public abstract double berechneGehalt();

    // konkrete Methode
    public void arbeite() {
        System.out.println(name + " arbeitet.");
    }

    // gibt alles in einem String zurück
    @Override
    public String toString() {
        return name + " (Nr. " + personalnummer + ") - Gehalt: " + berechneGehalt() + "€";
    }
}

