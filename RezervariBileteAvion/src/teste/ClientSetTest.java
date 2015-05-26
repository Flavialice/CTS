package teste;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase.Adresa;
import clase.Client;

public class ClientSetTest {

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
	public void testSetAdresaNull() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
					Client client=new Client(linie[3], linie[4],linie[5], adr, linie[6], linie[7]);
					client.setAdresa(null);
					assertNotNull(client.getAdresa());
				}
		}catch (Exception e) {
			 
		}
	}
	
	@Test
	public void testSetNumeNull() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
					Client client=new Client(linie[3], linie[4],linie[5], adr, linie[6], linie[7]);
					client.setNume(null);
					assertNotNull(client.getNume());
				}
		}catch (Exception e) {
			 
		}
	}
	
	@Test
	public void testSetPrenumeNull() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
					Client client=new Client(linie[3], linie[4],linie[5], adr, linie[6], linie[7]);
					client.setPrenume(null);
					assertNotNull(client.getPrenume());
				}
		}catch (Exception e) {
			 
		}
	}
	
	@Test
	public void testSetCnpNull() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
					Client client=new Client(linie[3], linie[4],linie[5], adr, linie[6], linie[7]);
					client.setCnp(null);
					assertNotNull(client.getCnp());
				}
		}catch (Exception e) {
			 
		}
	}
    @Test
	public void testSetEmailNull() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
					Client client=new Client(linie[3], linie[4],linie[5], adr, linie[6], linie[7]);
					client.setEmail(null);
					assertNotNull(client.getEmail());
				}
		}catch (Exception e) {
			 
		}
	}	
	@Test
	public void testSetTelefonNull() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
					Client client=new Client(linie[3], linie[4],linie[5], adr, linie[6], linie[7]);
					client.setNrTelefon(null);
					assertNotNull(client.getNrTelefon());
				}
		}catch (Exception e) {
			 
		}
	}
	
	@Test
	public void testSetEmailValid() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
					Client client=new Client(linie[3], linie[4],linie[5], adr, linie[6], linie[7]);
					client.setEmail("me@.com.");
					assertEquals(linie[6],client.getEmail());
				}
		}catch (Exception e) {
			 
		}
	}	

	@Test
	public void testSetNrTelefonLungime() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
					Client client=new Client(linie[3], linie[4],linie[5], adr, linie[6], linie[7]);
					client.setNrTelefon("34344");
					assertEquals(10,client.getNrTelefon().length());
				}
		}catch (Exception e) {
			 
		}
	}	
}
