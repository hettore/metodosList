package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Double> notas = new ArrayList<>();
		// adicionando itens a lista
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);
		// exibindo a lista
		System.out.println(notas);
		// procurando na lista a posição de uma nota com o indexOf
		System.out.println("A nota " + notas.get(3) + " fica na posição " + notas.indexOf(5d) + " da lista.");
		// adicionando um item na lista passando a posição e o valor (sem perdas)
		notas.add(4, 8.0);
		System.out.println(notas);
		// substituindo uma nota passando a posição e a nota nova
		notas.set(notas.indexOf(5d), 6.0);
		// verificando se existe um certo valor na lista
		System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));
		// mostrando a lista
		System.out.println(notas);
		
		System.out.println("Exibe todas as notas na ordem em que foram informadas: ");
		for (Double itens : notas ) {
			System.out.println(itens);
		}
		
		System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
		
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0.0;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println("Exiba a soma dos valores: " + soma);
		
		System.out.println("Exiba a média das notas: " + String.format("%.2f",(soma/notas.size())));
		// removendo a nota usa se .remove(Object o) passando a nota
		notas.remove(0.0);
		System.out.println("Remova a nota 0.0: " + notas);
		// removendo a nota na posição usa se .remove(int index)
		System.out.println("Remova a nota da posição 0: ");
		notas.remove(0);
		System.out.println(notas);
		
		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if(next < 7) {
				iterator1.remove();
			}
		}
		System.out.println(notas);
		
		System.out.println("Apague toda a lista");
		notas.clear();
		System.out.println(notas);
		
		System.out.println("Confira se a lista esta vazia: " + notas.isEmpty());
		
		List<Double> notas2 = new LinkedList<>();
		
		System.out.println("Crie uma lista chamada notas2 e coloque todos os elementos da list ArrayList nessa nova lista: ");
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);
		notas2 = notas;
		
		System.out.println(notas2);
		
		System.out.println("Mostre a primeira nota dessa nova lista sem removê-lo: ");
		System.out.println(notas2.get(0));
		
		System.out.println("Mostre a primeira nota da nova lista removendo-a:");
		System.out.println(notas2.remove(0));
		System.out.println(notas2);
	}

}
