import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelWords extends Words {

	List<String> vowNames = new ArrayList<>();
	List<String> vowAdjectives = new ArrayList<>();
	List<String> vowels = Arrays.asList("A", "E", "I", "O", "U", "Y", "W", "a", "e", "i", "o", "u", "y", "w");

	public VowelWords(List <String> pairList) {
		super(pairList);
	}

	public List<String> getVowNames() {
		return vowNames;
	}

	public List<String> getVowAdjectives() {
		return vowAdjectives;
	}

	public void setVowNames(List<String> vowNames) {
		this.vowNames = vowNames;
	}

	public void setVowAdjectives(List<String> vowAdjectives) {
		this.vowAdjectives = vowAdjectives;
	}
	
	public void addVowNames(List <String> nameList) {
		for (String name : nameList) {
			if(vowels.contains(name.charAt(0))) {
				vowNames.add(name);
			}
		}	
	}
	
	public void addVowAdjectives(List <String> adjectiveList) {
		for (String adjective : adjectiveList) {
			if(vowels.contains(adjective.charAt(0))) {
				vowAdjectives.add(adjective);
			}
		}	
	}
	
	public String removeVowName(String name) {
		if (vowNames.contains(name)) {
			vowNames.remove(name);
			return name;
		} else {
			System.out.println("There is no such name in List");
			return null;
		}
	}
	
	public String removeVowAdjective(String adjective) {
		if (vowAdjectives.contains(adjective)) {
			vowAdjectives.remove(adjective);
			return adjective;
		} else {
			System.out.println("There is no such adjective in List");
			return null;
		}
	}
	
	public String generateSentence(int n) {
		temp = "";
		temp += vowNames.get(rand.nextInt(names.size())) + " is ";
		
		for (int i = 0; i < n ; i++) {
			temp += vowAdjectives.get(i) + ", ";
			if (vowAdjectives.size() - i == 2) {
				temp += "and ";
			}
			if (vowAdjectives.size() - i == 1) {
				temp += ".";
				break;
			}
		}
		
		return temp;
	}
	
	public String pluralAdj(String adjective) {
		if(adjective.charAt(-1) == (char) 'y') {
			adjective = adjective.substring(0, -2) + "ies";
		}
		if(adjective.charAt(-1) == (char) 's' | adjective.substring(-2,-1) == "ch" 
				| adjective.substring(-2,-1) ==  "sh" ) {
			adjective = adjective.substring(0, -2) + "es";
		}
		else {
			adjective += "s";
		}
		return adjective;
	}
	
}
