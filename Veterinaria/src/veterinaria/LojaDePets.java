package veterinaria;

public class LojaDePets {
	private String nomeLoja;
	private Animal[] pets;
	private int contadoranimal = 0;
	private int limite = 10;
	
	
	public LojaDePets(String nomeLoja) {
		super();
		this.nomeLoja = nomeLoja;
		this.pets = new Animal[limite];
	}



	public String getNomeLoja() {
		return nomeLoja;
	}


	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}


	public Animal[] getAnimalDeEstimacao() {
		return pets;
	}


	public void setAnimalDeEstimacao(Animal[] pets) {
		this.pets = pets;
	}


	public void adicionarAnimal(AnimalDeEstimacao animal) {
		//se contador animal menor que limite, joga animal no vetor e se aproxima do limite
		if (contadoranimal <= limite) {
			pets[contadoranimal] = animal;
			contadoranimal++;
		}		
	}
	
	
	public void listarAnimais(){
		
		System.out.println("-------------------------");
		System.out.println("|    Lista de animais   |");
		System.out.println("-------------------------");

		for (int i = 0; i < pets.length; i++) {
			//se o contador for maior que 0 e for diferente de nulo, imprime o pet
			if ((pets.length > 0) && (pets[i] != null)) {
				pets[i].imprimir();
			}
		}
	}
	
	public void adotarAnimal(String nome) throws AnimalException {
			for (int i = 0; i < pets.length; i++) {
				//ele é o atual
				AnimalDeEstimacao atual = ((AnimalDeEstimacao)pets[i]);
				//enquanto ele for diferente de nulo e o nome estiver na lista
				if (atual != null && atual.getNome().equalsIgnoreCase(nome))  {
					//adotou
					System.out.println("Parabéns você adotou " + nome + "\n");
					//e agora não tem nada
					pets[i] = null;
				
					return;
				}
			}
			throw new AnimalException("Animal não encontrado.");
	}
}