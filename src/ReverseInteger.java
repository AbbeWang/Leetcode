
public class ReverseInteger {
	public static int reverse(int x) {
        double ans = 0;
        
		while(x != 0){
			ans = ans * 10 + x % 10;
			x = x / 10;
//			System.out.println(ans);
//			System.out.println(x);
		}
		
		if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE)	return 0;
		
		return (int)ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = reverse(1534236469);
		System.out.println(x);
		int a = Integer.MAX_VALUE;
//		long a = 5;
		System.out.println(Integer.toString(a));
//		System.out.println(a);

	}

}
