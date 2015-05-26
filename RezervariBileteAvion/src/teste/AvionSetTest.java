package teste;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clase.Avion;

public class AvionSetTest {

	FileReader fileReader;
	BufferedReader bufferedReader;


	@Before
	public void setUp() throws Exception {
		fileReader=new FileReader("avioane.txt");
		bufferedReader=new BufferedReader(fileReader);

	}

	@After
	public void tearDown() throws Exception {
		bufferedReader.close();
		fileReader.close();
	}
	@Test
	public void AvionSetNrLocuritestZero() throws Exception {
		try{
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
				String[] linie=s.split(" ");
				Avion avion=new Avion(linie[0],linie[1],Integer.parseInt(linie[2]));
				avion.setLocuri(0);
				assertEquals(Integer.parseInt(linie[2]),avion.getnrLocuri());
			}
		}catch (Exception e) {
			 
		}
	}

	@Test
	public void AvionSetNrLocuritest() throws Exception {
		try{
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
				String[] linie=s.split(" ");
				Avion avion=new Avion(linie[0],linie[1],Integer.parseInt(linie[2]));
				avion.setLocuri(-1);
				assertEquals(Integer.parseInt(linie[2]),avion.getnrLocuri());
			}
		}catch (Exception e) {
			 
		}
	}
	@Test
	public void AvionSetCodtestNull() throws Exception {
		try{
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
				String[] linie=s.split(" ");
				Avion avion=new Avion(linie[0],linie[1],Integer.parseInt(linie[2]));
				avion.setCod(null);
				assertNotNull(avion.getCod());
			}
		}catch (Exception e) {
			 
		}
	}

	@Test
	public void AvionSetCompanietestNull() throws Exception {
		try{
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
				String[] linie=s.split(" ");
				Avion avion=new Avion(linie[0],linie[1],Integer.parseInt(linie[2]));
				avion.setCompanie(null);
				assertNotNull(avion.getCompanie());
			}
		}catch (Exception e) {
		 
		}
	}
}
