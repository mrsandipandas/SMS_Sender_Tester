package exception;

public class TestException {
	public static void test() throws Exception {
		//try{
			int x = Integer.parseInt("abc");
			System.out.println(x);
		//}
		//catch(Exception ex){
			throw new MyCustomException("Input error");
		//}
	}
}
