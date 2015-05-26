package teste;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase.Avion;
import clase.Zbor;

public class ZborTest {

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
	public void testCtrNull() throws Exception {
		Zbor zbor=null;
		assertNull(zbor);
	}
	
	@Test
	public void testCtrDataNull() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Avion avion=new Avion(linie[0], linie[1], Integer.parseInt(linie[2]));
					Zbor z= new Zbor(avion, linie[3], linie[4], null);
					assertNotNull(z.getDataPlecare());}
		}catch (Exception e) {
			 
		}
	}
	
	@Test
	public void testCtrAvionNull() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Avion avion=null;
					Zbor z= new Zbor(avion, linie[3], linie[4], linie[5]);
					assertNotNull(z.getAvion());
			}
			}catch (Exception e) {
				 
			}
	}
	
	@Test
	public void testCtrOrasPlecareNull() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Avion avion=new Avion(linie[0], linie[1], Integer.parseInt(linie[2]));
					Zbor z= new Zbor(avion, null, linie[4], linie[5]);
					assertNotNull(z.getOrasPlecare());}
		}catch (Exception e) {
			 
		}
	}
	
	@Test
	public void testCtrOrasDestinatieNull() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Avion avion=new Avion(linie[0], linie[1], Integer.parseInt(linie[2]));
					Zbor z= new Zbor(avion, linie[3], null, linie[5]);
					assertNotNull(z.getOrasDestinatie());
			}
		}catch (Exception e) {
				 
		}
	}
}
