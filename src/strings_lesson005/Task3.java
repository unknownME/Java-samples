package strings_lesson005;

public class Task3 {

	private static final String TEXT = "After school, Kamal took the girls to the old house. It was very old and very dirty too. "
			+ "There was rubbish everywhere. The windows were broken and the walls were damp. It was scary. "
			+ "Amy didn’t like it. There were paintings of zombies and skeletons on the walls. "
			+ "We’re going to take photos for the school art competition, said Kamal. "
			+ "Amy didn’t like it but she didn’t say anything. Where’s Grant? asked Tara. "
			+ "Er, he’s buying more paint. Kamal looked away quickly. Tara thought he looked suspicious. "
			+ "It’s getting dark, can we go now? said Amy. She didn’t like zombies."
			+ "medieval English texts would hardly be possible.";

	private static final String REGEXP = "(?<=[a-z])\\.\\s+";

	public static void main(String[] args) {

		String firstPartOfText = TEXT.substring(0, TEXT.length() / 2);
		String[] first = firstPartOfText.split(REGEXP);
		String secondPartOfText = TEXT.substring(TEXT.length() / 2, TEXT.length());
		String[] second = secondPartOfText.split(REGEXP);

		for (String st : first) {
			System.out.println(st);
		}
		System.out.println("----------------------------");
		for (String st : second) {
			System.out.println(st);
		}

	}

}
