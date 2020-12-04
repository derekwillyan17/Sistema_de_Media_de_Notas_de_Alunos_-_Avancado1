import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Alunos;

public class Medias_Avancadas {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		List <Alunos> lista_alunos = new ArrayList<Alunos>();
		
		System.out.print("Digite a quantidade de alunos para registro: ");
		int num_al = input.nextInt();
		
		System.out.printf("\n");
		
		Alunos[] alunos = new Alunos[num_al];
		
		for (int cont = 0; cont < alunos.length; cont++) {
	
			alunos[cont] = new Alunos();
			
			System.out.printf("Aluno #%d\n", cont+1);
			System.out.print("Id: ");
			int id = input.nextInt(); input.nextLine();
			alunos[cont].setId(id);
			System.out.print("Nome: ");
			String nome = input.nextLine();
			alunos[cont].setName(nome);
			System.out.printf("\n");
			System.out.printf("Digite a quantidade de Notas para registro: ");
			int num_notas = input.nextInt();
			System.out.printf("\n");
			
			double[] notas = new double[num_notas];
			double soma = 0;
			
			for (int cont2 = 0; cont2 < notas.length; cont2++) {
				
				System.out.printf("Nota %d: ", cont2+1);
				notas[cont2] = input.nextDouble();
				soma += notas[cont2];
				
			}
			
			double media = soma/notas.length;
			alunos[cont].setMedia(media);
			
			if (alunos[cont].getMedia() >= 7) {

				String situ = "APROVADO";
				alunos[cont].setSituacao(situ);
				
			} else if (alunos[cont].getMedia() >= 4) {
				
				String situ = "NAF";
				alunos[cont].setSituacao(situ);
				
			} else if (alunos[cont].getMedia() >= 0) {
				
				String situ = "REPROVADO";
				alunos[cont].setSituacao(situ);
				
			}
			
			lista_alunos.add(alunos[cont]);
			
			System.out.printf("\n");
		}
		
		for (int cont = 0; cont < alunos.length; cont++ ) {
			
			Alunos al = lista_alunos.get(cont);
			System.out.printf("%d: %s, %.2f: %s\n", al.getId(), al.getName(), al.getMedia(), al.getSituacao());
			
			
		}

		input.close();

	}

}
