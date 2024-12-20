import java.util.ArrayList;
import java.util.Scanner;

public class Classe {
    private String nom;
    Formateur formateur;
    ArrayList<Apprenant> apprenants;
    Application application = new Application();
    Scanner sc = new Scanner(System.in);

    public Classe(String nom, Formateur formateur) {
        this.nom = nom;
        this.formateur = formateur;
        this.apprenants = new ArrayList<>();
    }
    public Classe(){

    }
    public Classe( String nom){
        this.nom = nom;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public ArrayList<Apprenant> getApprenants() {
        return apprenants;
    }

    public void setApprenants(ArrayList<Apprenant> apprenants) {
        this.apprenants = apprenants;
    }

    public void  GestionClasse() {

        System.out.println("----Menu Classe----");
        System.out.println("1. Ajouter une classe");
        System.out.println("4. Modifier une classe");
        System.out.println("3. Supprimer une  classe");
        System.out.println("2. Afficher les classes");
        System.out.println("Veuillez saisir votre choix : ");
        int choix = sc.nextInt();
        Classe c = new Classe();
        switch (choix) {
            case 1:

                c.AjouterClasse();
                    break;
            case 2 :
                c.ModifierClasse();
                break;
            case 3 :
                c.SupprimerClasse();
                break;
            case 4 : c.AfficherClasses();
                break;



            default:
                System.out.println("Chois invalide !!");
        }
    }

    public void AjouterClasse() {
        System.out.println("entrer nom du classe");
        String nomclasse = sc.nextLine();
        application.classes.add(new Classe(nomclasse, null));
        for (Classe classe : application.classes) {
            System.out.println(classe.getNom());
        }
        System.out.println("Classe crrer avec succes");




    }
    //MOdifier
    private static void ModifierClasse() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID de la classe à modifier: ");
        int id = sc.nextInt();
        sc.nextLine();


        for (Classe classe : classes) {
            if (classe.getId() == id) {
                System.out.print("Nouveau Nom: ");
                classe.setNom(sc.nextLine());
                System.out.println("Classe modifiée !");
                return;
            }
        }
        System.out.println("Classe introuvable !");
    }

    private static void SupprimerClasse() {
        System.out.print("ID de la classe à supprimer: ");
        int id = sc.nextInt();
        sc.nextLine();


        c.removeIf(classe -> classe.getId() == id);
        System.out.println("Classe supprimée !");
    }


    public void AfficherClasses() {
        for (Classe classe : application.classes) {
            System.out.println(classe.getNom());
        }
    }


}
