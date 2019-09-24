/*
 * GERE E IMPRIMA UMA MATRIZ M 4X4 COM VALORES ALEATÓRIOS
 * ENTRE 0 - 9.APÓS ISSO DETERMINE O MAIOR NÚMERO DA MATRIZ 
 * E A SUA POSIÇÃO(LINHA, COLUNA).
 */
package lista05_matrizes;

import java.util.Random;
//import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		Random geradorNumero = new Random();
			
		int[][] matrizM = new int[4][4];
		int[] vetorMaior = new int[16];
		int[] vetorLinha = new int[16];
		int[] vetorColuna = new int[16];
		
		int maior = 0, k = 0;
		
		for(int i = 0; i < matrizM.length; i++) {
			
			for(int j = 0; j < matrizM[i].length; j++) {
				matrizM[i][j] = geradorNumero.nextInt(10);
				if(matrizM[i][j] >= maior) {
					maior = matrizM[i][j];
					
					
				}
			}
		}
		
		for(int i = 0; i < matrizM.length; i++) {
			for(int j = 0; j < matrizM[i].length; j++) {
				if(maior == matrizM[i][j]) {
					vetorMaior[k] = maior;
					vetorLinha[k] = i;
					vetorColuna[k] = j;
					k++;
				}
			}
		}
		
		for(int i = 0; i < matrizM.length; i++) {
			for(int j = 0; j < matrizM[i].length; j++) {
				System.out.println("Posição " + i + "X" + j + ": " + matrizM[i][j]);
			}
		}
			
		System.out.println();
		
		for(int i = 0; i < vetorMaior.length; i++) {
			if(vetorMaior[i] == 0) {
				break;
			}
			
			System.out.println("O maior número foi: " + vetorMaior[i] + " na posição: " + vetorLinha[i] + "X" + vetorColuna[i]);
		}
		
		
		//sc.close();
	}

}
