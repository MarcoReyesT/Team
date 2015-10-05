/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerteam;

import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //System.out.println("Ingrese el  numero de problemas: ");
        int problemas = in.nextInt();
        int implementados = 0;
        String preguntas;
        for (int i = 0; i <= problemas; i++) {
            //System.out.println("Ingrese el valor de las 3 soluciones: ");
            preguntas = in.nextLine();
            if (preguntas.contains("1 1")) {
                implementados++;
            }
            if (preguntas.contains("1 0 1")) {
                implementados++;
            }
        }
        
        /*
        String[] input = FileManager.readLines("C:/Users/Marco/Documents/NetBeansProjects/TallerTeam/Input.txt");
        int problemas = Integer.parseInt(input[0]);
        int implementados = 0;
        for (int i = 1; i <= problemas; i++) {
            if (input[i].contains("1 1")) {
                implementados++;
            }
            if (input[i].contains("1 0 1")) {
                implementados++;
            }
            
        }
                */
        System.out.println(implementados);
        
    }

}
