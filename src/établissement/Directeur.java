package établissement;
import java.util.ArrayList;

public class Directeur extends Personnel {
    private ArrayList <Employe> listEmploye;
    Directeur(String nom , String prenom , int age){
        super(nom,prenom,age);
        listEmploye = new ArrayList<Employe>();
    }
    public void ajouterEmploye(Employe e){
        if (e.getProfession().equals("cuisinier")){
            System.out.println ("error profession");

        }
        else if (e.getAge()>65){
            System.out.println ("error age");
        }
        else {
            listEmploye.add(e);
            e.setSuperieur(this.nom);
        }
    }
    public String toString() {
        return this.nom + " " + this.prenom + " " + this.age;

    }
}
