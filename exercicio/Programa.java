package exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.funcionario;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<funcionario> lista = new ArrayList<>();
		
		System.out.println("quantos funcionarios: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			System.out.println();
			System.out.println("funcionario # " + (i+1) + ":");
			System.out.print("id:");
			Integer id = sc.nextInt();
			System.out.print("nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("salario: ");
			Double salario = sc.nextDouble();	
			
			funcionario func = new funcionario(id, nome, salario);
			
			lista.add(func);
			
		}
		
		System.out.println("entre do id do funcionario; ");
		int ids = sc.nextInt();
		Integer pos = posid(lista, ids); 
		if (pos == null) {
			System.out.println("id inexistente");
		}
		else {
			System.out.println("entre com a porcetage a ser encrementada: ");
			double porc = sc.nextDouble();
			lista.get(pos).aumentosalarial(porc);
		}
		
		System.out.println();
		System.out.println("Lista de funcionarios: ");
		for (funcionario func : lista ) {
			System.out.println(func);
		}
		
		
		sc.close();

	}
	public static int posid(List<funcionario> lista, int id) {
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getId()==id) {
				return i;
			}
		}
		return -1;
	}
}
