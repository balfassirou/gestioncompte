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
public class Compte 
{
    private int numeroCompte;
    private String nom;
    private String prenom;
    private String adresse;
    private String dateOuverture;
    private double solde;
    private String listOperation;
    
    public Compte()
    {
        
    }
    public Compte(int numeroCompte, String nom, String prenom,String adresse, String dateOuverture,
                    double solde, String listOperation)
    {
        this.numeroCompte = numeroCompte;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.dateOuverture = dateOuverture;
        this.solde = solde;
        this.listOperation = listOperation;
    }

    

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(String dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }


    public String getListOperation() {
        return listOperation;
    }

    public void setListOperation(String listOperation) {
        this.listOperation = listOperation;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + this.numeroCompte;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Compte other = (Compte) obj;
        if (this.numeroCompte != other.numeroCompte) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return "\nNumeroCompte: " + numeroCompte + "\nNom: " + nom + "\nPrenom: " + prenom + "\nAdresse: " + adresse + "\nDate d'ouverture: " + dateOuverture + "\nSolde: " + solde + "\nList des operation: " + listOperation;
    }
    
}
