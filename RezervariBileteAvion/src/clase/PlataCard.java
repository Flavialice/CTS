package clase;

import java.text.DecimalFormat;

import interfete.IPlata;

public class PlataCard implements IPlata {

	double suma;
	
	@Override
	public void plateste(double _suma) throws Exception {
		if(suma>5000)
			throw new Exception("Valoare prea mare");
		if(suma<1)
			throw new Exception("Valoare negativa");
		suma=_suma;
		System.out.println("Suma "+suma+" a fost extrasa de pe card");
		
	}
	public double getSuma(){
		return suma;
	}

}
