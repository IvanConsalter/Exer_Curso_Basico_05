/*
 * GERE E IMPRIMA UMA MATRIZ M 10X10 COM VALORES ALEATÓRIOS ENTRE
 * 0-9.APÓS ISSO INDIQUE QUAL É O MAIOR E O MENOR VALOR DA LINHA 5
 * E QUAL É O MAIOR E O MENOR VALOR DA COLUNA 7.
 */
package lista05_matrizes;

import java.util.Random;

public class Exer02 {

	public static void main(String[] args) {
		
		Random geradorNumero = new Random();
		
		int[][] matrizM = new int[10][10];
	
		int maiorLinha5 = 0, menorLinha5 = 10;
		int maiorColuna7 = 0, menorColuna7 = 10;
		int colunaMaior = -1, colunaMenor = -1;
		int linhaMaior = -1, linhaMenor = -1;
		
		for(int i = 0; i < matrizM.length; i++) {
			for(int j = 0; j < matrizM[i].length; j++) {
				matrizM[i][j] = geradorNumero.nextInt(10);
				if(i == 5) {
					if(matrizM[i][j] > maiorLinha5) {
						maiorLinha5 = matrizM[i][j];
						colunaMaior = j;
					}
					if(matrizM[i][j] < menorLinha5) {
						menorLinha5 = matrizM[i][j];
						colunaMenor = j;
					}
				}
				
				if(j == 7) {
					if(matrizM[i][j] > maiorColuna7) {
						maiorColuna7 = matrizM[i][j];
						linhaMaior = i;
					}
					if(matrizM[i][j] < menorColuna7) {
						menorColuna7 = matrizM[i][j];
						linhaMenor = i;
					}
				}
			}
		}
		
		for(int i = 0; i < matrizM.length; i++) {
			for(int j = 0; j < matrizM[i].length; j++) {
				System.out.println("Posição " + i + "X" + j + ": " + matrizM[i][j]);
			}
		}
		
		System.out.println();
		System.out.println("Maior da linha 5 = " + maiorLinha5 + " na posição 5x" + colunaMaior);
		System.out.println("Menor da linha 5 = " + menorLinha5 + " na posição 5x" + colunaMenor);
		System.out.println("Maior da coluna 7 = " + maiorColuna7 + " na posição " + linhaMaior + "x7");
		System.out.println("Menor da coluna 7 = " + menorColuna7 + " na posição " + linhaMenor + "x7");
	}

}
