class palin {
    String name = "2552";
    String s = "";

    void num() {
        for (int i = name.length() - 1; i >= 0; i--) {
            s = s + name.charAt(i);

        }

        if (s.equals(name)) {
            System.out.println("Given String is a palindrome:: " + s);
        } else {
            System.out.println("Given string is not a palindrome.");
        }
    }
}

public class palindrome {
    public static void main(String[] args) {

        palin p = new palin();

        p.num();
    }

}
