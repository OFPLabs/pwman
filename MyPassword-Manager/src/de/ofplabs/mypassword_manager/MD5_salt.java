package de.ofplabs.mypassword_manager;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MD5_salt {

 public static String md5(String input) {
	//salt must change
	 String salt = "Random$SaltValue#WithSpecialCharacters12@$@4&#%^$*";
	 
     String md5 = null;
      
     if(null == input) return null;
      
     try {
          
     
     MessageDigest digest = MessageDigest.getInstance("MD5");
      input = input + salt;
     
     digest.update(input.getBytes(), 0, input.length());

     
     md5 = new BigInteger(1, digest.digest()).toString(16);

     } catch (NoSuchAlgorithmException e) {

         e.printStackTrace();
     }
     
     return md5;
 }
}
