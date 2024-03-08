
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    // Method to add a translation to the dictionary
    public void add(String word, String translation) {
        // If the word does not exist in the dictionary, create a new ArrayList for it
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        // Add the translation to the ArrayList associated with the word
        this.dictionary.get(word).add(translation);
    }

    // Method to retrieve translations for a given word
    public ArrayList<String> translate(String word) {
        // Get the ArrayList of translations for the word
        ArrayList<String> translations = this.dictionary.get(word);
        // If no translations found, return an empty ArrayList
        if (translations == null) {
            return new ArrayList<>();
        } else {
            return translations;
        }
    }

    // Method to remove a word and its translations from the dictionary
    public void remove(String word) {
        this.dictionary.remove(word);
    }
}
