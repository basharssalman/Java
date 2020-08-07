package SillySentence;

/**
 * Rules:
 * 
 * <sentence> ::= <simple_sentence> [ <conjunction> <sentence> ]
 * <simple_sentence> ::= <noun_phrase> <verb_phrase>
 * <noun_phrase> ::= <proper_noun> | <determiner> [ <adjective> ]. <common_noun>
 * [ who <verb_phrase> ]
 * <verb_phrase> ::= <intransitive_verb> | <transitive_verb> <noun_phrase> | is
 * <adjective> | believes that <simple_sentence>
 * @author Student
 */
public class SillySentence {
	/**
	 *  defining all of the arrays in the class body
	 */
	static final String[] conjunction = { "and", "or", "but", "because" };
	static final String[] properNoun = { "Fred", "Jane", "Richard Nixon", "Miss America" };
	static final String[] commonNoun = { "man", "woman", "fish", "elephant", "unicorn" };
	static final String[] determiner = { "a", "the", "every", "some" };
	static final String[] adjective = { "big", "tiny", "pretty", "bald" };
	static final String[] intransitiveVerb = { "runs", "jumps", "talks", "sleeps" };
	static final String[] transitiveVerb = { "loves", "hates", "sees", "knows", "looks for", "finds" };

	/**
	 * sentence structure
	 */
	static void sentence() {
		int cj = (int) (Math.random() * conjunction.length);
		simpleSentence();
		if (Math.random() > 0.2) {
			System.out.print(conjunction[cj] + " ");
			sentence();
		}
		
	}

	/**
	 * simple sentence structure
	 */
	static void simpleSentence() {
		nounPhrase();
		verbPhrase();
	}

	/**
	 *nounPhrase structure
	 */
	static void nounPhrase() {
		int p = (int) (Math.random() * properNoun.length);
		int com = (int) (Math.random() * commonNoun.length);
		int d = (int) (Math.random() * determiner.length);
		int a = (int) (Math.random() * adjective.length);
		if (Math.random() < 0.9)
			System.out.print(properNoun[p] + " ");
		else if (Math.random() < 0.8) {
			System.out.print(determiner[d] + " ");
			while (Math.random() < 0.5)
				System.out.print(adjective[a] + " ");
			System.out.println(commonNoun[com] + " ");
			if (Math.random() < 0.2) {
				System.out.print("who ");
				verbPhrase();
			}
		}
	}

	/**
	 * verPhrase structure
	 */
	static void verbPhrase() {
		int i = (int) (Math.random() * intransitiveVerb.length);
		int t = (int) (Math.random() * transitiveVerb.length);
		int a = (int) (Math.random() * adjective.length);

		if (Math.random() < 0.9)
			System.out.print(intransitiveVerb[i] + " ");
		else if (Math.random() < 0.5) {
			System.out.print(transitiveVerb[t] + " ");
			nounPhrase();
		} else if (Math.random() < 0.2) {
			System.out.print("is ");
			System.out.print(adjective[a] + " ");
		} else {
			System.out.print("believes that ");
			simpleSentence();
		}
	}

}
