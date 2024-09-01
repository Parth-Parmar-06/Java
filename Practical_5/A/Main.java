package Practical_5.A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Paragraph {
    String s;
    public Paragraph(String s) {
        this.s = s;
    }
    public int getSentences() {
        String sentences[] = s.split("[.!?]");
        return sentences.length;
    }
    public ArrayList<Integer> getWords() {
        ArrayList<Integer> wordCounts = new ArrayList<>();
        for (String sentence : s.split("[.!?]")) {
            int wordCount = sentence.trim().split("\\s+").length;
            if (wordCount > 1 || sentence.trim().length() > 0) {
                wordCounts.add(wordCount); 
            }
        }
        return wordCounts;
    }
    
    public int getChars() {
        return s.length();
    }
    public Map<Character, Integer> getOccurrences() {
        Map<Character, Integer> mpp = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (mpp.containsKey(c)) {
                mpp.put(c, mpp.get(c) + 1);
            } else {
                mpp.put(c, 1);
            }
        }
        return mpp;
    }
    public int searchWord(String target) {
        for (int i=0; i<s.length(); i++) {
            boolean found = true;
            for (int j=i; j<target.length(); j++) {
                if (s.charAt(j) != target.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }
        return -1;
    } 
}

public class Main {
    public static void main(String[] args) {
        String s = "I am Parth! I am Awesome. How are you doing?";
        String target = "Parth";
        
        // Create a Paragraph object
        Paragraph p = new Paragraph(s);
        
        // Display the number of characters
        System.out.println("Number of Chars: " + p.getChars());
        
        // Display the occurrences of each character
        Map<Character, Integer> mpp = p.getOccurrences();
        System.out.println("Occurrences of each character:");
        for (Map.Entry<Character, Integer> entry : mpp.entrySet()) {
            System.out.println("Char [" + entry.getKey() + "] occurs [" + entry.getValue() + "] times.");
        }
        
        // Display the number of sentences
        int numSentences = p.getSentences();
        System.out.println("Number of Sentences: " + numSentences);
        
        // Display the number of words in each sentence
        ArrayList<Integer> wordCounts = p.getWords();
        System.out.println("Number of words in each sentence:");
        for (int i = 0; i < wordCounts.size(); i++) {
            System.out.println("Sentence " + (i + 1) + ": " + wordCounts.get(i) + " words");
        }
        
        // Search for a specific word in the text
        int pos = p.searchWord(target);
        if (pos != -1) {
            System.out.println("Word Found At: " + pos);
        } else {
            System.out.println("Word Not Found!");
        }
    }
}

