package Apliccation;


import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Sistem taf = new Sistem();
		

		taf.limparTerminal();
		

		taf.ProgramBanner();

		System.out.print("Opcão: ");
		int opcao = sc.nextInt();

		while (opcao != 7){
			switch (opcao) {
				case 1:
					taf.AdicionarTarefa();
					System.out.println("Tarefa registrada com sucesso! ");
					System.out.println("\n");
					taf.ProgramBanner();
					System.out.print("Opcão: ");
					opcao = sc.nextInt();
					sc.nextLine();
					break;
				case 2:
					taf.RemoverTarefa();
					System.out.println("");
					taf.ProgramBanner();
					System.out.println("\n");
					System.out.print("Opcão: ");
					opcao = sc.nextInt();;
					break;
				case 3:
					taf.filtroPrioridade();
					System.out.println("");
					taf.ProgramBanner();
					System.out.println("\n");
					System.out.print("Opcão: ");
					opcao = sc.nextInt();;
					break;
				case 4:
					taf.printarTafs();
					taf.ProgramBanner();
					System.out.print("Opcão: ");
					opcao = sc.nextInt();;
					break;
				case 5:
					taf.salvar();
					taf.ProgramBanner();
					System.out.println("\n");
					System.out.print("Opcão: ");
					opcao = sc.nextInt();;
					break;
				case 6:	
					taf.modificarTarefa();
					System.out.println("");
					taf.ProgramBanner();
					System.out.println("\n");
					System.out.print("Opcão: ");
					opcao = sc.nextInt();;
					break;
			}
			
		
		}

		if (opcao == 7){
			taf.load();
			System.out.println("Programa encerrado!");
			System.exit(0);
			
		}
		
		

		
		
		sc.close();

	}

}
