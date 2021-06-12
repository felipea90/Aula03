import java.util.Scanner;

//Crie um programa que pe�a que o usu�rio digite os valores dos 3 lados de um tri�ngulo.O seu programa dever� validar se o tri�ngulo existe. (A regra para isso � que nenhum lado poder� ser igual a 0 e a soma de dois lados n�o pode ser menor que o terceiro).Caso o tri�ngulo exista, o seu programa dever� mostrar o tipo dele.

public class ValidaTriangulo {

	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		
		int lado1, lado2, lado3, soma1, soma2, soma3;
		
		System.out.println("Digite os valores dos lados de um Tri�ngulo:");
		
		System.out.println("Lado 1:");
		lado1 = leitor.nextInt();
		
		System.out.println("Lado 2:");
		lado2 = leitor.nextInt();
		
		System.out.println("Lado 3:");
		lado3 = leitor.nextInt();
		
		if (lado1 != 0 && lado2 != 0 && lado3 != 0)
		{
			soma1 = lado1 + lado2;
			soma2 = lado1 + lado3;
			soma3 = lado2 + lado3;
			
			if(soma1 < lado3 || soma2 < lado2 || soma3 < lado1)
			{
				System.out.println("A soma de dois lados n�o pode ser menor do que o terceiro.\nEste tri�ngulo n�o existe.");
			}
			else
			{
				
				if (lado1 == lado2 && lado1 == lado3)
				{
					System.out.println("Este � um Tri�ngulo Equil�tero");
					System.out.println("Lado1 = " + lado1);
					System.out.println("Lado2 = " + lado2);
					System.out.println("Lado3 = " + lado3);
				}
				else if ((lado1 == lado2 && lado1 != lado3) || (lado1 != lado2 && lado2 == lado3) || (lado1 == lado3 && lado1 != lado2))
					
					//if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) -> Is�sceles
					//if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) -> Escaleno
					
				{
					System.out.println("Este � um Tri�ngulo Is�sceles");
					System.out.println("Lado1 = " + lado1);
					System.out.println("Lado2 = " + lado2);
					System.out.println("Lado3 = " + lado3);
				}
				else
				{
					System.out.println("Este � um Tri�ngulo Escaleno");
					System.out.println("Lado1 = " + lado1);
					System.out.println("Lado2 = " + lado2);
					System.out.println("Lado3 = " + lado3);
				}
			}
		}
		else
		{
			System.out.println("O lados n�o podem ser Zero.\nEste tri�ngulo n�o existe.");
		}
		
		leitor.close();

	}

}
