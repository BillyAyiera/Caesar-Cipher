import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE CAESAR CIPHER");
        while (true) {
            System.out.println("CHOSE e for ENCRYPTION or d FOR decryption");
            Scanner input = new Scanner(System.in);
            String choice = input.nextLine().toLowerCase();
            if (choice.equals("e")) {
                System.out.println("Enter text to be encrypted: ");
                String plainText = input.nextLine().toLowerCase();
                System.out.println("Enter the shift value: ");
                int shiftValue = input.nextInt();
                CaesarCipher message = new CaesarCipher(plainText, shiftValue);
                System.out.println("Plain Text: " + message.getTextMessage() + "\n Shift Value of: " + message.getShiftBy());
                System.out.println("Encrypted Text: " + message.encryption());
                break;
            } else if (choice.equals("d")) {
                System.out.println("Enter text to be decrypted: ");
                String encryptedText = input.nextLine().toLowerCase();
                System.out.println("Enter the shift value: ");
                int reverseShiftValue = input.nextInt();
                CaesarCipher encryptText = new CaesarCipher(encryptedText, reverseShiftValue);
                System.out.println("Decrypted Message: " + encryptText.decryption());
                break;
            } else {
                System.out.println("Invalid choice. Try Again");
            }

        }
    }
}

