import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class FluentInterfaces {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate
				.now(); //what day?
		System.out.println(date.toString());
		//Today is March 27th 2018.
		date.minusMonths(3);
		System.out.println(date.toString());
		//See that is a pure function so the in parameter never change it's own value

		LocalDate threeMonthsAgo = date.minusMonths(3);
		System.out.println(threeMonthsAgo.toString());

		//Now some date and time
		LocalDateTime myBirthDateAndTime = LocalDate
					.of(1983, 10, 06) //what day?
					.atTime(LocalTime.of(8, 45)); //what time
		System.out.println(myBirthDateAndTime.toString());
		
		//Not related to that but remembet you never should use LocalDate or LocalDateTime
		//as  Model types but you need to convert them to java.sql.Date as bellow
		Date sqlDate = Date.valueOf(date);
		Timestamp sqlTimestemp = Timestamp.valueOf(myBirthDateAndTime);
	}

}
