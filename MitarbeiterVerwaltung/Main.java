public class Main {
    public static void main(String[] args) {

        Bueroangestellter a = new Bueroangestellter("Anna", 101, 2500.0, 12, 300.0);
        Entwickler e1 = new Entwickler("Thomas", 102, 2800.0, "Java", 15);
        Entwickler e2 = new Entwickler("Maria", 103, 3000.0, "Python", 8);

        Abteilung abt = new Abteilung();
        abt.addMitarbeiter(a);
        abt.addMitarbeiter(e1);
        abt.addMitarbeiter(e2);

        abt.zeigeAlleMitarbeiter();

        System.out.println("\n=== GEHALTSERHÖHUNG (5%) ===\n");
        for (Mitarbeiter m : abt.getMitarbeiterListe()) {
            double neu = m.getGrundgehalt() * 1.05;
            m.setGrundgehalt(neu);
            System.out.println(m.getName() + ": neues Grundgehalt = " + neu + "€");
        }

        System.out.println("\n=== AKTUALISIERTE GEHÄLTER ===\n");
        for (Mitarbeiter m : abt.getMitarbeiterListe()) {
            System.out.println(m.getName() + ": " + m.berechneGehalt() + "€");
        }
    }
}