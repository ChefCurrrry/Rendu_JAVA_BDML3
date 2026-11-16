package np_tp1;

import java.time.Year;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author starplatinum18
 */
public class Personne {
    private static int nbInstance;
    private String Nom;
    private String Prenom;
    private int anNaissance;
    
    public Personne (String nom, String prenom, int annee){
        
        this.Nom = nom;
        this.Prenom = prenom;
        this.anNaissance = annee;
        nbInstance++;
        System.out.println("Nombre d'instance de la Classe Personne : " + afficherNBPers());
    }
    public Personne (String prenom, int annee){
        
        this.Nom = "Inconnu";
        this.Prenom = prenom;
        this.anNaissance = annee;
        nbInstance++;
        System.out.println("Nombre d'instance de la Classe Personne : " + afficherNBPers());
    }
    public Personne (){
        
        this.Nom = "Potter";
        this.Prenom = "Harry";
        this.anNaissance = 1980;
        nbInstance++;
        System.out.println("Nombre d'instance de la Classe Personne : " + afficherNBPers());
    }
    
    
    public String getNom(){return Nom;}
    public String getPrenom(){return Prenom;}
    public int getAnNaissance(){return anNaissance;}
    public void setNom(String nom){ Nom = nom;}
    public void setPrenom(String prenom){ Prenom = prenom;}
    public void setAnNaissance(int annee){ anNaissance = annee;}
    
    
    public int CalculerAge(){
        return Year.now().getValue() - anNaissance;
    }
    
    public void afficherInfos(){
        System.out.println("Nom: " + Nom);
        System.out.println("Prenom: " + Prenom);
        System.out.println("Age: " + this.CalculerAge());
    }
    
    public void mange(String aliment){
        System.out.println(Nom + " " + Prenom + " " + "Mange un/une " + aliment);
    }
    
    public int afficherNBPers(){
        return nbInstance;
    }
    
}
