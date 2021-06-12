import java.util.Scanner;

//Crie um programa que peça que o usuário digite os valores dos 3 lados de um triângulo.O seu programa deverá validar se o triângulo existe. (A regra para isso é que nenhum lado poderá ser igual a 0 e a soma de dois lados não pode ser menor que o terceiro).Caso o triângulo exista, o seu programa deverá mostrar o tipo dele.

public class ValidaTriangulo {

	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		
		int lado1, lado2, lado3, soma1, soma2, soma3;
		
		System.out.println("Digite os valores dos lados de um Triângulo:");
		
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
				System.out.println("A soma de dois lados não pode ser menor do que o terceiro.\nEste triângulo não existe.");
			}
			else
			{
				
				if (lado1 == lado2 && lado1 == lado3)
				{
					System.out.println("Este é um Triângulo Equilátero");
					System.out.println("Lado1 = " + lado1);
					System.out.println("Lado2 = " + lado2);
					System.out.println("Lado3 = " + lado3);
				}
				else if ((lado1 == lado2 && lado1 != lado3) || (lado1 != lado2 && lado2 == lado3) || (lado1 == lado3 && lado1 != lado2))
					
					//if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) -> Isósceles
					//if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) -> Escaleno
					
				{
					System.out.println("Este é um Triângulo Isósceles");
					System.out.println("Lado1 = " + lado1);
					System.out.println("Lado2 = " + lado2);
					System.out.println("Lado3 = " + lado3);
				}
				else
				{
					System.out.println("Este é um Triângulo Escaleno");
					System.out.println("Lado1 = " + lado1);
					System.out.println("Lado2 = " + lado2);
					System.out.println("Lado3 = " + lado3);
				}
			}
		}
		else
		{
			System.out.println("O lados não podem ser Zero.\nEste triângulo não existe.");
		}
		
		leitor.close();

	}

}
