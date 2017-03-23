package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Valuta;

public interface MenjacnicaInterfejs {

	public void dodajKurs(double prodajniKurs,double kupovniKurs,double srednjiKurs,GregorianCalendar datum,String naziv,String skraceniNaziv);
	
	public boolean izbrisiKurs(GregorianCalendar datum,String naziv);
	
	public Valuta vratiKursZaOdredjeniDan(GregorianCalendar datum,String naziv);
}
