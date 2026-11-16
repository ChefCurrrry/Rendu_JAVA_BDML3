/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ctp1;

import java.util.Scanner;

/**
 *
 * @author starplatinum18
 */
public class CTP1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quel âge avez vous ? :");
        int age = scan.nextInt();
        System.out.println("L'utilisateur à " + age + " ans.");
        System.out.print("Quel âge à votre Père ? :");
        int ageP = scan.nextInt();
        System.out.println("Le Père à " + ageP + " ans.");
        System.out.print("Quel âge à votre Mère ? :");
        int ageM = scan.nextInt();
        System.out.println("La Mère à " + ageM + " ans.");
        int diff;
        if(ageP > ageM)
            diff = ageP - ageM;
        else
            diff = ageM - ageP;
        System.out.println("Le Père et la Mère ont " + diff + " années d'écart.");
        int add = ageP + ageM;
        System.out.println("L'age des deux parents combiné donne : " + add);
        int mult = ageP * ageM;
        System.out.println("L'age des deux parents multiplié donne : " + mult);
        float div1 = ageP / ageM;
        System.out.println("L'age du Père divisé par celui de la Mère donne : " + div1);
        float div2 = ageM / ageP;
        System.out.println("L'age de la Mère divisé par celui du Père donne : " + div2);

    }
    
}
