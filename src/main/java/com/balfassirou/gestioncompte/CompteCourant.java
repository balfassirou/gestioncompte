/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balfassirou.gestioncompte;

/**
 *
 * @author BALFASSIROU
 */
public class CompteCourant extends Compte
{
    
    private double montantDecouvertAutorite;
    public CompteCourant()
    {
        super();
    }
    public CompteCourant(int numeroCompte, String nom, String prenom,String adresse, String dateOuverture,
                    double solde, String listOperation, double montantDecouvertAutorite)
    {
        super(numeroCompte, nom, prenom, adresse, dateOuverture, solde, listOperation);
        this.montantDecouvertAutorite = montantDecouvertAutorite; 
    }

    public double getMontantDecouvertAutorite() {
        return montantDecouvertAutorite;
    }

    public void setMontantDecouvertAutorite(double montantDecouvertAutorite) {
        this.montantDecouvertAutorite = montantDecouvertAutorite;
    }

  

    @Override
    public String toString() {
        return super.toString()  + "\nMontant d'ecouvert bancaire: " + montantDecouvertAutorite;
    }
    
}
