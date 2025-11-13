import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public void Menu(){
        System.out.println("=== Menu Gestion des Cours === ");
        System.out.println("1. Ajouter un étudiant ");
        System.out.println("2. Ajouter un instructeur ");
        System.out.println("3. Ajouter un cours ");
        System.out.println("4. Inscrire un étudiant à un cours ");
        System.out.println("5. Assigner un instructeur à un cours ");
        System.out.println("6. Afficher les détails d’un cours ");
        System.out.println("7. Quitter ");
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Student> etudiants = new ArrayList<>();
        List<Cours> course = new ArrayList<>();
        List<Instructeur> intstractor = new ArrayList<>();
        int choix;

        do{
            System.out.println("Entrez le nombre coresspond à votre choix: ");
            choix= scanner.nextInt();
        switch (choix){
            case 1:
                System.out.println("Entrez le Id d'etudiant: ");
                int idEtudiant = scanner.nextInt();
                System.out.println("Entrez le nom: ");
                String nomEtudiant = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Entrez l'email");
                String emailEtudiant = scanner.nextLine();
                etudiants.add(new Student(idEtudiant,nomEtudiant,emailEtudiant));
                System.out.println("Etudiant ajouter avec succes");

                break;
            case 2:
                System.out.println("");
                break;
        }



        }while(choix!=7);


    }
}
