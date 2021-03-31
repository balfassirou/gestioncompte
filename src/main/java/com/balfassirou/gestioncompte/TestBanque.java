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
public class TestBanque
{
    public static void main(String[] args)
    {
    CompteCourant cptc = new CompteCourant();
    cptc.setNumeroCompte(438459);
    cptc.setNom("DIOP");
    cptc.setPrenom("Cheikh Ousmane");
    cptc.setAdresse("Pikine rue10");
    cptc.setDateOuverture("20/12/1990");
    cptc.setSolde(458700.52);
    cptc.setListOperation("Retrait / Depot");
    
    
    CompteCourant cptc1 = new CompteCourant(315745,"DIA","Aliou","Pikine Tally Boubess","08/10/2000",4700000,"Depot",50000000);
    
    CompteEpargne cpte = new CompteEpargne(315745,"DIATTA","Fatoumata","Keur massar","08/02/2020",4700000,"depot","2.5");
    
       System.out.println(cptc);
       System.out.println("**********-----**********");
       System.out.println(cptc1);
       System.out.println("**********-----**********");
       System.out.println(cpte);
    }
    

}
