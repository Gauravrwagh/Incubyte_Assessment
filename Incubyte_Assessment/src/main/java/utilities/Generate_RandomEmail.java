package utilities;

import java.util.UUID;

public class Generate_RandomEmail {

	  public static String generateRandomEmail() {
	        String randomString = UUID.randomUUID().toString();
	        return randomString + "@gmail.com";  // Gmail domain
	    }
}
