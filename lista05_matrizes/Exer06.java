/*
 * FAÇA UM PROGRAMA PARA JOGAR O JOGO DA VELHA. O PROGRAMA DEVE PERMITIR
 * QUE DOIS JOGADORES FAÇAM UMA PARTIDA DO JOGO DA VELHA, USANDO O COMPUTADOR
 * COMO TABULEIRO. CADA JOGADOR VAI ALTERNADAMENTE INFORMANDO A POSIÇÃO ONDE
 * DESEJA COLOCAR A SUA PEÇA ('O' OU 'X'). O PROGRAMA DEVE IMPEDIR JOGADAS
 * INVÁLIDAS E DETERMINAR AUTOMATICAMENTE QUANDO O JOGO TERMINOU E QUEM FOI
 * O VENCEDOR(JOGADOR1 OU JOGADOR2). A CADA NOVA JOGADA, O PROGRAMA DEVE 
 * ATUALIZAR A SITUAÇÃO DO TABULEIRO NA TELA.
 */
package lista05_matrizes;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("    1   2   3");
		System.out.println("1  ___|___|___");

		System.out.println("2  ___|___|___");

		System.out.println("3     |   |   ");
		
		System.out.println("Player1 = X");
		System.out.println("PLayer2 = O");
		
		char [][] jogoDaVelha = new char[3][3];
		int jogada = 1, linha = 0, coluna = 0;
		boolean venceu = false, validarPosicao = false, validarJogada = false;
		char simbolo;
		
		while(!venceu) {
				
				if(jogada % 2 == 1) {
					System.out.println("Vez do Player1 jogar:");
					simbolo = 'X';
				}
				else {
					System.out.println("Vez do Player2 jogar:");
					simbolo = 'O';
				}
				
				while(!validarJogada) {
					
					while(!validarPosicao) {
						System.out.print("Escolha linha(1-2-3): ");
						linha = sc.nextInt();
						System.out.print("Escolha coluna(1-2-3): ");
						coluna = sc.nextInt();
						
						if((linha < 1 || linha > 3) || (coluna < 1 || coluna > 3)) {
							System.out.println("POSIÇÃO NÃO EXISTE. TENTE NOVAMENTE.");
						}
						else {
							validarPosicao = true;
						}
					}
					
					validarPosicao = false;
					linha --;
					coluna --;
					
						
				if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {
					System.out.println("JOGADA INVÁLIDA. TENTE NOVA JOGADA.");
				} else {
					jogoDaVelha[linha][coluna] = simbolo;
					jogada++;
					validarJogada = true;
				}
					
					
				}
				
				validarJogada = false;
				
				for(int i = 0; i < jogoDaVelha.length; i++) {
					for(int j = 0; j < jogoDaVelha[i].length; j++) {
						System.out.print(jogoDaVelha[i][j] + "|");
					}
					System.out.println();
				}
				
				if(		jogoDaVelha[0][0] == 'X' && jogoDaVelha[0][1] == 'X' && jogoDaVelha[0][2] == 'X' ||
						jogoDaVelha[1][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[1][2] == 'X' ||	
						jogoDaVelha[2][0] == 'X' && jogoDaVelha[2][1] == 'X' && jogoDaVelha[2][2] == 'X' ||
						jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][0] == 'X' && jogoDaVelha[2][0] == 'X' ||
						jogoDaVelha[0][1] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][1] == 'X' ||
						jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][2] == 'X' && jogoDaVelha[2][2] == 'X' ||
						jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][2] == 'X' ||
						jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][0] == 'X' ) {
						
						System.out.println("Player1 GANHOU! CONGRATULATIONS  =) ");
						venceu = true;
				}
					else if(		jogoDaVelha[0][0] == 'O' && jogoDaVelha[0][1] == 'O' && jogoDaVelha[0][2] == 'O' ||
									jogoDaVelha[1][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[1][2] == 'O' ||	
									jogoDaVelha[2][0] == 'O' && jogoDaVelha[2][1] == 'O' && jogoDaVelha[2][2] == 'O' ||
									jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][0] == 'O' && jogoDaVelha[2][0] == 'O' ||
									jogoDaVelha[0][1] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][1] == 'O' ||
									jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][2] == 'O' && jogoDaVelha[2][2] == 'O' ||
									jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][2] == 'O' ||
									jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][0] == 'O' ) {
							
							System.out.println("Player2 GANHOU! CONGRATULATIONS  =) ");
							venceu = true;
					}
						else if(jogada > 9) {
							System.out.println("DEU VELHA! =( ");
							System.out.println("JOGUE NOVAMENTE.");
							venceu = true;
						}
				
		}
		
		
		sc.close();
	}

}
