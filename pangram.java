public class pangram {
    public static void main(String[] args) {

        String s1 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        s1 = s1.replace(" ", "");

        char[] ch = s1.toCharArray();
        boolean anil = false;

        int[] ar = new int[26];

        for (int i = 0; i < ch.length; i++) {
            int index = ch[i] - 65;
            ar[index]++;
        }
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 0) {
                System.out.println("It's not a pangram");
                anil = true;
            }
        }
        if (anil == false) {
            System.out.println("It's pangram");
        }
    }

}
