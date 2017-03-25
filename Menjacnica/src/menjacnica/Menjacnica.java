package menjacnica;

import java.util.GregorianCalendar;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	@Override
	public void dodajKurs(double prodajniKurs, double kupovniKurs, double srednjiKurs, GregorianCalendar datum,
			String naziv, String skraceniNaziv) {

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
