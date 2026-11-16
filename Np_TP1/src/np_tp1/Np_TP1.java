/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package np_tp1;

/**
 *
 * @author starplatinum18
 */
public class Np_TP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personne p1 = new Personne("Dupont","Jean",2004);
        Personne p2 = new Personne("Pierre",2004);
        Personne p3 = new Personne();
        
        System.out.println("Nom P1 : " + p1.getNom());
        System.out.println("Prenom P1 : " + p1.getPrenom());
        System.out.println("Annee de Naissance P1 : " + p1.getAnNaissance());
        
        p1.setNom("Moulungo");
        p1.setPrenom("Elie");
        p1.setAnNaissance(1997);
        
        System.out.println();
        
        p1.mange("Sandwich");
        
        System.out.println();
        
        System.out.println("Age de p1 : " + p1.CalculerAge());
        
        System.out.println();
        
        p1.afficherInfos();
        
        System.out.println();
        
        System.out.println("Nom P2 : " + p2.getNom());
        System.out.println("Prenom P2 : " + p2.getPrenom());
        System.out.println("Annee de Naissance P2 : " + p2.getAnNaissance());
        
        System.out.println();
        
        p2.setNom("Chabane");
        p2.setPrenom("Karima");
        p2.setAnNaissance(1985);
        
        p2.mange("Couscous");
        
        System.out.println();
        
        System.out.println("Age de p2 : " + p2.CalculerAge());
        
        System.out.println();
        
        p2.afficherInfos();
        
        System.out.println();
        
        System.out.println("Nom P3 : " + p3.getNom());
        System.out.println("Prenom P3 : " + p3.getPrenom());
        System.out.println("Annee de Naissance P3 : " + p3.getAnNaissance() + "\n");
        
        p3.setNom("Wisley");
        p3.setPrenom("Ron");
        p3.setAnNaissance(1980);
        
        p3.mange("Panini");
        
        System.out.println("Age de p3 : " + p3.CalculerAge());
        
        System.out.println();
        
        p3.afficherInfos();
        
    }
    
}
