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
			throw new RuntimeException("Neki od parametara ste uneli pogresno");
		}
		
		Valuta valuta = new Valuta(naziv, skraceniNaziv, datum, prodajniKurs, kupovniKurs, srednjiKurs);
		
		if(!kursevi.contains(valuta)){
			kursevi.add(valuta);
			return;
		}
	}

	@Override
	public boolean izbrisiKurs(GregorianCalendar datum, String naziv) {
		
		for (int i = 0; i < kursevi.size(); i++) {
			Valuta v = kursevi.get(i);
			if(jeIstiDan(v.getDatum(),datum) && v.getNaziv().equals(naziv)){
				kursevi.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public Valuta vratiKursZaOdredjeniDan(GregorianCalendar datum, String naziv) {
		for (int i = 0; i < kursevi.size(); i++) {
			if(jeIstiDan(kursevi.get(i).getDatum(),datum) && kursevi.get(i).getNaziv().equals(naziv)){
				return kursevi.get(i);
			}
		}
		throw new RuntimeException("Ne postoji kurs unete valute za uneti datum.");
	}

	private boolean jeIstiDan(GregorianCalendar dat1,GregorianCalendar dat2){
		if(dat1.get(GregorianCalendar.DAY_OF_MONTH) == dat2.get(GregorianCalendar.DAY_OF_MONTH) &&
				dat1.get(GregorianCalendar.MONTH) == dat2.get(GregorianCalendar.MONTH) &&
				dat1.get(GregorianCalendar.YEAR) == dat2.get(GregorianCalendar.YEAR)){
			return true;
		}
		return false;
	}
}