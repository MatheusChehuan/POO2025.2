package clinicaveterinaria;

public class main {
	public static void main(String[] args) {

	Tutor tutor1 = new Tutor("Matheus", "24988429254");
	Tutor tutor2 = new Tutor("Roni", "21 9999999999");
	
	Cachorro cachorro = new Cachorro("Cachorro", 15, "cachorro", "doberman", tutor1);
	Gato gato1 = new Gato("garfield",10,"gato","laranja", tutor1);
	Gato gato2 = new Gato("saturno",10,"gato","laranja", tutor2);
	Gato gato3 = new Gato("urano",10,"gato","preto e branco", tutor2);
	Gato gato4 = new Gato("netuno",10,"gato","malhado", tutor2);
	
	System.out.println(cachorro.toString());
	
	
	}
}
