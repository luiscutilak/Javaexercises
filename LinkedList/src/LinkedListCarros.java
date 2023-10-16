import java.util.LinkedList;

	//LINKED LIST Insere no inicio da lista(.addFirst). E também no final(.addLast)

public class LinkedListCarros {

	
	public static void main(String[] args) {

		String carro;
	    
	    LinkedList<String> cars = new LinkedList<>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
		System.out.println(cars);
	    
	    // incluindo Mazda no inicio
	    cars.addFirst("Mazda");
	    System.out.println(cars);
	     
	    // Incluindo Bugatti no fim
	    cars.addLast("Bugatti");
	    System.out.println(cars);
	    // Na linha 10 declarado a variavel carro no formato String que sera atribuido o valor do carro na posição 3.
	    carro = cars.get(3);
	    System.out.println(carro);
	    
	    // removendo Mazda
	    cars.removeFirst();
	    System.out.println(cars);  
		
		//removendo o ultimo
		cars.removeLast();
		System.out.println(cars);

	    // pega o primeiro
	    System.out.println(cars.getFirst());
	    System.out.println(cars);

		//pega o último
		System.out.println(cars.getLast());
		System.out.println(cars);
		
		//lim
		cars.clear();
		if (cars.isEmpty()) {
			System.out.println("Lista de carros esta vazia");
		}
		
	}
	    
}