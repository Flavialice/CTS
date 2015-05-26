package clase;

public class Adresa {
	String oras;
	String strada;
	int nr;
	public Adresa(String _oras, String _strada, int _nr) throws Exception {
		super();
		if(_oras==null)
			throw new Exception("Orasul are valoarea null");
		if(_strada==null)
			throw new Exception("Orasul are valoarea null");
		if(_nr<0)
			throw new Exception("Numarul are valoarea negativa/egala cu 0");
		if(_nr==Integer.MAX_VALUE)
			throw new Exception("Numarul are valoarea prea mare");
		oras = _oras;
		strada = _strada;
		nr = _nr;
	}
	public String getOras() {
		return oras;
	}
	public void setOras(String _oras) {
		if(_oras!=null)
			oras = _oras;
	}
	public String getStrada() {
		return strada;
	}
	public void setStrada(String _strada) {
		if(_strada!=null)
			strada = _strada;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int _nr) {
		if(_nr>0&&_nr<Integer.MAX_VALUE)
			nr = _nr;
	}
	@Override
	public String toString() {
		return "Adresa [oras=" + oras + ", strada=" + strada + ", nr=" + nr
				+ "]";
	}

}
