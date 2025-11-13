import java.util.ArrayList;
import java.util.List;
public class Instructeur {
    private int instructorId;
    private String nom;
    private String specialisation ;
    private List<Cours> AssignedCours ;

    public Instructeur(int instructorId, String nom,String specialisation){
        this.instructorId= instructorId;
        this.nom = nom;
        this.specialisation=specialisation;
        this.AssignedCours= new ArrayList<>();
    }

    public void  assignedCours(Cours c){
            this.AssignedCours.add(c);
            c.assignerInstructeur(this);
            System.out.println(nom+"est assigné au cours:" +c.getTitre());
        }

    public void afficherCours(){
            System.out.println("le cours est ensign2 par" + nom+ " : ");
            for(Cours c: AssignedCours){
                System.out.println("-" +c.getTitre());
            }
        }


    public String getNom() {
        return nom;

    }
}
