package clase;

import java.text.SimpleDateFormat;

public class Zbor {
	Avion avion;
	String orasPlecare;
	String orasDestinatie;
	String dataPlecare;
	public Zbor(Avion _avion, String _orasPlecare, String _orasDestinatie,
			String _dataPlecare) throws Exception {
		super();
		if(_avion==null)
			throw new Exception("Avion este null");
		if(_orasPlecare==null)
			throw new Exception("Oras plecare este null");
		if(_orasDestinatie==null)
			throw new Exception("Oras destinatie este null");
		if(_dataPlecare==null)
			throw new Exception("Data este null");
		//if(new SimpleDateFormat("yyyy-MM-dd").parse(dataPlecare)==null)
			//throw new Exception("Data este incorecta");	

		avion = _avion;
		orasPlecare = _orasPlecare;
		orasDestinatie = _orasDestinatie;
		dataPlecare = _dataPlecare;
	}
	public Avion getAvion() {
		return avion;
	}
	public void setAvion(Avion _avion) {
		if(_avion!=null)
			avion = _avion;
	}
	public String getOrasPlecare() {
		return orasPlecare;
	}
	public void setOrasPlecare(String _orasPlecare) {
		if(_orasPlecare!=null)
			orasPlecare = _orasPlecare;
	}
	public String getOrasDestinatie() {
		return orasDestinatie;
	}
	public void setOrasDestinatie(String _orasDestinatie) {
		if(_orasDestinatie!=null)
			orasDestinatie = _orasDestinatie;
	}
	public String getDataPlecare() {
		return dataPlecare;
	}
	public void setDataPlecare(String _dataPlecare) {
		if(_dataPlecare!=null)
			dataPlecare = _dataPlecare;
	}
	@Override
	public String toString() {
		return "Zbor [avion=" + avion + ", orasPlecare=" + orasPlecare
				+ ", orasDestinatie=" + orasDestinatie + ", dataPlecate="
				+ dataPlecare + "]";
	}
	
	
}
