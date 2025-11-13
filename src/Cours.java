import java.util.List;
import java.util.ArrayList;
public class Cours {
    private int courseId;
    private String Titre;
    private String description;
    private Instructeur instructeur;
    private List<Student> students;
public Cours(int courseId,String Titre,String description,Instructeur instructeur){
    this.courseId= courseId;
    this.Titre= Titre;
    this.description=description;
    this.instructeur=instructeur;
    this.students= new ArrayList<>();
}
public String getTitre(){
    return Titre;
}
public void  ajouterEtudiant(Student s){
    students.add(s);
}
public void assignerInstructeur(Instructeur i){
    this.instructeur = i;
}
public void afficherDetails(){
    System.out.println("****les détails du cours***");
    System.out.println("Titre: " +Titre);
    System.out.println("description: " +description);
    System.out.println("Instructeur: "+ instructeur.getNom());
    System.out.println("Etudiants: ");
    for(Student s: students){
        System.out.println("-"+s.getNom());
    }

}

}
