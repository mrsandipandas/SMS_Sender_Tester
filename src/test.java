import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class test {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(addToDate(d,Calendar.DATE,365));
	}
	
	public static String generateApplicationNumber(int lastSeq){
		int val = (int)'A' + lastSeq/999999999 ;
		char c = (char)val;
		return c + " " + String.format("%010d", lastSeq%1000000000);
	}
	
	public static String ordinalSuffix ( int value )
	{
		value = Math.abs( value );
		int lastDigit = value % 10;
		int last2Digits = value % 100;
		switch ( lastDigit )
		{
			case 1 :
			return last2Digits == 11 ? "th" : "st";
		
			case 2:
			return last2Digits == 12 ? "th" : "nd";
		
			case 3:
			return last2Digits == 13 ? "th" : "rd";
		
			default:
			return "th";
			}
		}
	
	public static Date addToDate(Date date, int field, int amount) {
		System.out.println("Input Date..."+date.toString());
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(field, amount);
		System.out.println("Output Date..."+c.getTime());
		return c.getTime();
	}
}