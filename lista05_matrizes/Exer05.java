/*
 * MODIFIQUE O PROGRAMA ANTERIOR DE MANEIRA A GUARDAR OS
 * COMPROMISSOS DE TODO O ANO, ORGANIZADOS POR MÊS, DIA E HORA
 * (SÓ 8 HORAS POR DIA).
 */
package lista05_matrizes;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[][][] agenda = new String[12][31][24];
		byte resposta;
		int dia = 0, hora = 0, mes = 0;
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
				
				//ENTRA E VERIFICA SE O MES E VALIDO
				while(sair == false) {
					System.out.print("MES: ");
					mes = sc.nextInt();
					if (mes > 0 && mes <= 12) {
						sair = true;
					}
					else {
						System.out.println("MES INCORRETO, DIGITE NOVAMENTE.");
					}
				}
				sair = false;
				
				//ENTRA E VERIFICA SE O DIA E VALIDO
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
				
				//ENTRE E VERIFICA SE A HORA E VALIDA
				while(sair == false) {
					System.out.print("HORA: ");
					hora = sc.nextInt();
					if ((hora >= 8 && hora <= 11) || (hora >= 13 && hora <= 16) ) {
						sair = true;
					}
					else {
						System.out.println("HORA INCORRETA, DIGITE NOVAMENTE.");
					}
				}
				
				sair = false;
				dia--;
				mes--;
				
				//VERIFICA SE JA EXISTE UM EVENTO E INSERI UM NOVO EVENTO
				if(agenda[mes][dia][hora] == null) {
					System.out.print("Digite o Evento: ");
					agenda[mes][dia][hora] = sc.next();
				}
				else {
					System.out.println("\nJÁ EXISTE EVENTO NESSE DIA E HORA.");
					System.out.println("DESEJA SUBSTITUI-LO? (S/N): ");
					substituirEvento = sc.next().charAt(0);
					if(substituirEvento == 's' || substituirEvento == 'S') {
						System.out.print("Digite o Evento: ");
						agenda[mes][dia][hora] = sc.next();
					}
				}
				
				
				break;

			case 2:
				System.out.println("Compromissos:");
				
				for (int i = 0; i < agenda.length; i++) {
					for (int j = 0; j < agenda[i].length; j++) {
						for(int k = 0; k < agenda[i][j].length; k++) {
							if (agenda[i][j][k] == null) {
								continue;
							}

							System.out.print("Mes:" + (i+1) + ", Dia:" + (j+1) + ", " +  k + "Horas: ");
							System.out.println(agenda[i][j][k]);
						}
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
