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

public class ClientTest {

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
	public void testCtrNull() throws Exception {
		Client client=new Client();
		assertNotNull(client);
	}
	
	@Test
	public void testCtrAdresaNull() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Adresa adr=null;
					Client client=new Client(linie[3], linie[4],linie[5], adr, linie[6], linie[7]);
					assertNotNull(client.getAdresa());
				}
		}catch (Exception e) {
			 
		}
	}
	
	@Test
	public void testCtrNumeNull() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
					Client client=new Client(null, linie[4],linie[5], adr, linie[6], linie[7]);
					assertNotNull(client.getNume());
				}
		}catch (Exception e) {
			 
		}
	}
	
	@Test
	public void testCtrPrenumeNull() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
					Client client=new Client(linie[3], null,linie[5], adr, linie[6], linie[7]);
					assertNotNull(client.getPrenume());
				}
		}catch (Exception e) {
			 
		}
	}
	
	@Test
	public void testCtrCnpNull() throws Exception  {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
					Client client=new Client(linie[3], linie[4],null, adr, linie[6], linie[7]);
					assertNotNull(client.getCnp());
				}
		}catch (Exception e) {
			 
		}
	}
    @Test
	public void testCtrEmailNull() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
					Client client=new Client(linie[3], linie[4],linie[5], adr, null, linie[7]);
					assertNotNull(client.getEmail());
				}
		}catch (Exception e) {
			 
		}
	}	
	@Test
	public void testCtrTelefonNull() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
					Client client=new Client(linie[3], linie[4],linie[5], adr, linie[6], null);
					assertNotNull(client.getNrTelefon());
				}
		}catch (Exception e) {
			 
		}
	}

	 @Test
	public void testCtrEmailValidare() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
					Client client=new Client(linie[3], linie[4],linie[5], adr, linie[6], linie[7]);
					assertEquals(linie[6],client.getEmail());
				}
		}catch (Exception e) {
			 
		}
	}
		
	@Test
	public void testCtrNrTelefonLungime() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
					Client client=new Client(linie[3], linie[4],linie[5], adr, linie[6], linie[7]);
					System.out.println(client.getNrTelefon().length());
					assertEquals(10,client.getNrTelefon().length());
				}
		}catch (Exception e) {
			 
		}
	}	
	@Test
	public void testCtrNumeValid() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
					Client client=new Client(linie[3], linie[4],linie[5], adr, linie[6], linie[7]);
					assertFalse(client.StringFaraCifreValidare(client.getNume()));
				}
		}catch (Exception e) {
			 
		}
	}	
	@Test
	public void testCtrPrenumeValid() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
					Client client=new Client(linie[3], linie[4],linie[5], adr, linie[6], linie[7]);
					assertFalse(client.StringFaraCifreValidare(client.getPrenume()));
				}
		}catch (Exception e) {
			 
		}
	}	
	
	@Test
	public void testCtrTelefonValidare() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
					Client client=new Client(linie[3], linie[4],linie[5], adr, linie[6], linie[7]);
					assertTrue(client.TelefonValidare(client.getNrTelefon()));
				}
		}catch (Exception e) {
			 
		}
	}	
	/*@Test
	public void testCtrCnpNull() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
					Client client=new Client(linie[3], linie[4],linie[5], adr, linie[6], linie[7]);
					assertNotNull(client.getAdresa());
				}
		}catch (Exception e) {
			 
		}
	}	@Test
	public void testCtrCnpNull() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
					String[] linie=s.split(" ");
					Adresa adr=new Adresa(linie[0], linie[1], Integer.parseInt(linie[2]));
					Client client=new Client(linie[3], linie[4],linie[5], adr, linie[6], linie[7]);
					assertNotNull(client.getAdresa());
				}
		}catch (Exception e) {
			 
		}
	}
*/
}
