package teste;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase.Adresa;

public class AdresaTest {

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
	public void AdresaNulltest() {
		Adresa adr=null;
		assertNull(adr);
	}
	
	@Test
	public void AdresaCtrOrasNulltest() {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
				String[] linie=s.split(" ");
				Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
				assertNotNull(adr.getOras());
			}
		}catch (Exception e) {
				 
		}
	}
	
	@Test
	public void AdresaCtrStradaNulltest() {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
				String[] linie=s.split(" ");
				Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
				assertNotNull(adr.getStrada());
			}
		}catch (Exception e) {
				 
		}
	}
	
	@Test
	public void AdresaCtrNrNulltest() {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
				String[] linie=s.split(" ");
				Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
				assertNotEquals(0, adr.getNr());
			}
		}catch (Exception e) {
				 
		}
	}
	
	@Test
	public void AdresaCtrNrNegtest() {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
				String[] linie=s.split(" ");
				Adresa adr=new Adresa(linie[0], linie[1], -1);
				assertNotEquals(-1, adr.getNr());
			}
		}catch (Exception e) {
				 
		}
	}
	
	@Test
	public void AdresaCtrNrMaretest() {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
				String[] linie=s.split(" ");
				Adresa adr=new Adresa(linie[0], linie[1], Integer.MAX_VALUE);
				assertNotEquals(Integer.MAX_VALUE, adr.getNr());
			}
		}catch (Exception e) {
				 
		}
	}
}
