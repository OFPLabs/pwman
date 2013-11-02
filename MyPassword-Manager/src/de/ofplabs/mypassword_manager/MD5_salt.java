package de.ofplabs.mypassword_manager;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MD5_salt {
 public static void main(String[] args) {
	 String password = "mypassword";
	 String salt = "Random$SaltValue#WithSpecialCharacters12@$@4&#%^$*";
//salt must change
	 String hash = md5(password + salt);
	 
}
 public static String md5(String input) {
     
     String md5 = null;
      
     if(null == input) return null;
      
     try {
          
     
     MessageDigest digest = MessageDigest.getInstance("MD5");
      
     
     digest.update(input.getBytes(), 0, input.length());

     
     md5 = new BigInteger(1, digest.digest()).toString(16);

     } catch (NoSuchAlgorithmException e) {

         e.printStackTrace();
     }
     return md5;
 }
}
