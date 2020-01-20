package Bonusmaterial;

/**
 * Caesar
 */
public class Caesar {

    public static void main(String[] args) {
        // System.out.println();
       System.out.println(String.valueOf(encrypt("ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray(), 3)));
       System.out.println(String.valueOf(encrypt("CAESAR".toCharArray(), 3)));
    }

    public static char[] encrypt(char[] arr, int offset) {
        if (offset < 0) {
            return null;
        } else {
            char[] result = new char[arr.length];
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 'A' || arr[i] > 'Z') {
                    return null;
                }
                else {
                    result[i] = (char)((arr[i] - 'A' + offset) % 26 + 'A');
                }
            }

            return result;
        }
    }
}