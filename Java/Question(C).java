// C.	 Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabets from a-z)

import java.util.Scanner;

class Main{
    public static boolean isPangram(String input) {
        boolean[] alphabet = new boolean[26];

        for (char c : input.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }

        for (boolean letter : alphabet) {
            if (!letter) {
                return false; 
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("Input is a pangram.");
        } else {
            System.out.println("Input is not a pangram.");
        }
    }
}
