package clase;

public class Avion {
	String cod;
	String companie;
	Integer nrLocuri;
	
	public Avion(String _cod, String _companie, Integer _nrLocuri) throws Exception{
		super();
		if(_cod==null)
			throw new Exception("Codul avionului este null");
		if(_companie==null)
			throw new Exception("Compania are valoare null");
		if(_nrLocuri==0)
			throw new Exception("Compania are valoare negativa/ egala cu 0");
		if(_nrLocuri==null)
			throw new Exception("Compania are valoare null");
		if(_nrLocuri>100)
			throw new Exception("Compania are valoare prea mare");
		
		cod = _cod;
		companie = _companie;
		nrLocuri = _nrLocuri;
		
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String _cod) {
		if(_cod!=null)
			cod = _cod;
	}
	public String getCompanie() {
		return companie;
	}
	public void setCompanie(String _companie) {
		if(_companie!=null)
			companie = _companie;
	}
	public int getnrLocuri() {
		return nrLocuri;
	}
	public void setLocuri(int _nrLocuri) {
		if(_nrLocuri>0)
			nrLocuri = _nrLocuri;
	}
	@Override
	public String toString() {
		return "Avion [cod=" + cod + ", companie=" + companie + ", locuri="
				+ nrLocuri + "]";
	}
	
	
}
