/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.operacoes;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String args[]){   
       
        Operacoes biblioteca = new Operacoes();
        double soma = biblioteca.soma(1, 2);
        double subtracao = biblioteca.subtracao(1, 2);
        double multiplicacao = biblioteca.multiplicacao(1, 2);
        double divisao = biblioteca.divisao(1, 2);

        double[] vetor = new double[10];
        
        vetor[0] = 1;
        vetor[1] = 2;
        vetor[2] = 3;
        vetor[3] = 4;
        vetor[4] = 5;
        vetor[5] = 6;
        vetor[6] = 7;
        vetor[7] = 8;
        vetor[8] = 9;
        vetor[9] = 10;
        
        double max = biblioteca.max(vetor);
        double min = biblioteca.min(vetor);
        double media = biblioteca.media(vetor);
        double mediana = biblioteca.mediana(vetor);

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(max);
        System.out.println(min);
        System.out.println(media);
        System.out.println(mediana);

        
    	System.exit(0);
		
    }
}
