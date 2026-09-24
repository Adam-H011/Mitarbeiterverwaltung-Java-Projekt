import java.util.ArrayList;
import java.util.List;

public class Abteilung {

    private List<Mitarbeiter> mitarbeiterListe;

    public Abteilung() {
        this.mitarbeiterListe = new ArrayList<>();
    }

    public void addMitarbeiter(Mitarbeiter m) {
        mitarbeiterListe.add(m);
    }

    public void zeigeAlleMitarbeiter() {
        System.out.println("=== MITARBEITERÜBERSICHT ===\n");
        for (Mitarbeiter m : mitarbeiterListe) {
            m.arbeite();
            System.out.println("Gehalt: " + m.berechneGehalt() + "€");
            System.out.println(m);
            System.out.println("------------------------");
        }
    }

    public List<Mitarbeiter> getMitarbeiterListe() {
        return mitarbeiterListe;
    }
}