import java.util.HashMap;

public class Substring {

	public static int lengthOfLongestSubstring(String s) {
		int l = 0;
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		int low = 0, high = 0;
		
		for(; high < s.length(); high++){
			if(hmap.containsKey(s.charAt(high))){
				if(hmap.get(s.charAt(high)) >= low){
					int temp = hmap.get(s.charAt(high));
					if(high-low > l)	l = high-low;
					low = temp + 1;
				}
			}
			hmap.put(s.charAt(high), high);
		}
		
		if(high-low > l)	l = high-low;		
		
		return l;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "c";
		System.out.println(lengthOfLongestSubstring(x));
		
		
	}

}
