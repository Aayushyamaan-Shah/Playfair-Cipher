import SimpleCiphers.PlayFairCipher;

public class Runner {
    public static void main(String[] args) {
        // To encrypt a given text, use the following methods
        // First set the normal text using setNormalText([STRING])
        // Then set the key using the setKey([STRING]) method
        // Finally call encrypt()

        // To decrypt a given text, use the following methods
        // First set the encrypted text using setEncryptedText([STRING])
        // Then set the key using the setKey([STRING]) method
        // Finally call decrypt()
        PlayFairCipher playFairCipher = new PlayFairCipher();
        playFairCipher.setKey("charusat");
        playFairCipher.setEncryptedText("npemel");
        playFairCipher.decrypt();
        playFairCipher.setNormalText("attack");
        playFairCipher.encrypt();
    }
}
