
public class GastosTrimestrais {

	public static void main(String[] args) {
		
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		int gastoTrimestral = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println("Gastos Trimestrais R$ " + gastoTrimestral);
		int mediaMes = gastoTrimestral/3;
		System.out.println("Media Mensal R$ " + mediaMes);
	}

}
