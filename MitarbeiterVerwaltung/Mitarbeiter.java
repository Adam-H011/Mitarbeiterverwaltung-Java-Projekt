public abstract class Mitarbeiter {

    
    private String name;
    private int personalnummer;
    private double grundgehalt;

    public Mitarbeiter(String name, int personalnummer, double grundgehalt) {
        this.name = name;
        this.personalnummer = personalnummer;
        this. grundgehalt = grundgehalt;
    }

    public Mitarbeiter(String name, int personalnummer) {
        this(name, personalnummer, 3000.0);
    }

    
    public String getName() { return name; }
    public int getPersonalnummer() { return personalnummer; }
    public double getGrundgehalt() { return grundgehalt; }
    public void setName(String name) { this.name = name; }
    public void setGrundgehalt(double grundgehalt) { this.grundgehalt = grundgehalt; }

    
    public abstract double berechneGehalt();

    
    public void arbeite() {
        System.out.println(name + " arbeitet.");
    }

    
    @Override
    public String toString() {
        return name + " (Nr. " + personalnummer + ") - Gehalt: " + berechneGehalt() + "€";
    }
}

