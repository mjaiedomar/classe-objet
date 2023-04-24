package modele;

import java.util.ArrayList;

public class Registre{
    private ArrayList<Loisir> listeLoisir ;
    public Registre() {
    }
    public Registre(ArrayList<Loisir> listeLoisir) {
        this.listeLoisir = listeLoisir ;
    }
    public boolean verifierDuplicata(Loisir loisir){
        for(Loisir tmp : listeLoisir){
            if (loisir.equals(tmp)){
                return true;
            }
        }
        return false;
    }
    public void ajouterLoisir(Loisir loisir){

        if (verifierDuplicata(loisir)){//présent
            System.out.println("Loisir :"+loisir.toString());
        }else{//non présent
            listeLoisir.add(loisir);
        }

    }
    public void modifierActiviter(String ch, Loisir loisir){
        int i =0;
        int pos = 0;
        boolean test = false;
        while (test == false){
            if (listeLoisir.get(i).getTitre().equals(ch)){
                pos=i;
                listeLoisir.set(pos,loisir);
                test= true;
            }
            i++;
        }

    }
    public void afficherContenuRegistre() {

        for (Loisir tmp : listeLoisir) {
            System.out.println( tmp);
        }
    }

    public ArrayList<Loisir> getListeLoisir() {
        return listeLoisir;
    }

    public void setListeLoisir(ArrayList<Loisir> listeLoisir) {
        this.listeLoisir = listeLoisir;
    }
}
