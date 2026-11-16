//KICHENASSAMY_BDML3_Addition de Chiffres_16/11/2026
package exo2;

import java.util.Scanner;

/**
 *
 * @author starplatinum18
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nb; 
        int result; 
        int ind; 
        System.out.println("Saisissez le nombres d'entiers à additionner : ");
        Scanner sc = new Scanner(System.in);
        nb = sc.nextInt();
        result=0;
        
        ind=1;
        while (ind <= nb) {
        result=result+ind;
        ind++;
        }
        
        System.out.println();
        System.out.println("La somme des "+ nb + "entiers est: "+result);
    }
    
}
