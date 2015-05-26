package clase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rezervare extends ARezervare{

	@Override
	public void selecteazaZbor() {
		System.out.println("Selectati zborul");
		
	}

	@Override
	public void inregistrarePasager() {
		System.out.println("Inregistrare pasager");
		Client c = new Client();
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		try {
			s=buffer.readLine();
			c.nume=s;
			pasageri.add(c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void selecteazaLoc() {
		System.out.println("Selectati locul");
		int nrLoc;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		try {
			s=buffer.readLine();
			nrLoc=Integer.parseInt(s);
			//if()
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void alegeTipPlata() {
		System.out.println("Alege tip plata");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		try {
			s=buffer.readLine();
			if(s.equals("cash"))
				modalitatePlata=new PlataCash();
			if(s.equals("card"))
					modalitatePlata=new PlataCard();
			if(s.equals("online"))modalitatePlata=new PlataOnline();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void confirma() {
		System.out.println("Confirmati");
		System.out.println(pasageri.get(0).toString());
		System.out.println(modalitatePlata.getClass().getName());
		
	}

}
