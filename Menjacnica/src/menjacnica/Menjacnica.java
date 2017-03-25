package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	private LinkedList<Valuta> kursevi = new LinkedList<Valuta>();
	
	@Override
	public void dodajKurs(double prodajniKurs, double kupovniKurs, double srednjiKurs, GregorianCalendar datum,
			String naziv, String skraceniNaziv) {

		if(prodajniKurs == 0 || kupovniKurs == 0 || srednjiKurs == 0 || datum == null || naziv == null || skraceniNaziv == null){
			System.out.println("Uneli ste neki parametar pogresno");
			return;
		}
		
		Valuta valuta = new Valuta(naziv, skraceniNaziv, datum, prodajniKurs, kupovniKurs, srednjiKurs);
		
		if(!kursevi.contains(valuta)){
			kursevi.add(valuta);
			return;
		}
	}

	@Override
	public boolean izbrisiKurs(GregorianCalendar datum, String naziv) {
		return false;
	}

	@Override
	public Valuta vratiKursZaOdredjeniDan(GregorianCalendar datum, String naziv) {
		return null;
	}

}
