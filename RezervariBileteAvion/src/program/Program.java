package program;


import clase.Procesare;

public class Program {

	public static void main(String[] args) {
		Procesare procesare=new Procesare();
		procesare.incarcaZboruri("zboruri.txt");
		procesare.executaRezervare();
	}

}
