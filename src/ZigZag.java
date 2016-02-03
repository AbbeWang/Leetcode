
public class ZigZag {
	public static String convert(String s, int numRows) {
		char[] result = new char[s.length()];
        if(s == "")		return "";
        
        int k = 0;
        for(int row = 0; row < numRows; row++){
        	int i = row;
        	
        	while(i < s.length()){
        		
        		if(row != numRows-1){
        			result[k++] = s.charAt(i);
        			i += 2*numRows - 2*row - 2;
        		}
        		
        		if(i >= s.length())	break;
        		
        		if(i < s.length() && row != 0){
        			result[k++] = s.charAt(i);
        			i += 2*row;
        		}
        			
         	}
        }
		return new String(result);
    }

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = convert("PAYPALISHIRING", 4);
		System.out.println(s);
	}

}
