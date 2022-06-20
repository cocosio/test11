package com.company;

public class Moto extends Vehicule{
    protected int puissance ;
    protected  String marquePneu;
    protected Pneu p;

    Moto(String marque , String modele , String couleur,int puissance){
        super(marque,modele,couleur);
        this.puissance = puissance;

        if (this.marque == "Yamaha") {
            marquePneu = "Dunlop";
        } else {
            marquePneu = "Michelin";

        }
        p = new Pneu(marquePneu, "Moto", 150);
    }
    public String toString(){
        return this.marque +" " + this.modele +" "+ this.couleur +" " +this.puissance + " "+p.marque ;
    }
}
