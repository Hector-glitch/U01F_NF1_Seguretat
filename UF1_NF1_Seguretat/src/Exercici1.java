import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Exercici1 {
    public static void main(String[] args) {
        SecretKey sKey = keygenKeyGeneration("DES", 56);
        String encodedKey = Base64.getEncoder().encodeToString(sKey.getEncoded());
        System.out.println("Clau DES 56 bits generada: " + encodedKey);
    }
    public static SecretKey keygenKeyGeneration(String algorisme, int keySize) {
        SecretKey sKey = null;
        try{
            KeyGenerator kgen = KeyGenerator.getInstance(algorisme);
            kgen.init(keySize);
            sKey = kgen.generateKey();
        }
        catch (NoSuchAlgorithmException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return sKey;
    }
}
