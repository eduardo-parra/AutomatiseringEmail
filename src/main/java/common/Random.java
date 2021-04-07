package common;

public class Random {
    public static void main(String[] args) {
        String alpabet = "qwertyuiopsdfghjklzxcvbnm1234567890";
        String randomUsername = "";
        int length = 100;
        Random rand = new Random();
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = alpabet.charAt(rand.nextInt(alpabet.length()));
        }
        for (char j : text) {
            randomUsername += j;
            randomUsername.length();

        }
    }
}
