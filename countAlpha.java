class Alphabet {
    static void count(String s) {
        int vowels = 0, consonant = 0, specialChar = 0;

        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonant++;
            } else {
                specialChar++;
            }
        }
        System.out.println("Vowels:: " + vowels);
        System.out.println("Consonants:: " + consonant);
        System.out.println("Special Character:: " + specialChar);
    }
}

public class countAlpha {
    public static void main(String[] args) {

        String s = "Happy to see you";
        Alphabet.count(s);
    }
}
