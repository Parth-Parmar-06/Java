package Practical_5.A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
        int i=0;
        for (String sentence : s.split("[.!?]")) {
            if (i==0) wordCounts.add(sentence.split(" ").length);
            else wordCounts.add(sentence.split(" ").length-1);
            i++;
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
    public void searchWord(String target) {
        if (s.contains(target)) {
            System.out.println("Word Found At: " + s.indexOf(target));
        } else {
            System.out.println("Word Not Found!");
        }
    } 
}

public class Main {
    public static void main(String[] args) {
        String s = "I am Parth! I am Awesome. How are you doing?";
        Paragraph p = new Paragraph(s);

        System.out.println("Number of Sentences: " + p.getSentences());
        System.out.println("Number of Chars: " + p.getChars());
        System.out.println("Occurrences of each character: " + p.getOccurrences());
        System.out.println("Number of words in each sentence: " + p.getWords());

        System.out.print("Enter the word to search for: ");
        Scanner sc = new Scanner(System.in);
        String target = sc.next();
        sc.close();
        p.searchWord(target);        
    }
}

// for (Map.Entry<Character, Integer> entry : mpp.entrySet()) {
//     System.out.println("Char [" + entry.getKey() + "] occurs [" + entry.getValue() + "] times.");
// }
// for (int i = 0; i < wordCounts.size(); i++) {
//     System.out.println("Sentence " + (i + 1) + ": " + wordCounts.get(i) + " words");
// }

