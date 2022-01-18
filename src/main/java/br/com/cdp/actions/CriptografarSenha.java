package br.com.cdp.actions;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;


public class CriptografarSenha {

    public static String criptografaSenha(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        md.reset();
        md.update(password.getBytes("ASCII"));
        return toHexString(md.digest());
    }

    private static String toHexString(byte[] data){
        Formatter formatter = new Formatter();
        for(byte b : data){
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }
}
