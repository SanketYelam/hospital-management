package org.dnyanyog.utility;

import java.util.Random;

public class UserIdGenerator {
	 public static String generateUserId() {
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        StringBuilder userIdBuilder = new StringBuilder();
	        Random random = new Random();
	        for (int i = 0; i < 8; i++) {
	            char randomChar = characters.charAt(random.nextInt(characters.length()));
	            userIdBuilder.append(randomChar);
	        }
	        return userIdBuilder.toString();
	    }
}
