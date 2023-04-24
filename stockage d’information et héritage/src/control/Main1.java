package control;

import modele.ActiviteGastronomique;
import modele.ActiviteJeu;
import modele.Loisir;
import modele.Registre;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        int choix;
        ArrayList<Loisir> list = new ArrayList<>();
        System.out.println("************************************************************************************************************************");
        System.out.println("**                     **                        **                   **                  **                 **       **");
        System.out.println("**     1               **         2              **       3           **         4        **        5        **  6    **");
        System.out.println("**Saisir.inf.act.Gastro** Saisir.info.act.de Jeu **Modifier.act.Gastro** Modifier.act.Jeu **Afficher la liste**Quitter**");
        System.out.println("**                     **                        **                   **                  **                 **       **");
        System.out.println("************************************************************************************************************************");
        System.out.println("Donnez votre choix");
        Scanner Sc = new Scanner(System.in);
        Registre r = new Registre(list);
        Loisir l = new Loisir();
        Loisir l1 = new Loisir(" ", 0," ");
        //Loisir l2 = new Loisir("neige",10,"12");
        Loisir l3 = new Loisir("balançoires",6,"10");
        Loisir l4 = new Loisir("neige",12,"13");
        ActiviteGastronomique actGas = new ActiviteGastronomique();
        ActiviteJeu actJeux = new ActiviteJeu( );

        ActiviteGastronomique actGas1 = new ActiviteGastronomique("Fotball",7,"10A","caraibe",12.0);
        ActiviteJeu actJeux2 = new ActiviteJeu("neige",23,"13B", "risque cardiaque",15);
        list.add(l1);
        //list.add(l2);
        String ch= "neige";
        choix = 0;
        while (choix!=6)
        {choix = Sc.nextInt();
            if (choix == 1) {
                list.add(actGas.saisirActiviteGastronomique ());
            }
            if (choix == 2) {
                list.add(actJeux.saisirActiviteJeu());
            }
            if (choix == 3) {
                System.out.println("Donner le nom de l'activité gastronimique a modifier");
                String ch1 = Sc.nextLine();
                actGas.modichierActiviteGastronomique(Sc.nextLine(),list);
            }
            if (choix == 4) {
                System.out.println("Donner le nom de l'activité de jeux a modifier");
                String activiteJ = Sc.nextLine();
                actJeux.modichierActiviteJeu(Sc.nextLine(),list);
            }
            if (choix == 5) {
                r.afficherContenuRegistre();
            }
        }

    }
    }
