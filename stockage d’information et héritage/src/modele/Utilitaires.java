package modele;
import java.util.Scanner;
    public class Utilitaires {

        public static int saisirint(String message) {
            Scanner lecteur = new Scanner(System.in);
            System.out.println(message);
            while (!lecteur.hasNextInt()) {
                lecteur.next();
            }
            return lecteur.nextInt();
        }


        public static String saisirString(String message) {
            Scanner lecteur = new Scanner(System.in);
            System.out.println(message);
            while (!lecteur.hasNext()) {
                lecteur.next();
            }
            return lecteur.next();

        }


    }
