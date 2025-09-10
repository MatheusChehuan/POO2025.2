package revisaoheranca;

public class TestePlano {

	public static void main(String[] args) {
		Clinica clinica = new Clinica("Amil", 80., 5, "Copa D'or", "01.12121.1212-42");
		Anestesista anestesista = new Anestesista("Amil", 80., 5, "Felipe", 23451, "Geral");
		Pediatra pediatra = new Pediatra("Amil", 80, 5, "Thiago", 231, false);
		controlePagamentos pgto = new controlePagamentos();
		
		//System.out.println("Valor Pago pago a clinica: R$ ");
		pgto.calcularTotalPago(clinica);
		//System.out.println("Valor Pago pago ao pediatra: R$ ");
		pgto.calcularTotalPago(pediatra);
		//System.out.println("Valor Pago ao anestesista: R$ ");
		pgto.calcularTotalPago(anestesista);
		
		//System.out.println(clinica.toString());
		System.out.println(pediatra.toString());
		System.out.println(anestesista.toString());
		System.out.println("\nTotal Geral Pago Amil: R$ " + String.format("%.2f",pgto.getTotalPago()));
	}

}
