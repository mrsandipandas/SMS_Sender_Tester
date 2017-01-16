

import java.io.IOException;

import com.pwc.sms.Way2SMSSender;

public class SMSUtils {
	
	private static final String REG_NO = "9433453859";
	private static final String REG_PWD = "6332";
	private static final String PROXY_IP = "10.31.8.30";
	private static final int PROXY_PORT = 8080;
	
	
	public static void sendSMSMessage(String mobileNo, String message){		
		try {
			Way2SMSSender sender = new Way2SMSSender();
			System.out.println("About to send SMS");
			sender.send(REG_NO, REG_PWD, mobileNo , message,PROXY_IP,PROXY_PORT);
			System.out.println("SMS sent Succesfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		SMSUtils.sendSMSMessage("9051269990", "BEST OF LUCK FOR YOUR NEXT OPPORTUNITY");
	}

}
