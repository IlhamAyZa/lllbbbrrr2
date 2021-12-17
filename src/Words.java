import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Words implements WordOperators{
	List<String> names = new ArrayList<>();
	List<String> adjectives = new ArrayList<>();
	String[] arrStr = new String[2];
	Random rand = new Random();
	String temp;
	
	String[][] enscriptionMatrix = new String[][]
			{{"A", "B", "C", "D", "E"}, {"F", "G", "H", "I", "J"},
		{"K", "L", "M", "N", "O"}, {"P", "Q/Z", "R", "S", "T"}, {"U", "V", "W", "X", "Y"}};

	public Words(List<String> pairList) {
		for (String str : pairList) {
			arrStr = str.split(",");

			addName(arrStr[0]);
			addAdjective(arrStr[0]);
		}
	}

	public void addName(String name) {
		names.add(name);
	}

	void addNames(List<String> pairList) {
		for (String str : pairList) {
			arrStr = str.split(",");

			addName(arrStr[0]);
		}
	}

	public void addAdjective(String adjective) {
		adjectives.add(adjective);
	}

	void addAdjectives(List<String> pairList) {
		for (String str : pairList) {
			arrStr = str.split(",");

			addAdjective(arrStr[1]);
		}
	}

	public String removeName(String name) {
		if (names.contains(name)) {
			names.remove(name);
			return name;
		} else {
			System.out.println("There is no such name in List");
			return null;
		}
	}

	public String removeAdjective(String adjective) {
		if (adjectives.contains(adjective)) {
			adjectives.remove(adjective);
			return adjective;
		} else {
			System.out.println("There is no such adjective in List");
			return null;
		}
	}

	public String generateSentence() {
		return names.get(rand.nextInt(names.size())) +
				" is " + adjectives.get(rand.nextInt(adjectives.size())); 
	}

	public List<String> getNames() {
		return names;
	}

	public List<String> getAdjectives() {
		return adjectives;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public void setAdjectives(List<String> adjectives) {
		this.adjectives = adjectives;
	}

	@Override
	public String encryptAdj() {

		
		
		return ;
	}

	@Override
	public String upperLower() {
		
		return ;
	}

	@Override
	public void exists(String word) {
		
		
	}
}