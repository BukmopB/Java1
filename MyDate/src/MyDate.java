import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.swing.text.DefaultStyledDocument;

public class MyDate {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		System.out.println("Enter your birthday (DD.MM.YYYY) : ");
//		LocalDate birthday = LocalDate.of(1971, 10, 15);
		String string = new Scanner(System.in).nextLine();
		LocalDate birthday = LocalDate.parse(string, dtf);
		LocalDate todayDate = LocalDate.now();
		int result = todayDate.getYear() - birthday.getYear();
		if (birthday.getDayOfYear() > todayDate.getDayOfYear()) {
			result--;
		}

		System.out.println(result);

	}

}
