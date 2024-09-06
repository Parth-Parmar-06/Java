package Practical_5.B;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static String convertStr(String s) {
        String ans = "";
        String words[] = s.split("[\\s.]");
        int n = words.length;
        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-i-1; j++) {
                int a = words[j].length();
                int b = words[j+1].length();
                if ((a<b) || (a==b && words[j].compareTo(words[j+1]) > 0)) {
                    String temp = words[j];
                    words[j] = words[j+1];    
                    words[j+1] = temp;
                } 
            } 
        }
        for (int k=0; k<n; k++) {
            ans+=Character.toUpperCase(words[k].charAt(0));
            ans+=words[k].substring(1);
            if (k!=n-1) ans+=" "; else ans+=".";
        } 
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String ans = convertStr(s);
        System.out.println("Answer: "+ans);

        try(FileWriter fw = new FileWriter("Practical_5/B/ans.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {
            out.println(ans);
        } catch (IOException e) {}
    }
}
