package Bonusmaterial;

/**
 * Isbn
 */
public class Isbn {

    public static void main(String[] args) {
        System.out.println(test("3-528-05912-6".toCharArray()));
    }

    public static boolean test(char[] isbn) {
        int offset = 0;
        int sum = 0;

        for (int i = 0; i < isbn.length; i++) {
            if (isbn[i] == '-') {
                offset++;
            } else {
                sum += isbn[i] * (i + 1 - offset);
            }
        }

        return (sum % 11 == 0);
    }
}