/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication20;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int calif;
        
        Scanner captu = new Scanner(System.in);
    System.out.println("Calificiacion:");
    calif = captu.nextInt();
    captu.nextLine();
    if( calif <=100  && calif >=0){
        System.out.println("Calificiacion valida");
    }else{
        System.out.println("Calificacion invalida");
    }
            
    }
    
}
