package datatype;

public class IntArrayTest {

	String str;
	
	public static void main(String[] args) {

		int[] B = new int[5];
		System.out.println(B);
		
		// possible - initialized as null
		int[] A = null;
		
		// possible - Null Pointer Exception - RuntimeException 
//		A[0] = 0; 
		
//		String[] C = new Object();
		
		try {
			System.out.println( Class.forName("java.lang.String") );
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((str == null) ? 0 : str.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IntArrayTest other = (IntArrayTest) obj;
		if (str == null) {
			if (other.str != null)
				return false;
		} else if (!str.equals(other.str))
			return false;
		return true;
	}
	
}
