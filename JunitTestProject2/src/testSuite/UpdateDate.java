package testSuite;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.annotations.Test;

public class UpdateDate {
	@Test
	public void testUpdateDate()
	{
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY:MM:DD");
        System.out.println( sdf.format(cal.getTime()) );
	}
}
