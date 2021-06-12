import java.util.Scanner;

//Um drone de limpeza de ruas deve escolher carregar sempre o lixo de menor peso. Entre os pesos de 3 lixos informados pelo usuário, um programa deve indicar qual deles deve ser carregado pelo drone.

public class DroneLixo 
{

	public static void main(String[] args) 
	{

	//PRIMEIRA PARTE: PEDIR PARA O USUÁRIO DIGITAR OS DADOS
		
	Scanner leitor = new Scanner(System.in);
	
	double lixo1, lixo2, lixo3;
	
	int opcao;
	
	System.out.println("Digite o peso do primeiro lixo");
	lixo1 = leitor.nextDouble();
	
	System.out.println("Digite o peso do segundo lixo");
	lixo2 = leitor.nextDouble();
	
	System.out.println("Digite o peso do terceiro lixo");
	lixo3 = leitor.nextDouble();
	
	//SEGUNDA PARTE: DESCOBRIR QUAL É O LIXO DE MENOR PESO
	
	//Para o primeiro lixo ser o menor, o que eu preciso testar?
	//Ele precisa ser ao mesmo tempo, menor que o lixo 2 e menor que o lixo 3
	
	if (lixo1 < lixo2 && lixo1 < lixo3)
	{
		System.out.println("Coleta do Primeiro Lixo");
	}
	else if (lixo2 < lixo1 && lixo2 < lixo3)
	{
		System.out.println("Coleta do Segundo Lixo");
	}
	else if (lixo3 < lixo1 && lixo3 < lixo2)
	{
		System.out.println("Coleta do Terceiro Lixo");
	}
	else
	{
		System.out.println("Todos os Lixos têm o mesmo peso, selecione qual deverá ser recolhido:");
		
		System.out.println("1 - Primeiro Lixo\n2 - Segundo Lixo\n3 - Terceiro Lixo");
		opcao = leitor.nextInt();
		
		switch(opcao)
		{
		case 1:
			System.out.println("Coleta do Primeiro Lixo");
			break;
		case 2:
			System.out.println("Coleta do Segundo Lixo");
			break;
		case 3:
			System.out.println("Coleta do Terceiro Lixo");
			break;
		default:
			System.out.println("Opção de Lixo Inválida");
			break;
		}
	}

	leitor.close();
	
	}

}
