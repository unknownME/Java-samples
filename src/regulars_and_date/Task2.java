package regulars_and_date;

public class Task2 {

	private static final String TEXT = "After school, Kamal took the girls to the old house. It was very old and very dirty too. "
			+ "There was rubbish everywhere. The windows were broken and the walls were damp. It was scary. "
			+ "Amy didn’t like it. There were paintings of zombies and skeletons on the walls. "
			+ "We’re going to take photos for the school art competition, said Kamal. "
			+ "Amy didn’t like it but she didn’t say anything. Where’s Grant? asked Tara. "
			+ "Er, he’s buying more paint. Kamal looked away quickly. Tara thought he looked suspicious. "
			+ "It’s getting dark, can we go now? said Amy. She didn’t like zombies."
			+ "medieval English texts would hardly be possible.";

	private static final String REGEX = "(?<!\\S)(?:At|On|It|About|Below|Above|After|Before|By|For|From|Of|Since|To|With|it|on|of)(?!\\S[.])";

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();

		try {
			sb.append(TEXT.replaceAll(REGEX, "Java"));
		} finally {
			System.out.println(sb);
			sb = null;
		}

	}

}
