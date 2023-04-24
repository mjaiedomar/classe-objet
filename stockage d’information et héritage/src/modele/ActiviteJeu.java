package modele;

import java.util.ArrayList;
import java.util.Scanner;

public class ActiviteJeu extends Loisir{
    private String miseEnGarde ;
    private int ageMin ;
    public ActiviteJeu() {
    }

    public ActiviteJeu(String titre, int nombrePersonne, String code, String miseEnGarde, int ageMin) {
        super(titre, nombrePersonne, code);
        this.miseEnGarde = miseEnGarde;
        this.ageMin = ageMin;
    }
    public ActiviteJeu saisirActiviteJeu ()
    {
        Scanner Sc = new Scanner (System.in);

        ActiviteJeu actJeu = new ActiviteJeu () ;
        System.out.println("donner le titre");
        // String t = Sc.nextLine();
        actJeu.setTitre(Sc.nextLine());
        System.out.println("donner le nombre des personne");
        int nbrPer = Sc.nextInt();
        actJeu.setNombrePersonne(nbrPer);
        System.out.println("donner le code");
        String code = Sc.nextLine();
        actJeu.setCode(Sc.nextLine());
        System.out.println("donner la mise en garde");
        String garde= Sc.nextLine();
        actJeu.setMiseEnGarde(garde);
        System.out.println("donner l'age minimum");
        int ageM = Sc.nextInt();
        actJeu.setAgeMin(ageM);
        System.out.println(actJeu);
        return actJeu;
    }

    public   void modichierActiviteJeu (String ch, ArrayList<Loisir> liste)
    {
        int i =0;
        int pos = 0;
        boolean test = false;
        while (test == false){
            if (liste.get(i).getTitre().equals(ch)){
                pos=i;
                liste.set(pos,saisirActiviteJeu ());
                test= true;
            }
            i++;
        }
    }

    public String getMiseEnGarde() {
        return miseEnGarde;
    }

    public void setMiseEnGarde(String miseEnGarde) {
        this.miseEnGarde = miseEnGarde;
    }

    public int getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(int ageMin) {
        this.ageMin = ageMin;
    }
    public void saisirmiseEnGarde(String miseEnGarde) {
        int maxLength = 100;
        if (miseEnGarde.length() >= maxLength) {
            miseEnGarde = miseEnGarde.substring(0,maxLength);
        }
    }
    @Override
    public String toString() {
        return super.toString() +"ActiviteJeu{" +
                "miseEnGarde='" + miseEnGarde + '\'' +
                ", ageMin=" + ageMin +
                '}';
    }
}
