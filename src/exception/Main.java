package exception;

public class Main {
	public static void main(String[] args) {
		try {
			TestException.test();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}
}
