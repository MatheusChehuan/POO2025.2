package enumeradores;

public class TesteCurso {

	public static void main(String[] args) {
		Curso curso = new Curso("Java Backend", PeriodoCurso.MANHA);
		
		System.out.println("Curso: " + curso.getNome());
		System.out.println("Dias: " + curso.getPeriodocurso().getDiasSemana());
		System.out.println("Valor Curso:R$ " + String.format("%.2f", curso.getPeriodocurso().getValor()));
	}

}
