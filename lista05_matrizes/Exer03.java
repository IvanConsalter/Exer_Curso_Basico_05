/*
 * CAPTURE DO TECLADO VALORES PARA PREENCHIMENTO DE UMA MATRIZ M 3X3.
 * APÓS A CAPTURA IMPRIMA A MATRIZ CRIADA E ENCONTRE A QUANTIDADE DE 
 * NÚMEROS PARES, A QUANTIDADE DE NÚMEROS ÍMPARES.
 */
package lista05_matrizes;

import java.util.Random;

public class Exer03 {

	public static void main(String[] args) {
		
		Random gerarNumero = new Random();
		
		int[][] matrizM = new int[3][3];
		int quantidadePar = 0, quantidadeImpar = 0;
		
		
		for(int i = 0; i < matrizM.length; i++) {
			for(int j = 0; j < matrizM[i].length; j++) {
				matrizM[i][j] = gerarNumero.nextInt(101) + 1;
				if(matrizM[i][j] % 2 == 0) {
					quantidadePar ++;
				}
				else {
					quantidadeImpar ++;
				}
			}
		}
		
		for(int i = 0; i < matrizM.length; i++) {
			for(int j = 0; j < matrizM[i].length; j++) {
				System.out.println("Posição " + i + "x" + j + ": " + matrizM[i][j]);
			}
		}
		
		System.out.println();
		System.out.println("Quantidade de números Pares na Matriz: " + quantidadePar);
		System.out.println("Quantidade de números Ìmpares na Matriz: " + quantidadeImpar);
		
	}

}
