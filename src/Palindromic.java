
public class Palindromic {

	public static String longestPalindrome(String s) {
		// run out of time!
		String result = "";
		int N = s.length();
		
		char[] c = s.toCharArray();
		char[] c_reverse = new char[N];
		
		for(int i=0; i<N; i++)	c_reverse[i] = c[N-i-1];
		
		
		int d = 1;
		while(d < 2*N){
			if(d <= N){
				for(int i=0,j=N-d; i<d && j<N; i++,j++){
					if(c[i] == c_reverse[j]){
						String temp = "";
						while(i<d && j<N && c[i] == c_reverse[j]){
							temp += c[i];
							i++;
							j++;
						}
						if(temp.length() > result.length())
							result = temp;
					}
				}
			}else{
				for(int i=d-N,j=0; i<N && j<2*N-d; i++,j++){
					if(c[i] == c_reverse[j]){
						String temp = "";
						while(i<N && j<2*N-d && c[i] == c_reverse[j]){
							temp += c[i];
							i++;
							j++;
						}
						if(temp.length() > result.length())
							result = temp;
					}
				}
			}
			
			d++;
		}
		return result;        
    }
	
	
	//better one
	public static String longestPalindrome1(String s) {
        if(s == "")		return "";
        
        int currentLen = 1;
        int startIdx = 0;
        for(int i=0; i<s.length(); i++){
        	//if the length of Palindromic is even
        	int len = 0;
        	for(int l=i, h=i+1; l>=0 && h<s.length(); l--, h++, len += 2){
        		if(s.charAt(l) != s.charAt(h))	break;
        	}
        	if(len > currentLen){
        		currentLen = len;
        		startIdx = i-len/2+1;
        	}
        	
        	//if the length of Palindromic is odd
        	len = 1;
        	for(int l=i-1, h=i+1; l>=0 && h<s.length(); l--, h++, len+=2){
        		if(s.charAt(l) != s.charAt(h))	break;
        	}
        	if(len > currentLen){
        		currentLen = len;
        		startIdx = i-len/2;
        	}
        }
		
		return s.substring(startIdx, startIdx + currentLen);
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "amorroma";
		String result = longestPalindrome1(s);
		
		System.out.println(result);
//		System.out.println(s.substring(1,3));
	}

}
