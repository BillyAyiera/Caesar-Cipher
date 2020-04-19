public class caesar {
    private String textMessage;
    private int shiftBy;

    public caesar(String textMessage, int shiftBy) {
        this.textMessage = textMessage;
        this.shiftBy = shiftBy;
    }

    public String getTextMessage() {
        return this.textMessage;
    }

    public int getShiftBy() {
        return this.shiftBy;
    }

    public String encryption() {
        StringBuilder sb = new StringBuilder();
        for (char character : textMessage.toCharArray()) {
            if (character != ' ') {
                int asciiPosition = character - 'a';
                int newPosition = (asciiPosition + shiftBy) % 26;
                char newCharacter = (char) ('a' + newPosition);
                sb.append(newCharacter);
            } else {
                sb.append(character);
            }
        }
        return sb.toString();
    }

    public String decryption() {
        int reverseShift = 26 - (shiftBy % 26);
        StringBuilder sb = new StringBuilder();
        for (char character : textMessage.toCharArray()) {
            if (character != ' ') {
                int asciiPosition = character - 'a';
                int newPosition = (asciiPosition + reverseShift) % 26;
                char newCharacter = (char) ('a' + newPosition);
                sb.append(newCharacter);
            } else {
                sb.append(character);
            }
        }
        return sb.toString();
    }
}
