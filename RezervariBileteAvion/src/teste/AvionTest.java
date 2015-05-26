package teste;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clase.Avion;

public class AvionTest {
	
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
	public void ConstructorNull() {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Avion avion = new Avion(linie[0],linie[1],Integer.parseInt(linie[2]));
					assertNotNull(avion);	
			}
		}catch (Exception e) {
			 
		}
	}
	
	@Test
	public void ConstructorNrLocuriNegativ(){
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){

					String[] linie=s.split(" ");
					Avion avion = new Avion(linie[0],linie[1],Integer.parseInt(linie[2]));
					assertEquals(avion.getnrLocuri(),Integer.parseInt(linie[2]));
			}
		}catch (Exception e) {
			 
		}
	}
	
	@Test
	public void ConstructorNrLocuriMAX(){
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){

					String[] linie=s.split(" ");
					Avion avion = new Avion(linie[0],linie[1],Integer.parseInt(linie[2]));
					assertNotEquals(avion.getnrLocuri(),Integer.MAX_VALUE);
			}
		}catch (Exception e) {
			 
		}
	}

}
