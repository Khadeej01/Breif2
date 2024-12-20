import java.util.ArrayList;
import java.util.Scanner;

public class Classe {
    private String nom;
    Formateur formateur;

    Scanner sc = new Scanner(System.in);

    public Classe(String nom, Formateur formateur) {
        this.nom = nom;
        this.formateur = formateur;
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


    public void  GestionClasse(ArrayList<Classe> classes) {

        System.out.println("----Menu Classe----");
        System.out.println("1. Ajouter une classe");
        System.out.println("2. Modifier une classe");
        System.out.println("3. Supprimer une  classe");
        System.out.println("4. Afficher les classes");
        System.out.println("Veuillez saisir votre choix : ");
        int choix = sc.nextInt();
        Classe c = new Classe();
        switch (choix) {
            case 1:

                c.AjouterClasse(classes);
                break;
            case 2 :
                c.ModifierClasse(classes);
                break;
            case 3 :
                c.SupprimerClasse(classes);
                break;
            case 4 : c.AfficherClasses(classes);
                break;



            default:
                System.out.println("Chois invalide !!");
        }
    }

    public Classe AjouterClasse() {
        System.out.println("entrer nom du classe");
        String nomclasse = sc.nextLine();
        System.out.println("Classe crrer avec succes");
       return new Classe(nomclasse, null);
//        for (Classe classe : application.classes) {
//            System.out.println(classe.getNom());
//        }





    }
    //MOdifier
    private  void ModifierClasse() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nom de la classe modifeir:  ");
        String nomclasse = sc.nextLine();
        sc.nextLine();


        for (Classe classe : classes) {
            if (classe.getNom().equals(nomclasse)) {
                System.out.print("Nouveau Nom: ");
                classe.setNom(sc.nextLine());
                System.out.println("Classe modifiée !");
                return;
            }
        }
        System.out.println("Classe introuvable !");
    }

    private  void SupprimerClasse() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nom de la classe a supprimer:  ");
        String nomclasse = sc.nextLine();
        sc.nextLine();


//        classes.removeIf(classe -> classe.getNom().equals(nomclasse));
        Classe classe = new Classe() ;
        if(classe.getNom().equals(nomclasse)){
            classes.remove(classe);
        }
        System.out.println("Classe supprimée !");
    }


    public void AfficherClasses() {
        for (Classe classe : classes) {
            System.out.println(classe.getNom());
        }
    }
    public Classe rechercheClasse(String nom) {
        for (Classe c : classes ) {
            if (c.getNom().equals(nom)) return c;

        }
        return null;
    }


}

