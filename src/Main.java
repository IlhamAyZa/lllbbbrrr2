import java.util.ArrayList;
import java.util.List;
/* *********** Pledge of Honor ************************************************ *

I hereby certify that I have completed this lab assignment on my own
without any help from anyone else. I understand that the only sources of authorized
information in this lab assignment are (1) the course textbook, (2) the
materials posted at the course website and (3) any study notes handwritten by myself.
I have not used, accessed or received any information from any other unauthorized
source in taking this lab assignment. The effort in the assignment thus belongs
completely to me.
READ AND SIGN BY WRITING YOUR NAME SURNAME AND STUDENT ID
SIGNATURE: <Ilham Aydazada, 0074562>
********************************************************************************/

public class Main {

	public static void main(String[] args) {
		List<String> pairs = new ArrayList<>();
		pairs.add("Ali,cheerful");
		pairs.add("Ayse,cute");
		pairs.add("Richard,wise");
		pairs.add("Jack,vigorous");
		pairs.add("Roz,attractive");
		pairs.add("Andrea,eager");
		pairs.add("Carol,odd");
		pairs.add("Fiona,terrific");
		pairs.add("Gabrielle,sincere");
		pairs.add("Grace,rude");
		pairs.add("Hannah,terrified");
		pairs.add("Heather,shrill");
		pairs.add("Irene,adorable");
		pairs.add("Jan,real");
		pairs.add("Jane,significant");
		pairs.add("Jasmine,devilish");
		pairs.add("Jennifer,aggressive");
		pairs.add("Ece,chilly");
		pairs.add("Vi,strong");
		pairs.add("Victor,intelligent");

		Words words = new Words(pairs);
		System.out.println("Names in initial words :");
		System.out.println(words.getNames());
		System.out.println("Adjectives in initial words :");
		System.out.println(words.getAdjectives());

		System.out.println("-------- Remove the name 'Jack' --------");
		if (words.removeName("Jack").equals("Jack")) {
			System.out.println("Jack is removed");
			System.out.println(words.getNames());
		}

		System.out.println("-------- Remove the name 'Amanita' --------");
		String removeResult = words.removeName("Amanita");
		if (removeResult.equals("Amanita")) {
			System.out.println("Amanita is removed");
			System.out.println(words.getNames());
		} else
			System.out.println(removeResult);

		System.out.println("-------- Remove the adjective 'significant'  --------");
		removeResult = words.removeAdjective("significant");
		if (removeResult.equals("significant")) {
			System.out.println("significant is removed");
			System.out.println(words.getAdjectives());
		} else
			System.out.println(removeResult);

		System.out.println("-------- Make Sentence --------");
		System.out.println(words.generateSentence());

		VowelWords vowels = new VowelWords(pairs);
		System.out.println("\n-------- Get Names Starting With a Vowel --------");
		System.out.println(vowels.getVowNames());
		System.out.println("\n-------- Get Adjectives Starting With a Vowel --------");
		System.out.println(vowels.getVowAdjectives());
		System.out.println("-------- Make Sentence with 2 adjectives --------");
		System.out.println(vowels.generateSentence(2));
		System.out.println("-------- Make Sentence with 5 adjectives --------");
		System.out.println(vowels.generateSentence(5));

		System.out.println("-------- Word Operations Test --------");

		System.out.println("-------- Make Adjectives Plural --------");
		for (int i = 0; i < words.getAdjectives().size() % 5; i++) {
			String adjective = vowels.getAdjectives().get(i);
			System.out.println(adjective + " ---->" + vowels.PluralAdj(adjective));
		}

		System.out.println("-------- Encrypt Adjective --------");
		System.out.println(words.encryptAdj());
		System.out.println("-------- Upper Lower --------");
		System.out.println(vowels.upperLower());
		System.out.println("-------- Roz Exists? --------");
		words.exists("Roz");
		System.out.println("-------- grateful Exists? --------");
		vowels.exists("grateful");
		System.out.println("-------- comp132 Exists? --------");
		words.exists("comp132");

	}

}
