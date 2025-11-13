import java.time.LocalDate;
public class Certification  {
    private static int compteur = 1;
    private int certId;
    private Cours cours;
    private Student etudiant;
    private LocalDate dateObtention;

    public Certification(Cours cours, Student etudiant) {
        this.certId = compteur++;
        this.cours = cours;
        this.etudiant = etudiant;
        this.dateObtention = LocalDate.now();
    }

    public void afficherCertification() {
        System.out.println("=== Certification ===");
        System.out.println("Certificat ID : " + certId);
        System.out.println("Étudiant : " + etudiant.getNom());
        System.out.println("Cours : " + cours.getTitre());
        System.out.println("Date : " + dateObtention);
    }
}

