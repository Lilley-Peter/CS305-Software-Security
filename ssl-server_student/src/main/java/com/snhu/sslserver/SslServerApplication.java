package com.snhu.sslserver;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}
//FIXME: Add route to enable check sum return of static data example:  String data = "Hello World Check Sum!";

@RestController
class SslServerController{
	
	//check sum
	public static String checkSumVerify (String a) throws NoSuchAlgorithmException{

		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] sha256 =md.digest(a.getBytes(StandardCharsets.UTF_8));
		BigInteger hex = new BigInteger(1, sha256);
		StringBuilder hexString = new StringBuilder(hex.toString(16));
		
		while(hexString.length()< 32) {
			hexString.insert(0, '0');
		}
		
		return hexString.toString();
		
	}
	
	//hash
	@RequestMapping("/hash")
	public String myHash() throws NoSuchAlgorithmException {
		
		String data = "Hello World Check Sum";
		String name = "Peter Lilley";
		
		String checkSum = checkSumVerify(name);
		
		//display
		return "Data: " + data + "</br></br>" + "Name:  " + name + "</br></br>" + "The name of the cipher algorith uses is: SHA-256" + "</br></br>The value of the Check Sum is: " + checkSum;
	}
}