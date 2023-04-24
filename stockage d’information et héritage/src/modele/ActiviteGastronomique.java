package modele;

import java.util.ArrayList;
import java.util.Scanner;

public class ActiviteGastronomique extends Loisir{
    private String theme ;
    private double prix = 20 ;
    public ActiviteGastronomique() {

    }

    public ActiviteGastronomique(String titre, int nombrePersonne, String code, String theme, double prix) {
        super(titre, nombrePersonne, code);
        this.theme = theme;
        this.prix = prix;
    }

    public  ActiviteGastronomique saisirActiviteGastronomique ()
    {
        Scanner Sc = new Scanner(System.in);
        ActiviteGastronomique actGas = new ActiviteGastronomique () ;
        System.out.println("donner le titre");
        String title = Sc.nextLine();
        actGas.setTitre(title);
        System.out.println("donner le nombre des personne");
        int nbrPer = Sc.nextInt();
        actGas.setNombrePersonne(nbrPer);
        System.out.println("donner le code");
        String cod = Sc.nextLine();
        actGas.setCode(Sc.nextLine());
        System.out.println("donner le theme");
        String theme= Sc.nextLine();
        actGas.setTheme(theme);
        System.out.println("donner le prix");
        double prix = Sc.nextDouble();
        actGas.setPrix(prix);
        System.out.println(actGas);
        return actGas;
    }

    public   void modichierActiviteGastronomique (String ch, ArrayList<Loisir> liste)
    {
        int i =0;
        int pos = 0;
        boolean test = false;
        while (test == false){
            if (liste.get(i).getTitre().equals(ch)){
                pos=i;
                liste.set(pos,saisirActiviteGastronomique ());
                test= true;
            }
            i++;
        }
    }
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    public void saisirTheme(String theme) {
        int maxLength = 20;
        if (theme.length() >= maxLength) {
            theme = theme.substring(0,maxLength);
        }
    }
    @Override
    public String toString() {
        return super.toString() +"ActiviteGastronomique{" +
                "theme='" + theme + '\'' +
                ", prix=" + prix +
                '}';
    }
}
