import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Task4Hash {
    public static String getHashCode(String inputStr, String algorithm){
        if (inputStr == null || inputStr.isEmpty() || algorithm == null || algorithm.isEmpty()){
            return null;
        }

        algorithm = algorithm.toUpperCase();
        switch(algorithm){
            case "MD5":
                break;
            case "SHA-1":
                break;
            case "SHA-256":
                break;
            default:
                return null;
        }

        MessageDigest md = null;
        byte [] hashCode = null;
        try {
            md = MessageDigest.getInstance(algorithm);
            md.update(inputStr.getBytes());
            hashCode = md.digest();
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }

        if(md == null || hashCode == null) {
            return null;
        }

        BigInteger code = new BigInteger(1, hashCode);
        String hexString = code.toString(16);

        while (hexString.length() < 32){
            hexString = "0" + hexString;
        }
        return hexString;
    }
}

