package clase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {
	String nume;
	String prenume;
	String cnp;
	Adresa adresa;
	String email;
	String nrTelefon;
	public Client(String nume, String prenume, String cnp, Adresa adresa, String email,
			String nrTelefon) throws Exception {
		super();
		if(nume==null)
			throw new Exception("Numele este null");
		if(!StringFaraCifreValidare(nume))
			throw new Exception("Numele este null");
		if(prenume==null)
			throw new Exception("Premumele este null");
		if(cnp==null)
			throw new Exception("CNP-ul este null");
		if(adresa==null)
			throw new Exception("Adresa are valoarea null");
		if(email==null)
			throw new Exception("Emailul este null");
		if(!EmailValidare(email))
			throw new Exception("Emailul este invalid");
		if(nrTelefon==null)
			throw new Exception("Nr telefon este null");
		if(nrTelefon.length()!=10)
			throw new Exception("Nr telefon este incorect");
		this.nume = nume;
		this.prenume=prenume;
		this.cnp = cnp;
		this.adresa = adresa;
		this.email = email;
		this.nrTelefon = nrTelefon;
	}
	public Client() {
		// TODO Auto-generated constructor stub
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		if(nume!=null)
			this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		if(prenume!=null)
		this.prenume = prenume;
	}
	public String getCnp() {
		return cnp;
	}
	public void setCnp(String cnp) {
		if(cnp!=null)
		this.cnp = cnp;
	}
	public Adresa getAdresa() {
		return adresa;
	}
	public void setAdresa(Adresa adresa) {
		if(adresa!=null)
			this.adresa = adresa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(EmailValidare(email))
			this.email = email;
	}
	public String getNrTelefon() {
		return nrTelefon;
	}
	public void setNrTelefon(String nrTelefon) {
		if(nrTelefon!=null&&nrTelefon.length()==10)
			this.nrTelefon = nrTelefon;
	}
	@Override
	public String toString() {
		return "Client [nume=" + nume + ", prenume=" + prenume + ", cnp=" + cnp + ", adresa=" + adresa
				+ ", email=" + email + ", nrTelefon=" + nrTelefon + "]";
	}
	
	public boolean EmailValidare(String str)
	{
		String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        Pattern p = Pattern.compile(ePattern);
        Matcher m = p.matcher(str);
        return m.find();
	}
	
	public boolean StringFaraCifreValidare(String str){
	      String pattern = "\\d";
	      Pattern r = Pattern.compile(pattern);
	      Matcher m = r.matcher(str);
	      return m.find();
	}
	
	public boolean TelefonValidare(String str){
	      String pattern = "^\\d+$";
	      Pattern r = Pattern.compile(pattern);
	      Matcher m = r.matcher(str);
	      return m.find();
	}
	
}
