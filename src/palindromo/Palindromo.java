package palindromo;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 1;
        String word;

        do {
            boolean isPalindrome = true;
            System.out.println("Digite uma palavra");
            word = sc.next();
            int firstPosition = 0;
            int lastPosition = word.length()-1;
            while(firstPosition < lastPosition){
                if(word.charAt(firstPosition) != word.charAt(lastPosition)) {
                    isPalindrome = false;
                    break;
                }
                firstPosition++;
                lastPosition--;
            }
            if(isPalindrome) {
                System.out.println("A palavra é um palindromo");
            } else {
                System.out.println("A palavra não é um palindromo");
            }

            System.out.println("Deseja testar outra palavra? ");
            sc.nextLine();
            op = sc.nextInt();
        } while(op==1);
    }
}
