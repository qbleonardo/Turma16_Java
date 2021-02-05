package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Estoque {
			public static void main(String[] args) {
				Collection<String> produtos = new ArrayList();
				produtos.add("Celular");
				produtos.add("Computador");
				produtos.add("Hardware em geral");
				produtos.add("Fones de ouvido");
				System.out.println("Lista de todos os produtos disponíveis: "+produtos+"\n");
				if (produtos.remove("Fones de ouvido")) {
					System.out.println("Lista de produtos atualizada.");
					System.out.println("Lista de produtos disponíveis: "+produtos);
				}
				
			}
}
