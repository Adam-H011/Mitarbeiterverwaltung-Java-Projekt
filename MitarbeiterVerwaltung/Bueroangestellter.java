public class Bueroangestellter extends Mitarbeiter implements IArbeit {
    
     private int bueroNummer;
    private double zulage;

    
    //Konstruktor: Erstellt einen Büroangestellten.
    public Bueroangestellter(String name, int personalnummer, double grundgehalt, int bueroNummer, double zulage) {
        super(name, personalnummer, grundgehalt); // Oberklasse aufrufen
        this.bueroNummer = bueroNummer;
        this.zulage = zulage;
    }

    // Getter
    public int getBueroNummer() { return bueroNummer; }
    public double getZulage() { return zulage; }

    
    // Gehalt = Grundgehalt + Zulage
    @Override
    public double berechneGehalt() {
        return super.getGrundgehalt() + zulage;
    }

    
     // Was der Büroangestellte macht.
    @Override
    public void arbeite() {
        System.out.println(getName() + " arbeitet im Büro " + bueroNummer + " und erledigt Papierkram.");
    }

    // Erweiterte Ausgabe.
    @Override
    public String toString() {
        return super.toString() + " (Büro " + bueroNummer + ", Zulage: " + zulage + "€)";
    }

    // Vom Interface IArbeit.
    @Override
    public void arbeitsAusfuehrung() {
        System.out.println(getName() + " führt Büroarbeit aus.");
    }
}
