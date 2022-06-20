package établissement;

public class Employe extends Personnel {
    protected String superieur;
    protected String profession;

    Employe(String nom, String prenom, int age, String superieur,String profession) {
        super(nom, prenom, age);
        this.superieur = superieur;
        this.profession = profession;
    }


    public String toString() {
        return this.nom + " " + this.prenom + " " + this.age + " " + this.superieur +" "+this.profession;

    }

    public String getProfession() {
        return this.profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getSuperieur() {
        return superieur;
    }

    public void setSuperieur(String superieur) {
        this.superieur = superieur;
    }

    public int getAge(){
        return age;
    }
}