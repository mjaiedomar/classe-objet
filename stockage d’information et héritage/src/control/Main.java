package control;
import modele.Loisir;
import modele.Utilitaires;
import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            System.out.println("AVANT COLLABORATION");
            Loisir lois = new Loisir("Splas",1000,"BDMKPBSQ");
            System.out.println(lois);

            String saisirTitre = Utilitaires.saisirString ("Saisir Information:" + " Entrez le titre");
            lois.saisirTitre(saisirTitre);

            int SaisirNbPersonne = Utilitaires.saisirint("Entrez le nombre de personne");
            lois.saisirNbPersonne(SaisirNbPersonne);

            String SaisirCode = Utilitaires.saisirString("Entrez le code");
            lois.saisirCode(SaisirCode);


            //ETAT
            System.out.println("============");
            System.out.println("Apres collaboration");
            System.out.println(lois);


        }

    }


