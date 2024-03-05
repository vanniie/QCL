package mlhuillier.qcl.Utilities;


import org.jboss.aerogear.security.otp.Totp;

public class TOTPGenerator {

    public static String getTwoFactorCode(){
        Totp totp = new Totp("v5vmyks6zjj4tdjdhfuvtznb4nogdmdm"); // 2FA secret key
        String twoFactorCode = totp.now(); //Generated 2FA code here
        return twoFactorCode;
    }
}
