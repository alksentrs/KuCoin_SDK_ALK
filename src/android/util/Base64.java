package android.util;

/**
 * Created by alksentrs (aleksander medella) on 20/02/18.
 */
public class Base64 {

    public static final int DEFAULT = 0;

    public static String encodeToString(byte [] b, int flags) {
        return java.util.Base64.getEncoder().encodeToString(b);
    }

}
