/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

import java.util.Scanner;

/**
 *
 * @author lab208
 */
public class JavaApplication31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int numero= leitor.nextInt();
        exercicio(numero);
        
    } static void exercicio(int mes){
    switch (mes ){
        case 1:
            System.out.println("janeiro");
        case 2:
            System.out.println("fevereiro");
        case 3:
            System.out.println("março");
        case 4:
            System.out.println("abril");
        case 5:
            System.out.println("maio");
        case 6:
            System.out.println("junho");
        case 7:
            System.out.println("julho");
        case 8:
            System.out.println("agosto");
        case 9:
            System.out.println("setembro");
        case 10:
            System.out.println("outubro");
        case 11:
            System.out.println("novembro");
        case 12:
            System.out.println("dezembro");
    }
    if (mes > 12|| mes <= 0) {
        System.out.println("mes não existente");
    }
}
}
