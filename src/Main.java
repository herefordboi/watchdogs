import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a word to see if ir is a palindrome");
        String Palindrome = scanner.nextLine();
        if(isPalindrome(Palindrome)){
            System.out.println("that is a palindrome");
        }
        else{
            System.out.println("that is not a palindrome");
        }
        scanner.close();
    }
}
    private static boolean isPalindrome(String input){
        int half = (int)Math.floor(input.length() /2D);
        input = input.toUpperCase();
        for(int i = 0; i < half ; ++i) {
            if(input.charAt(i) != input.charAt((input.length() -1) -i)) {
                return false;
            }
        }
        return true;
    }
}
