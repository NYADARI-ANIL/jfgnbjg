import java.util.Arrays;

class Remove {
    public void Remove(char ch[]) {
        int count = 0, j;
        for (int i = 0; i < ch.length; i++) {
            for (j = 0; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    break;
                }
            }
            if (j == i) {
                ch[count++] = ch[i];
            }
        }
        System.out.println(String.valueOf(Arrays.copyOf(ch, count)));
    }
}

public class rmvDuplicate {
    public static void main(String[] args) {

        String s = "Hhappyyy";
        s = s.toLowerCase();
        char ch[] = s.toCharArray();

        Remove r = new Remove();
        r.Remove(ch);
    }
}