package com.huiselr.encdec;

import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

import javax.crypto.*;
import javax.crypto.spec.DESedeKeySpec;

public class EncrypAES {


    private KeyGenerator keygen;
    private SecretKey deskey;
    private Cipher c;
    private byte[] cipherByte;

    public EncrypAES() throws NoSuchAlgorithmException, NoSuchPaddingException{
        Security.addProvider(new com.sun.crypto.provider.SunJCE());
        keygen = KeyGenerator.getInstance("AES");
        deskey = keygen.generateKey();
        c = Cipher.getInstance("AES");
    }

    public byte[] Encrytor(String str) throws InvalidKeyException,
            IllegalBlockSizeException, BadPaddingException {
        c.init(Cipher.ENCRYPT_MODE, deskey);
        byte[] src = str.getBytes();
        cipherByte = c.doFinal(src);
        return cipherByte;
    }

    public byte[] Decryptor(byte[] buff) throws InvalidKeyException,
            IllegalBlockSizeException, BadPaddingException {
        c.init(Cipher.DECRYPT_MODE, deskey);
        cipherByte = c.doFinal(buff);
        return cipherByte;
    }

    public static void main(String[] args) throws Exception {
        EncrypAES de1 = new EncrypAES();
        String msg ="You are not alone.";
        byte[] encontent = de1.Encrytor(msg);
        byte[] decontent = de1.Decryptor(encontent);
        System.out.println("明文为:" + msg);
        System.out.println("密文为:" + new String(encontent));
        System.out.println("明文为:" + new String(decontent));
    }

}
