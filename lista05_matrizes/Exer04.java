/*
 * FAÇA UM PROGRAMA PARA ARMAZENAR EM UMA MATRIZ OS COMPROMISSOS
 * DE UMA AGENDA PESSOAL. CADA DIA DO MÊS DEVE CONTER 24 HORAS, ONDE PARA
 * CADA UMA DESTAS 24 HORAS PODEMOS ASSOCIAR UMA TAREFA ESPECÍFICA
 * (COMPROMISSO AGENDADO). O PROGRAMA DEVE TER UM MENU ONDE O USÚARIO
 * INDICA O DIA DO MÊS QUE DESEJA ALTERAR E A HORA, ENTRANDO EM SEGUIDA
 * COM O COMPROMISSO, OU ENTÃO, O USUÁRIO PODE TAMBÉM CONSULTAR A AGENDA,
 * FORNECENDO O DIA E A HORA PARA OBTER O COMPROMISSO ARMAZENADO.
 */
package lista05_matrizes;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[][] agenda = new String[31][24];
		byte resposta;
		int dia = 0, hora = 0;
		boolean sair = false;
		char substituirEvento;
	

		
		while(sair == false) {
			System.out.println("[0] = SAIR");
			System.out.println("[1] = ADICIONAR NOVO EVENTO");
			System.out.println("[2] = VERIFICAR EVENTOS");
			System.out.print("SELECIONE O OPÇÃO: ");
			resposta = sc.nextByte();
			switch (resposta) {
			case 1:
				System.out.println("Entre com os dados abaixo:");
				while(sair == false) {
					System.out.print("DIA: ");
					dia = sc.nextInt();
					if (dia > 0 && dia <= 31) {
						sair = true;
					}
					else {
						System.out.println("DIA INCORRETO, DIGITE NOVAMENTE.");
					}
				}
				sair = false;
				while(sair == false) {
					System.out.print("HORA: ");
					hora = sc.nextInt();
					if (hora >= 0 && hora <= 23) {
						sair = true;
					}
					else {
						System.out.println("HORA INCORRETA, DIGITE NOVAMENTE.");
					}
				}
				
				sair = false;
				dia--;
				
				if(agenda[dia][hora] == null) {
					System.out.print("Digite o Evento: ");
					agenda[dia][hora] = sc.next();
				}
				else {
					System.out.println("\nJÁ EXISTE EVENTO NESSE DIA E HORA.");
					System.out.println("DESEJA SUBSTITUI-LO? (S/N): ");
					substituirEvento = sc.next().charAt(0);
					if(substituirEvento == 's' || substituirEvento == 'S') {
						System.out.print("Digite o Evento: ");
						agenda[dia][hora] = sc.next();
					}
				}
				
				
				break;

			case 2:
				System.out.println("Compromissos:");

				for (int i = 0; i < agenda.length; i++) {
					for (int j = 0; j < agenda[i].length; j++) {
						if (agenda[i][j] == null) {
							continue;
						}

						System.out.print("Dia: " + (i+1) + "/ " + j + " Horas: ");
						System.out.println(agenda[i][j]);
					}
				}

				break;

			case 0:
				sair = true;
				break;
				
			default:
				System.out.println("CÓDIGO INVÁLIDO.TENTE NOVAMENTE.");

			}

			
		}
		

		sc.close();
	}

}
