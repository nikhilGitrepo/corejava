package workaround;

public class TestMath {
	
	public static void main(String[] args) {
		int res = 98%10;
//		System.out.println(98*100+reverse(98,2));
		
//		System.out.println( largestPalindrome(1) );
		System.out.println("---------------------");
		System.out.println( largestPalindrome(2) );
		System.out.println("---------------------");
//		System.out.println( largestPalindrome(3) );
        
	}
	
    public static int largestPalindrome(int n) {
        if(n == 1) return 9;
        int m = 1337;
        int mod = (int)Math.pow(10, n);
        int max = (int)Math.pow(10, n)-1;
        long pro = (long)max*(long)max;
        int right = (int)(pro%mod);
        int left = (int)(pro/mod);
        if(left == reverse(right,n)) return (int)(pro%m);
        if(left > pro) {left--;}
        pro = (long)left*(long)mod+(long)reverse(left,n);
        while(left != mod/10){
//        	System.out.println( "Each Test case=>" + pro);
            for(int i = max;i>9;i--){
//            	System.out.println("--"+i);
                if(pro%i == 0 && pro/i < max && pro/i > mod-max) {
                	System.out.println(pro + " : " + i + " : "+ pro/i);
                    return (int)(pro%m);
                }
            }
            left--;
            pro = (long)left*(long)mod+(long)reverse(left,n);
        }
        
        return (int)(pro%m);
    }
	
    private static int reverse(int n, int dig){
        int x = n;
        int res = 0;
        int ten = (int)Math.pow(10,dig-1);
        while(x != 0 ){
//        	System.out.println(x);
            int d = x%10;
            res+=ten*d;
            ten/=10;
            x/=10;
        }
        return res;
    }

}
