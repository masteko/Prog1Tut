package Bonusmaterial;

/**
 * Aufgabe1
 */
public class Palindrom {

    public static void main(String[] args) {
        System.out.println(palindromTest("otto".toCharArray()));
        System.out.println(palindromTest("lagerregal".toCharArray()));
        System.out.println(palindromTest("test".toCharArray()));
        System.out.println(palindromTest("tesot".toCharArray()));
    }

    public static boolean palindromTest(char[] feld) {
        
        for (int i = 0; i < feld.length / 2; i++) {
            if (feld[i] != feld[feld.length - 1 -i]) {
                return false;
            }
        }

        return true;
    }
}