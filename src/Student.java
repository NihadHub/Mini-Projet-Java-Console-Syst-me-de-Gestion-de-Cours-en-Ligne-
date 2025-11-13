import java.util.ArrayList;
import java.util.List;
public class Student {
    private int IdStudent;
    private String nom;
    private String email;
    private List<Cours> inscriptionCours ;

    public Student(int IdStudent,String nom,String email){
        this.IdStudent=IdStudent;
        this.nom=nom;
        this.email=email;
        this.inscriptionCours = new ArrayList<>();
    }

    public int getIdStudent(){
        return IdStudent;
    }

    public String getNom(){
        return nom;
    }

    public void inscrire(Cours c){
        inscriptionCours.add(c);
        c.ajouterEtudiant(this);
        System.out.println(nom+ " est inscrit au: " + c.getTitre());
    }
    public void afficherCours(){
        for (Cours c: inscriptionCours){
            System.out.println("Cours de "+ nom +" ");
            System.out.println("-" + c.getTitre());
        }
    }
}
