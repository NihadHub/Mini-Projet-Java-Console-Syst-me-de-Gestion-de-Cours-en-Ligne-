import java.time.LocalDate;

public class Paiment {
    private double montant;
    private LocalDate datePaimente;
    private String modePaiement;
    private Student etudiant;
    private Cours cour;

    public Paiment(double montant,String modePaiement, Student etudiant, Cours cour) {
        this.montant = montant;
        this.datePaimente = LocalDate.now();
        this.modePaiement= modePaiement;
        this.etudiant= etudiant;
        this.cour=cour;

    }
    public void afficherPaiement() {
        System.out.println("Paiement de " + etudiant.getNom() + " pour " + cour.getTitre());
        System.out.println("Montant : " + montant + " | Mode : " + modePaiement + " | Date : " + datePaimente);
    }
}
