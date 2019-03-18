import java.util.Scanner;
import java.util.Arrays;
public class Pendu extends Exception {
    private String word = "";
    private String rightWord = "";
    private int coutnFail = 0;
    private String letters = "";

    public Pendu() {
    }
    public void checkFail(String str2) {
        this.word = str2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the HangMan game, you have 8 attempts to find the word (You can one shot the word ifyou want but only letter no number are allowed) or the man will die.");
        System.out.println("The word is " + str2.length() + " letters.");
        while (true) {

            System.out.print("Enter a letter :");
            String str = sc.nextLine();
            str = str.toLowerCase();
            System.out.println("You chose : " + str);
            try {
                if (str.length()==0) {
                 throw new Exception();
                }
            } catch (Exception e) {
                System.err.print("Do not enter empty string or you will loose !");
                break;
            }
            if (Character.isLetter(str.charAt(0))) {
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
                    System.out.println("He's dead well done !");
                    break;
                }
                if (str2.contains(str)) {
                    rightWord += str;
                    System.out.println(rightWord);
                    if (rightWord.length() != str2.length() ) {
                        continue;
                    } else {
                        rightWord=rightWord.toLowerCase();
                        str2=str2.toLowerCase();
                        char[] c1 = rightWord.toCharArray();
                        char[] c2 = str2.toCharArray();
                        Arrays.sort(c1);
                        Arrays.sort(c2);
                        String sc1 = new String(c1);
                        String sc2 = new String(c2);
                        if (sc1.equals(sc2) || sc2.equals(sc1)) {
                            System.out.println("He lives !");
                            System.out.println("The word was : " + str2);
                            break;
                        }
                    }
                } else {
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
                            System.out.println("He's dead well done !");
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
        p.checkFail(args[0]);
    }
}