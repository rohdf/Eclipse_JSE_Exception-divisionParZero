package nsis.app;

public class DivisionParZero {

	public static void main(String[] args) {
		int o =5;
		try {
			o=o/1;
		} catch (ArithmeticException ae) {
			System.out.println(ae);
			System.out.println(ae.getMessage());
			ae.printStackTrace();
			System.out.println("Mais on ne peut diviser par 0 mec !!!");
			
		}
		finally {
			System.out.println("Youho je fait quand même cette partie :p");
		}
		
		System.out.println("o="+o);
		System.out.println("Fin prog");

	}

}
