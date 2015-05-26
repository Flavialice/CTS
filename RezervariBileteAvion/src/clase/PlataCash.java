package clase;

import java.text.DecimalFormat;

import interfete.IPlata;

public class PlataCash implements IPlata {

	double suma;
	@Override
	public void plateste(double suma) throws Exception {
		if(suma>5000)
			throw new Exception("Valoare prea mare");
		if(suma<1)
			throw new Exception("Valoare negativa");
		this.suma=suma;
		System.out.println("Suma "+suma+" a fost achitata cash");
	}
	
	public double getSuma(){
		return suma;
	}

}
