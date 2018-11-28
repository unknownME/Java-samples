package regulars_and_date;

import java.time.LocalDateTime;

public class Task3_Date {

	private static final LocalDateTime DATEOFBIRTH = LocalDateTime.of(1990, 2, 1, 5, 30);

	public static void main(String[] args) {

		dateComparator(DATEOFBIRTH);

	}

	private static final void dateComparator(LocalDateTime dateOfBirth) {
		LocalDateTime currentDateTime = LocalDateTime.now();

		System.out.println("Вам исполнилось " + (currentDateTime.getYear() - dateOfBirth.getYear()) + " лет, "
				+ (currentDateTime.getMonthValue() - dateOfBirth.getMonthValue() + " месяцев, "
						+ (currentDateTime.getDayOfYear() - dateOfBirth.getDayOfYear()) + " дней, "
						+ (currentDateTime.getHour() - dateOfBirth.getHour()) + " часов, "
						+ (dateOfBirth.getMinute() - currentDateTime.getMinute()) + " минут и "
						+ (currentDateTime.getSecond() - dateOfBirth.getSecond()) + " секунд(ы)"));

	}

}
