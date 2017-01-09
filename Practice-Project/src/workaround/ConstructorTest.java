package workaround;

public class ConstructorTest {

	private String variable;
	
	public ConstructorTest() {
//		this();
		super();
	}
	
	public ConstructorTest(String variable) {
//		super();
		this();
		this.variable = variable;
	}




	public static void main(String[] args) {
		
	}
	
}
