import java.util.Scanner;  // Import the Scanner class

public class reverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your string:");
        String userInput = scanner.nextLine();

        String reversedString = "";

        for (int i = userInput.length() - 1; i >= 0; i--) {
            reversedString += userInput.charAt(i);  
        }

        System.out.println("Here is your reversed string: " + reversedString);

        scanner.close();
    }
}
