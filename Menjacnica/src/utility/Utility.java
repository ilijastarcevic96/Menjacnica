package utility;

import java.util.GregorianCalendar;

public class Utility {

	public static boolean jeIstiDan(GregorianCalendar dat1,GregorianCalendar dat2){
		if(dat1.get(GregorianCalendar.DAY_OF_MONTH) == dat2.get(GregorianCalendar.DAY_OF_MONTH) &&
				dat1.get(GregorianCalendar.MONTH) == dat2.get(GregorianCalendar.MONTH) &&
				dat1.get(GregorianCalendar.YEAR) == dat2.get(GregorianCalendar.YEAR)){
			return true;
		}
		return false;
	}
}
