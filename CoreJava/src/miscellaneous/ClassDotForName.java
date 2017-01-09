package miscellaneous;

public class ClassDotForName {

	public static void main(String[] args) {
		try {
			
			Class myclass = Class.forName("ClassDotForName");
			ClassDotForName obj = (ClassDotForName) myclass.newInstance();
			
		} catch (ClassNotFoundException |
					InstantiationException | 
						IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}
	
}
