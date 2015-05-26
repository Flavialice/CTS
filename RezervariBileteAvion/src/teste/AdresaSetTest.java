package teste;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase.Adresa;

public class AdresaSetTest {

	FileReader fileReader;
	BufferedReader bufferedReader;

	@Before
	public void setUp() throws Exception {
		fileReader=new FileReader("clienti.txt");
		bufferedReader=new BufferedReader(fileReader);

	}

	@After
	public void tearDown() throws Exception {
		bufferedReader.close();
		fileReader.close();
	}
	
	@Test
	public void AdresaSetOrasNulltest() {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
				String[] linie=s.split(" ");
				Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
				adr.setOras(null);
				assertNotNull(adr.getOras());
			}
		}catch (Exception e) {
				 
		}
	}
	
	@Test
	public void AdresaSetStradaNulltest() {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
				String[] linie=s.split(" ");
				Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
				adr.setStrada(null);
				assertNotNull(adr.getStrada());
			}
		}catch (Exception e) {
				 
		}
	}
	
	@Test
	public void AdresaSetNrNulltest() {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
				String[] linie=s.split(" ");
				Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
				adr.setNr(0);
				assertNotEquals(0, adr.getNr());
			}
		}catch (Exception e) {
				 
		}
	}
	
	@Test
	public void AdresaSetNrNegtest() {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
				String[] linie=s.split(" ");
				Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
				adr.setNr(-1);
				assertNotEquals(-1, adr.getNr());
			}
		}catch (Exception e) {
				 
		}
	}
	
	@Test
	public void AdresaSetNrMaretest() {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
				String[] linie=s.split(" ");
				Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
				adr.setNr(Integer.MAX_VALUE);
				assertNotEquals(Integer.MAX_VALUE, adr.getNr());
			}
		}catch (Exception e) {
				 
		}
	}

}
