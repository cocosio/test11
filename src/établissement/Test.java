package établissement ;

import établissement.Directeur;
import établissement.Employe;

public class Test {
    public static void main(String []args) {
        Directeur d1 = new Directeur("Ortega","Jean",95);
        Directeur d2 = new Directeur("Dessaux", "Franck", 50);

        Employe e1 = new Employe("Ortega","Jean",95,"Mauduit","dechet");
        Employe e2 = new Employe("Dessaux", "Franck", 50,"ortega","chomeur");
        Employe e3 = new Employe("GrosPorc", "DuMCDO", 50,"ortega","cuisinier");
d1.ajouterEmploye(e1);
d1.ajouterEmploye(e3);
d2.ajouterEmploye(e2);
System.out.println(d1);
System.out.println(d2);
    }
}