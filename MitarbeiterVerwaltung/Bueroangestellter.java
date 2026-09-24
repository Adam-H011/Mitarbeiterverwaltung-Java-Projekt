public class Bueroangestellter extends Mitarbeiter implements IArbeit {
    
     private int bueroNummer;
    private double zulage;

    
    
    public Bueroangestellter(String name, int personalnummer, double grundgehalt, int bueroNummer, double zulage) {
        super(name, personalnummer, grundgehalt); 
        this.bueroNummer = bueroNummer;
        this.zulage = zulage;
    }

    
    public int getBueroNummer() { return bueroNummer; }
    public double getZulage() { return zulage; }

    
    
    @Override
    public double berechneGehalt() {
        return super.getGrundgehalt() + zulage;
    }

    
     
    @Override
    public void arbeite() {
        System.out.println(getName() + " arbeitet im Büro " + bueroNummer + " und erledigt Papierkram.");
    }

    
    @Override
    public String toString() {
        return super.toString() + " (Büro " + bueroNummer + ", Zulage: " + zulage + "€)";
    }

    
    @Override
    public void arbeitsAusfuehrung() {
        System.out.println(getName() + " führt Büroarbeit aus.");
    }
}
