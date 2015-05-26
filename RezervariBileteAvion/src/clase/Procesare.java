package clase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Procesare {
	TransportAerian transpAerian=new TransportAerian();
	Rezervare rezervare=new Rezervare();
	
	public void incarcaZboruri(String numeFisier){
		transpAerian.adaugaZboruri(numeFisier);
	}
	
	public void executaRezervare(){
		System.out.println("Introduceti datele zborului cautat:");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String codAvion=null;
		try {
			codAvion=buffer.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(transpAerian.cautaZbor(codAvion));
		rezervare.proceduraRezervare();
	}
	
}
