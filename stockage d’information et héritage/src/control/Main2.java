package control;

import modele.Loisir;
import modele.Registre;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int choix;
        ArrayList<Loisir> list = new ArrayList<>();
        System.out.println("********************************************************************************************");
        System.out.println("***                     ***                        ***                    ***            ***");
        System.out.println("***      1              ***          2             ***     3              ***     4      ***");
        System.out.println("*** Saisir information  *** Modifier une activite  *** Afficher liste     ***   Quitter  ***");
        System.out.println("***                     ***                        ***                    ***            ***");
        System.out.println("********************************************************************************************");
        System.out.println("Donnez votre choix");
        Scanner Sc = new Scanner(System.in);
        // choix = Sc.nextInt();
        Registre r = new Registre(list);
        Loisir l = new Loisir();
        Loisir l1 = new Loisir("Footbal",15,"11");
        Loisir l2 = new Loisir("neige",10,"12");
        Loisir l3 = new Loisir("balançoires",6,"10");
        Loisir l4 = new Loisir("neige",12,"13");
        list.add(l1);
        list.add(l2);
        String ch= "neige";
        choix = 0;
        while (choix!=4)
        {choix = Sc.nextInt();
            if (choix == 1) {
                r.ajouterLoisir(l3);
            }
            if (choix == 3) {
                r.afficherContenuRegistre();
            }
            if (choix == 2) {

                r.modifierActiviter(ch,l4);

            }
        }
    }
}
