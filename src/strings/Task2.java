package strings;

public class Task2 {

	private static final String TEXT = "After school, Kamal took the girls to the old house. It was very old and very dirty too. "
			+ "There was rubbish everywhere. The windows were broken and the walls were damp. It was scary. "
			+ "Amy didn’t like it. There were paintings of zombies and skeletons on the walls. "
			+ "We’re going to take photos for the school art competition, said Kamal. "
			+ "Amy didn’t like it but she didn’t say anything. Where’s Grant? asked Tara. "
			+ "Er, he’s buying more paint. Kamal looked away quickly. Tara thought he looked suspicious. "
			+ "It’s getting dark, can we go now? said Amy. She didn’t like zombies."
			+ "medieval English texts would hardly be possible.";

	public static void main(String[] args) {

		String[] sentences = TEXT.split("(?<=[a-z])\\.\\s+");

		for (String st : sentences) {
			String[] f = st.split(" ");
			String temp = f[0];
			f[0] = f[f.length - 1];
			f[f.length - 1] = temp;
			for (int i = 0; i < (f.length); i++) {
				System.out.print(f[i] + " ");
			}
			System.out.print("\n");
		}
	}

}
