import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;

public class Pendu extends Exception {
    private String word = "";
    private String rightWord = "";
    private int coutnFail = 0;
    private String letters = "";

    public Pendu() {
    }

    public void hangMan(String str2) {
        this.word = str2;
        this.letters = str2;
        int len = str2.length();
        char[] letterArr = this.letters.toCharArray();
        char[] str2Arr = str2.toCharArray();
        for (int i = 0; i < letterArr.length; i++) {
            letterArr[i] = '-';
        }
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Welcome to the HangMan game, you have 8 attempts to find the word after that the man dies.(only letters are allowed)");
        System.out.println("The word is " + str2.length() + " letters.");
        System.out.println(String.valueOf(letterArr));
        while (true) {
            // get the character or string entered from the user input //
            System.out.print("Enter a letter: ");
            String str = sc.nextLine();
            char[] strArr = str.toCharArray();
            str = str.toLowerCase();
            try {
                // checks for empty string //
                if (str.length() == 0) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.err.print("Do not enter empty string or you will loose !");
                break;
            }
            if (Character.isLetter(str.charAt(0))) {
                if (str.length() > 1) {
                    System.out.println("Only one letter is allowed at a time");
                    break;
                } else {
                    if (rightWord.length() > str2.length()) {
                        System.out.print("---------\n");
                        System.out.print("|         |\n");
                        System.out.print("|         |\n");
                        System.out.print("|         |\n");
                        System.out.print("|         O\n");
                        System.out.print("|       --|--\n");
                        System.out.print("|         |\n");
                        System.out.print("|        | |\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("---------\n");
                        System.out.println("You failed !");
                        break;
                    }
                }
                if (str2.contains(str)) {
                    rightWord += str;
                    // pute the letter in the right place to see the progress of the word
                    for (int i = 0; i < str2Arr.length; i++) {
                        if (str2Arr[i] == strArr[0]) {
                            letterArr[i] = str2Arr[i];
                        }
                    }
                    System.out.println("\n" + String.valueOf(letterArr) + "\n");
                    if (String.valueOf(letterArr).length() == str2.length()) {
                        str2 = str2.toLowerCase();
                        char[] c2 = str2.toCharArray();
                        String sc2 = new String(c2);
                        String sc3 = new String(letterArr);
                        sc3 = sc3.toLowerCase();
                        if (sc2.equals(sc3) || sc3.equals(sc2)) {
                            // System.out.println(String.valueOf(letterArr));
                            System.out.println("Well done, the word was : " + str2);
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    // for every failed attempt a part of the picture is drawn. //
                    System.out.println("\n" + String.valueOf(letterArr) + "\n");
                    coutnFail++;
                    if (coutnFail == 1)
                        System.out.print("---------\n");
                    if (coutnFail == 2) {
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("---------\n");
                    }
                    if (coutnFail == 3) {
                        System.out.print("---------\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("---------\n");
                    }
                    if (coutnFail == 4) {
                        System.out.print("---------\n");
                        System.out.print("|         |\n");
                        System.out.print("|         |\n");
                        System.out.print("|         |\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("---------\n");
                    }
                    if (coutnFail == 5) {
                        System.out.print("---------\n");
                        System.out.print("|         |\n");
                        System.out.print("|         |\n");
                        System.out.print("|         |\n");
                        System.out.print("|         O\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("---------\n");
                    }
                    if (coutnFail == 6) {
                        System.out.print("---------\n");
                        System.out.print("|         |\n");
                        System.out.print("|         |\n");
                        System.out.print("|         |\n");
                        System.out.print("|         O\n");
                        System.out.print("|         |\n");
                        System.out.print("|         |\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("---------\n");
                    }
                    if (coutnFail == 7) {
                        System.out.print("---------\n");
                        System.out.print("|         |\n");
                        System.out.print("|         |\n");
                        System.out.print("|         |\n");
                        System.out.print("|         O\n");
                        System.out.print("|       --|--\n");
                        System.out.print("|         |\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("---------\n");
                    }
                    if (coutnFail == 8) {
                        System.out.print("---------\n");
                        System.out.print("|         |\n");
                        System.out.print("|         |\n");
                        System.out.print("|         |\n");
                        System.out.print("|         O\n");
                        System.out.print("|       --|--\n");
                        System.out.print("|         |\n");
                        System.out.print("|        | |\n");
                        System.out.print("|\n");
                        System.out.print("|\n");
                        System.out.print("---------\n");
                        System.out.println("You failed !");
                        break;
                    }
                }
            } else {
                System.out.println("You need to enter a letter not a number !");
            }
        }
    }

    public static void main(String[] args) {
        Pendu p = new Pendu();

        p.hangMan("sessions");
    }
}