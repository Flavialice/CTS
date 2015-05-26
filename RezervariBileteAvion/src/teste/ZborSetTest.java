package teste;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase.Avion;
import clase.Zbor;

public class ZborSetTest {

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
	public void testSetDataNull() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Avion avion=new Avion(linie[0], linie[1], Integer.parseInt(linie[2]));
					Zbor zbor= new Zbor(avion, linie[3], linie[4], linie[5]);
					zbor.setDataPlecare(null);
					assertNotNull(zbor.getDataPlecare());
				}
			}catch (Exception e) {
				 
			}
	}
	
	@Test
	public void testSetAvionNull() throws Exception {
		Avion avion=new Avion("122", "ccc", 4);
		Zbor zbor=new Zbor(avion, "ddd", "ddd", "2014-12-12");
		zbor.setAvion(null);
		assertNotNull(zbor.getAvion());
	}
	
	@Test
	public void testSetOrasPlecareNull() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Avion avion=new Avion(linie[0], linie[1], Integer.parseInt(linie[2]));
					Zbor zbor= new Zbor(avion, linie[3], linie[4], linie[5]);
					zbor.setOrasPlecare(null);
					assertNotNull(zbor.getOrasPlecare());
			}
		}catch (Exception e) {
		}
	}
	
	@Test
	public void testSetOrasDestinatieNull() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Avion avion=new Avion(linie[0], linie[1], Integer.parseInt(linie[2]));
					Zbor zbor= new Zbor(avion, linie[3], linie[4], linie[5]);
					zbor.setOrasDestinatie(null);
					assertNotNull(zbor.getOrasDestinatie());
			}
		}catch (Exception e) {
			 
		}

	}
}
