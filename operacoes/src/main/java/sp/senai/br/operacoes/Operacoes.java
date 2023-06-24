/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.operacoes;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Operacoes {
    
    public static Scanner teclado = new Scanner(System.in);
    
    public static double soma(double valor1, double valor2){
        return valor1 + valor2;  
    }
    public static double subtracao(double valor1, double valor2){
        return valor1 - valor2;  
    }
    public static double multiplicacao(double valor1, double valor2){
        return valor1 * valor2;  
    }
    public static double divisao(double valor1, double valor2){
        return valor1 / valor2;  
    }
    
    public static double max(double[] vetor) {
        double max = 0;
        
        for(int i = 0; i < vetor.length; i ++){
            if(i > max) {
                max = vetor[i];
            }
        }
        return max;
    }
        
    public static double min(double[] vetor) {
        double min = vetor[0];
        
        for(int i = 0; i < vetor.length; i ++){
            if(vetor[i] < min) {
                min = vetor[i];
            }
        }
        
        return min;
    }
    
    public static double media(double[] vetor) {
    int soma = 0;
    double media;
    
        for(int i = 0; i < vetor.length; i++) {
        soma += vetor[i];
        }
        media = soma / vetor.length;
                
                return media;
    }
    
    public static double mediana(double[] vetor) {
        double mediana;
        
        int tam = vetor.length;
        if(tam % 2 == 0) {
            mediana = (vetor[tam - 1] + vetor [tam - 1]) / 2.0;
        }
        else {
            tam = (tam + 1) / 2;
            mediana = vetor[tam - 1];
        }
        return mediana;
    }
}
