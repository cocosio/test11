package com.company;

public class Voiture extends Vehicule {
    protected  String categorie ;

    Voiture(String couleur , String marque , String modele,String categorie){
        super(marque,modele,couleur);
        this.categorie = categorie;

        if (marque == "Renault") {
            marquePneu = "Continental";
        } else {
            marquePneu = "Michelin";

        }
        p = new Pneu(marquePneu, "voiture ", 250);

    }

    public String toString(){
        return this.marque +" " + this.modele +" "+ this.couleur +" " +this.categorie + " "+ p.marque;

}
}