//KICHENASSAMY_Kirankumar_BDML3_Calculatrice_16/11/2026
package calculator;

import java.util.Scanner;

/**
 *
 * @author starplatinum18
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator :");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
        Scanner sc = new Scanner(System.in);
        int operateur = sc.nextInt();
        
        System.out.print("Saisissez la première valeur : ");
        double operande1 = sc.nextDouble();
        
        System.out.print("\nSaisissez la seconde valeur : ");
        double operande2 = sc.nextDouble();
        double resultat;
        switch (operateur){
            case 1: 
                resultat = operande1 + operande2;
                System.out.println("Le résultat de l'addition est : " + resultat);
                break;
            case 2: 
                resultat = operande1 - operande2;
                System.out.println("Le résultat de la soustraction est : " + resultat);
                break;
            case 3: 
                resultat = operande1 * operande2;
                System.out.println("Le résultat de la multiplication est : " + resultat);
                break;
            case 4: 
                resultat = operande1 / operande2;
                System.out.println("Le résultat de la division est : " + resultat);
                break;
            case 5: 
                resultat = operande1 % operande2;
                System.out.println("Le reste de la division est : " + resultat);
                break;
            default : System.out.println("Vous n'avez pas saisi le bon numéro d'opération");
        }
            
        
        
    }
    
}
