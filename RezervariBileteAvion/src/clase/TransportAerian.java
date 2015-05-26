package clase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class TransportAerian {
	ArrayList<Zbor> listaZboruri=new ArrayList<Zbor>();
	
	public void adaugaZboruri(String numeFisier){
		try {
			FileReader fileReader=new FileReader(numeFisier);
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			String s;
			while((s=bufferedReader.readLine())!=null){
				{
					String[] linie=s.split(" ");
					Avion avion=new Avion(linie[0], linie[1], Integer.parseInt(linie[2]));
					Zbor z= new Zbor(avion, linie[3], linie[4], linie[5]);
					listaZboruri.add(z);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public Zbor cautaZbor(String cod){
		for (Zbor zbor : listaZboruri) {
			if(zbor.avion.cod.equals(cod))
				return zbor;
		}
		return null;
	}
}
