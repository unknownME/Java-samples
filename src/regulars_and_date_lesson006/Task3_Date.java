package regulars_and_date_lesson006;

import java.time.LocalDateTime;

public class Task3_Date {

	private static final LocalDateTime DATEOFBIRTH = LocalDateTime.of(1990, 2, 1, 5, 30);

	public static void main(String[] args) {

		dateComparator(DATEOFBIRTH);

	}

	private static final void dateComparator(LocalDateTime dateOfBirth) {
		LocalDateTime currentDateTime = LocalDateTime.now();

		System.out.println("Вам и�?полнило�?ь " + (currentDateTime.getYear() - dateOfBirth.getYear()) + " лет, "
				+ (currentDateTime.getMonthValue() - dateOfBirth.getMonthValue() + " ме�?�?цев, "
						+ (currentDateTime.getDayOfYear() - dateOfBirth.getDayOfYear()) + " дней, "
						+ (currentDateTime.getHour() - dateOfBirth.getHour()) + " ча�?ов, "
						+ (dateOfBirth.getMinute() - currentDateTime.getMinute()) + " минут и "
						+ (currentDateTime.getSecond() - dateOfBirth.getSecond()) + " �?екунд(ы)"));

	}

}
