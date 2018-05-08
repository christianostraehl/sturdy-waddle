package pucrs.s2b.exemplo03;

public class Medias {

	public static String calcular(double P1, double P2) {
		double nota = (P1 + P2) / 2.0;
		if (nota >= 7.0) {
			return "Aprovado";
		} else if (nota >= 4.0) {
		 	return "Em Exame";
		} else {
		return "Reprovado";
		}	
	}

}
