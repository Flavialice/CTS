package teste;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import interfete.IPlata;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase.Avion;
import clase.PlataCard;
import clase.PlataCash;
import clase.PlataOnline;

public class PlataTest {

	FileReader fileReader;
	BufferedReader bufferedReader;

	@Before
	public void setUp() throws Exception {
		fileReader=new FileReader("plati.txt");
		bufferedReader=new BufferedReader(fileReader);

	}

	@After
	public void tearDown() throws Exception {
		bufferedReader.close();
		fileReader.close();
	}
	
	@Test
	public void PlataCashZerotest() {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
				PlataCash cash=new PlataCash();
				cash.plateste(Double.parseDouble(s));
				assertNotEquals(0,Double.parseDouble(s));	
			}
		}catch (Exception e) {
			 
		}
	}
	
	@Test
	public void PlataCashVerificareZecimaletest() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
				PlataCash cash=new PlataCash();
				double valoare=Double.parseDouble(s);
				cash.plateste(valoare);
				assertEquals(valoare,cash.getSuma(),1);	
			}
		}catch (Exception e) {
			 
		}
	}
	
	@Test
	public void PlataCashValoareNegativatest() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
				PlataCash cash=new PlataCash();
				double valoare=Double.parseDouble(s);
				cash.plateste(valoare);
					assertTrue(0<cash.getSuma());	
			}
		}catch (Exception e) {
			 
		}
	}
	@Test
	public void PlataCashValoareMaretest() throws Exception {
		try{
		PlataCash cash=new PlataCash();
		cash.plateste(Double.MAX_VALUE);
		assertTrue(Double.MAX_VALUE!=cash.getSuma());	
		}catch(Exception e){}
	}

	@Test
	public void PlataCardZerotest() {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
				PlataCard cash=new PlataCard();
				cash.plateste(Double.parseDouble(s));
				assertNotEquals(0,Double.parseDouble(s));	
			}
		}catch (Exception e) {
			 
		}
	}
	
	@Test
	public void PlataCardVerificareZecimaletest() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
				PlataCard cash=new PlataCard();
				double valoare=Double.parseDouble(s);
				cash.plateste(valoare);
				assertEquals(valoare,cash.getSuma(),1);	
			}
		}catch (Exception e) {
			 
		}
	}
	
	@Test
	public void PlataCardValoareNegativatest() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
				PlataCard cash=new PlataCard();
				double valoare=Double.parseDouble(s);
				cash.plateste(valoare);
					assertTrue(0<cash.getSuma());	
			}
		}catch (Exception e) {
			 
		}
	}
	@Test
	public void PlataCardValoareMaretest() throws Exception {
		try{
		PlataCard cash=new PlataCard();
		cash.plateste(Double.MAX_VALUE);
		assertTrue(Double.MAX_VALUE!=cash.getSuma());	}
		catch(Exception e){
			
		}
	}

	@Test
	public void PlataZerotest() {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
				PlataOnline cash=new PlataOnline();
				cash.plateste(Double.parseDouble(s));
				assertNotEquals(0,Double.parseDouble(s));	
			}
		}catch (Exception e) {
			 
		}
	}
	
	@Test
	public void PlataVerificareZecimaletest() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
				PlataOnline cash=new PlataOnline();
				double valoare=Double.parseDouble(s);
				cash.plateste(valoare);
				assertTrue(valoare==cash.getSuma());	
			}
		}catch (Exception e) {
			 
		}
	}
	
	@Test
	public void PlataValoareNegativatest() throws Exception {
		try {
			String s = null;
			while((s=bufferedReader.readLine())!=null&&s.length()!=0){
				PlataOnline cash=new PlataOnline();
				double valoare=Double.parseDouble(s);
				cash.plateste(valoare);
					assertTrue(0<cash.getSuma());	
			}
		}catch (Exception e) {
			 
		}
	}
	@Test
	public void PlataValoareMaretest() throws Exception {
		try{
			PlataOnline cash=new PlataOnline();
		cash.plateste(Double.MAX_VALUE);
		assertTrue(Double.MAX_VALUE!=cash.getSuma());	
	}catch(Exception e ){}
		}
		
	
	@Test
	public void PlataValoareOKtest() throws Exception {
		PlataOnline cash=new PlataOnline();
		double x=12.44;
		cash.plateste(x);
		assertTrue(x==cash.getSuma());	
	}

}
