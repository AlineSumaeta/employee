package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee empregado = new Employee();
		
		System.out.print("Nome: ");
		empregado.nome = sc.nextLine();
		System.out.print("Salário bruto: ");
		empregado.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		empregado.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.print("Empregado (a): " + empregado);
		
		System.out.println();
		System.out.print("Qual porcentagem queres que aumente o salário: ");
		double porcentagem =  sc.nextDouble();
		empregado.aumentarSalario(porcentagem);
		
		System.out.println();
		System.out.print("Dados atualizados: " + empregado);
		
		sc.close();

	}

}
