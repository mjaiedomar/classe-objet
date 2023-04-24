package modele;

    public class Loisir {
        //ATTRIBUTS
        private String titre;
        private int nombrePersonne;
        private String code;
        static final int maxLength = 30 ;
        static final int maxNbrPersonne  = 100 ;
        static final int maxCodeLength = 20 ;
        //CONSTRUCTEUR
        public Loisir() {
        }

        public Loisir(String titre, int nombrePersonne, String code) {
            this.titre = titre;
            this.nombrePersonne = nombrePersonne;
            this.code = code;
        }
        //METHODES

        public void saisirTitre(String saisirTitre) {
            int maxLength = 30;
            if (titre.length() >= maxLength) {
                titre = titre.substring(0,maxLength);
            }
        }

        public void saisirNbPersonne(int saisirNbPersonne) {
            if (nombrePersonne >= 0 && nombrePersonne <= 100) {

            }else {
                nombrePersonne = 0;
            }
        }
        public void saisirCode (String saisirCode){
            int maxLength = 20;
            if (code.length() >= maxLength) {
                code = code.substring(0,maxLength);
            }
        }

        //GETTER
        public String getTitre() {
            return titre;
        }

        public int getNombrePersonne() {
            return nombrePersonne;
        }

        public String getCode() {
            return code;
        }
        //SETTER

        public void setTitre(String titre) {
            this.titre = titre;
        }

        public void setNombrePersonne(int nombrePersonne) {
            this.nombrePersonne = nombrePersonne;
        }

        public void setCode(String code) {
            this.code = code;
        }
        //TOSTRING

        @Override
        public String toString() {
            return "Loisir{" +
                    "titre='" + titre + '\'' +
                    ", nombrePersonne=" + nombrePersonne +
                    ", code='" + code + '\'' +
                    '}';
        }
    }



