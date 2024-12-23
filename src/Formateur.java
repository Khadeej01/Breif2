import java.util.Scanner;

public class Formateur extends Personne{
private String specialite;
private double salaire;
Classe classe;


    public Formateur(int id ,String nom, String prenom, String email, String specialite, double salaire ,Classe classes) {
        super(id,nom, prenom, email);
        this.specialite = specialite;
        this.salaire = salaire;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    public Object getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
//    // Méthodes de gestion
//    public  void gestionFormateurs() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("\n--- Gestion des Formateurs ---");
//        System.out.println("1. Ajouter un formateur");
//        System.out.println("2. Modifier un formateur");
//        System.out.println("3. Supprimer un formateur");
//        System.out.println("4. Afficher les formateurs");
//        System.out.print("Choix: ");
//        int choix = sc.nextInt();
//        sc.nextLine();
//
//
//        switch (choix) {
//            case 1:
//                AjouterFormateur();
//                break;
//            case 2:
//                ModifierFormateur();
//                break;
//            case 3:
//                SupprimerFormateur();
//                break;
//            case 4:
//                AfficherFormateurs();
//                break;
//            default:
//                System.out.println("Choix invalide !");
//        }
//    }
//
//
//
//
//    public   void AjouterFormateur() {
//        Scanner sc = new Scanner(System.in);
//       Formateur formateur;
//        System.out.println("Veuillez saisir le nom :");
//        String nom = sc.nextLine();
//        System.out.println("Veuillez saisir le prenom :");
//        String prenom = sc.nextLine();
//        System.out.println("Veuillez saisir email (@gmail.com) :");
//        String email = sc.nextLine();
//        System.out.println("Veuillez saisir le salaire :");
//        double notes = sc.nextDouble();
//        sc.nextLine();
//        System.out.println("Veuillez saisir classe :");
//        String classenom = sc.nextLine();
//        Classe classe = new Classe();
////        classe=classe.rechercheClasse(classenom);
//        if (classe == null) {
//            System.out.println("Classe n'existe pas dans la classe " + classenom);
//            return;
//        }
//        Application application = new Application();
//        formateur= new Formateur(application.id,nom,prenom,email,specialite,salaire,classe);
//        application.formateurs.add(formateur);
//        System.out.println("Apprenant ajouter avec succes");
//        application.id++;
//    }

