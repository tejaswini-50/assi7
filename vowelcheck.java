import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int vowelCount = 0;
        boolean vowelPresent = false;
        
        for (char ch : input.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelPresent = true;
                vowelCount++;
            }
        }
        
        if (vowelPresent) {
            System.out.println("Vowels present.");
            System.out.println("Total number of vowels: " + vowelCount);
        } else {
            System.out.println("No vowels present.");
        }
        
        scanner.close();
    }
}
