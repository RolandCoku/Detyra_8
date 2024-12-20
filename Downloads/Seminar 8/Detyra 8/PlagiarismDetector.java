

import java.io.File;
import java.util.*;

/*
 * Improve the efficiency of the code below according to the guidelines in the assignment description.
 * Please be sure not to change the signature of the detectPlagiarism method!
 * However, you may modify the signatures of any of the other methods as needed.
 */

public class PlagiarismDetector {

	public static Map<String, Integer> detectPlagiarism(String dirName, int windowSize, int threshold) {
		File dirFile = new File(dirName);
		String[] files = dirFile.list();

		if (files == null) {
			System.out.println("The directory is empty.");
			return null;
		}

		Map<String, Set<String>> phrases = new HashMap<>();

		for (int i = 0; i < files.length; i++) {
			String file = files[i];
			Set<String> filePhrases = createPhrases(dirName + "/" + file, windowSize);
			if (filePhrases == null) {
				return null;
			}
			phrases.put(file, filePhrases);
		}

		Map<String, Integer> numberOfMatches = new HashMap<String, Integer>();

		for (int i = 0; i < files.length; i++) {
			String file1 = files[i];

			for (int j = 0; j < files.length; j++) {
				String file2 = files[j];

				if (file1.equals(file2)) {
					continue;
				}

				Set<String> file1Phrases = phrases.get(file1);
				Set<String> file2Phrases = phrases.get(file2);

				if (file1Phrases == null || file2Phrases == null)
					return null;

				Set<String> matches = findMatches(file1Phrases, file2Phrases);

				if (matches == null)
					return null;

				if (matches.size() > threshold) {
					String key = file1 + "-" + file2;
					if (numberOfMatches.containsKey(file2 + "-" + file1) == false && file1.equals(file2) == false) {
						numberOfMatches.put(key,matches.size());
					}
				}
			}

		}

		return sortResults(numberOfMatches);
	}


	/*
	 * This method reads the given file and then converts it into a Collection of Strings.
	 * It does not include punctuation and converts all words in the file to uppercase.
	 */
	protected static List<String> readFile(String filename) {
		if (filename == null) return null;

		List<String> words = new LinkedList<String>();

		try {
			Scanner in = new Scanner(new File(filename));
			while (in.hasNext()) {
				words.add(in.next().replaceAll("[^a-zA-Z]", "").toUpperCase());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return words;
	}


	/*
	 * This method reads a file and converts it into a Set/List of distinct phrases,
	 * each of size "window". The Strings in each phrase are whitespace-separated.
	 */
	protected static Set<String> createPhrases(String filename, int window) {
		if (filename == null || window < 1) return null;

		List<String> words = readFile(filename);

		Set<String> phrases = new HashSet<String>();

		if (words == null) return null;

		for (int i = 0; i < words.size() - window + 1; i++) {

			StringBuilder phrase = new StringBuilder();

			for (int j = 0; j < window; j++) {
				phrase.append(words.get(i + j));
				phrase.append(" ");
			}

			phrases.add(phrase.toString());
		}

		return phrases;
	}




	/*
	 * Returns a Set of Strings that occur in both of the Set parameters.
	 * However, the comparison is case-insensitive.
	 */
	protected static Set<String> findMatches(Set<String> myPhrases, Set<String> yourPhrases) {
		if (myPhrases == null || yourPhrases == null) return null;

		Set<String> matches = new HashSet<>(myPhrases);
		matches.retainAll(yourPhrases);

		return matches;
	}

	/*
	 * Returns a LinkedHashMap in which the elements of the Map parameter
	 * are sorted according to the value of the Integer, in non-ascending order.
	 */
	protected static LinkedHashMap<String, Integer> sortResults(Map<String, Integer> possibleMatches) {

		// Because this approach modifies the Map as a side effect of printing
		// the results, it is necessary to make a copy of the original Map

		LinkedHashMap<String, Integer> list = new LinkedHashMap<String, Integer>();

		List<Map.Entry<String, Integer>> entries = new ArrayList<Map.Entry<String, Integer>>(possibleMatches.entrySet());

		entries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
		for (Map.Entry<String, Integer> entry : entries) {
			list.put(entry.getKey(), entry.getValue());
		}

		return list;
	}

	/*
	 * This method is here to help you measure the execution time and get the output of the program.
	 * You do not need to consider it for improving the efficiency of the detectPlagiarism method.
	 */
    public static void main(String[] args) {
    	if (args.length == 0) {
    		System.out.println("Please specify the name of the directory containing the corpus.");
    		System.exit(0);
    	}
    	String directory = args[0];
    	long start = System.currentTimeMillis();
    	Map<String, Integer> map = PlagiarismDetector.detectPlagiarism(directory, 4, 5);
    	long end = System.currentTimeMillis();
    	double timeInSeconds = (end - start) / (double)1000;
    	System.out.println("Execution time (wall clock): " + timeInSeconds + " seconds");
    	Set<Map.Entry<String, Integer>> entries = map.entrySet();
    	for (Map.Entry<String, Integer> entry : entries) {
    		System.out.println(entry.getKey() + ": " + entry.getValue());
    	}
    }

}
