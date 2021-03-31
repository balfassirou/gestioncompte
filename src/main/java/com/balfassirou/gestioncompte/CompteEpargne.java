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
public class CompteEpargne extends Compte
{
    private double tauxEpargne;
    
    public CompteEpargne ()
    {
        super();
    }
    public CompteEpargne(int numeroCompte, String nom, String prenom,String adresse, String dateOuverture,
                    double solde, String listOperation, String montantDecouvertAutorite)
    {
      super(numeroCompte, nom, prenom, adresse, dateOuverture, solde, listOperation);
      this.tauxEpargne = tauxEpargne;
    }

    public double getTauxEpargne() {
        return tauxEpargne;
    }

    public void setTauxEpargne(double tauxEpargne) {
        this.tauxEpargne = tauxEpargne;
    }

   

    @Override
    public String toString() {
        return super.toString()  +"\nTaux d'épargne: " + tauxEpargne;
    }
    
}
