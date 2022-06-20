package com.company;

public class Pneu {
    protected String type;
    protected int largeur;
    protected String marque;

    Pneu(String marque, String type, int largeur) {
        this.largeur = largeur;
        this.type = type;
        this.marque = marque;

    }


    public String toString() {
        return this.marque + " " + this.largeur + " " + this.type + " ";
    }
}
