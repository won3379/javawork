package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// Date 객체
		Date date =new Date();
		System.out.println(date);
		//날짜/시간 포맷 - "yyyy/MM/dd hh:mm:ss a"
	    SimpleDateFormat now =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss a");
		System.out.println(now.format(date));
	
	
		}


		
}
