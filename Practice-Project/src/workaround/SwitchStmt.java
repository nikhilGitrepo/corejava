package workaround;

public class SwitchStmt {

	public static void main(String a[]) {
		int price = 6;
		switch (price) {
		case 2:
			System.out.println("It is: 2");
			break;
		default:
			System.out.println("It is: default");
//			break;
		case 5:
			System.out.println("It is: 5");
			break;
		case 9:
			System.out.println("It is: 9");
			break;
		}
	}

}
