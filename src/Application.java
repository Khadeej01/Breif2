import java.util.ArrayList;
import java.util.Scanner;

public class Application {





    public static void main(String[] args) {

        Apprenant apprenant = new Apprenant();
        Classe classe = new Classe();
        int choix;
        do{
            System.out.println("1-Gestion Apprenants");
            System.out.println("2-Gestion Formateurs");
            System.out.println("3-Gestion Classes");
            System.out.println("4-Sortir");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Entrer votre choix :");
            choix = scanner.nextInt();
            switch(choix){
                case 1:
                    apprenant.gestionApprenants(apprenants);
                    break;
                case 2:
                    break;

                case 3:
                    classe.GestionClasse(classes);
                    break;
                    case 4:
                        System.out.println("Au revoir ^-^ :");
                        break;
                default:
                    System.out.println("choix invalide");
            }
        }while(choix != 4);



    }
}

