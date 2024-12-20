import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public int id = 1;

    public static ArrayList<Formateur> formateurs = new ArrayList<>();
     public   static ArrayList<Classe> classes = new ArrayList<>();

    public static void main(String[] args) {
        Apprenant apprenant = new Apprenant();
        Classe classe = new Classe();
        int choix;
        do{
            System.out.println("1-Gestion Apprenants");
            System.out.println("2-Gestion Formateurs");
            System.out.println("3-Gestion Classes");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Entrer votre choix :");
            choix = scanner.nextInt();
            switch(choix){
                case 1:
                apprenant.gestionApprenants();
                break;
                case 2:
                    break;

                    case 3:
                        classe.GestionClasse();
                        break;
                default:
                    System.out.println("choix invalide");
            }
        }while(choix != 4);



    }
}

