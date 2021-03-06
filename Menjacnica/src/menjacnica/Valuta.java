package menjacnica;

import java.util.GregorianCalendar;

import utility.Utility;

public class Valuta {

	private String naziv;
	private String skraceniNaziv;
	private GregorianCalendar datum;
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;
	
	public Valuta() {
		super();
	}

	public Valuta(String naziv, String skraceniNaziv, GregorianCalendar datum, double prodajniKurs, double kupovniKurs,
			double srednjiKurs) {
		super();
		this.naziv = naziv;
		this.skraceniNaziv = skraceniNaziv;
		this.datum = datum;
		this.prodajniKurs = prodajniKurs;
		this.kupovniKurs = kupovniKurs;
		this.srednjiKurs = srednjiKurs;
	}

	@Override
	public String toString() {
		return "Naziv valute: "+naziv+"\nSkraceni naziv: "+skraceniNaziv+"\nDatum: "+datum.getTime()+"\nProdajni kurs: "+prodajniKurs+
				"\nKupovni kurs: "+kupovniKurs+"\nSrednji kurs: "+srednjiKurs;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Valuta)) {
			return false;
		}
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null) {
				return false;
			}
		} else if (!Utility.jeIstiDan(datum, other.getDatum())) {
			return false;
		}
		if (naziv == null) {
			if (other.naziv != null) {
				return false;
			}
		} else if (!naziv.equals(other.naziv)) {
			return false;
		}
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null) {
				return false;
			}
		} else if (!skraceniNaziv.equals(other.skraceniNaziv)) {
			return false;
		}
		return true;
	}

	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String naziv) {
		if(naziv != null){
			this.naziv = naziv;
		}
		else{
			throw new RuntimeException("Morate uneti naziv valute.");
		}
	}
	
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	
	public void setSkraceniNaziv(String skraceniNaziv) {
		if (skraceniNaziv != null && skraceniNaziv.length() >=2 && skraceniNaziv.length() <=4) {
			this.skraceniNaziv = skraceniNaziv;
		}
		else{
			throw new RuntimeException("Uneli ste pogresnu vrednost za  skraceni naziv valute");
		}
	}
	
	public GregorianCalendar getDatum() {
		return datum;
	}
	
	public void setDatum(GregorianCalendar datum) {
		if(datum != null){
			this.datum = datum;
		}
		else{
			throw new RuntimeException("Morate uneti datum valute.");
		}
	}
	
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	
	public void setProdajniKurs(double prodajniKurs) {
		if(prodajniKurs != 0){
			this.prodajniKurs = prodajniKurs;
		}
		else{
			throw new RuntimeException("Kurs ne sme biti nula.");
		}
	}
	
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	
	public void setKupovniKurs(double kupovniKurs) {
		if(kupovniKurs != 0){
			this.kupovniKurs = kupovniKurs;
		}
		else{
			throw new RuntimeException("Kurs ne sme biti nula.");
		}
	}
	
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	
	public void setSrednjiKurs(double srednjiKurs) {
		if(srednjiKurs != 0){
			this.srednjiKurs = srednjiKurs;
		}
		else{
			throw new RuntimeException("Kurs ne sme biti nula.");
		}
	}

	
}
