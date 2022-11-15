class Unique {
    public boolean Unique(char ch[]) {

        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

public class UniqueChar {
    public static void main(String[] args) {

        String s = "abcdef";

        s = s.toLowerCase();
        char ch[] = s.toCharArray();

        Unique u = new Unique();
        System.out.println(u.Unique(ch));

    }

}
