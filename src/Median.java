
public class Median {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int i = 0, j = 0, k = 0, temp;
		int[] m = new int[2];
		for(;k < nums1.length + nums2.length; k++){
			if(i >= nums1.length)	temp = nums2[j++];
			else if(j >= nums2.length)	temp = nums1[i++];
			else if(nums1[i] <= nums2[j])	temp = nums1[i++];
			else	temp = nums2[j++];
			
			if(k == (nums1.length + nums2.length)/2 - 1)	m[0] = temp;
			if(k == (nums1.length + nums2.length)/2)	{m[1] = temp; break;}
		}
		
		if((nums1.length + nums2.length)%2 == 0)	return ((m[0]+m[1])/(double)2);
		else return m[1];

    }
	
	
	// This is a better way
	public double findMedianSortedArrays1(int[] A, int[] B) {
        int m = A.length, n = B.length;
        int l = (m + n + 1) / 2;
        int r = (m + n + 2) / 2;
        return (getkth(A, 0, B, 0, l) + getkth(A, 0, B, 0, r)) / 2.0;
    }
	
	public double getkth(int[] A, int aStart, int[] B, int bStart, int k) {
	    if (aStart > A.length - 1) return B[bStart + k - 1];            
	    if (bStart > B.length - 1) return A[aStart + k - 1];                
	    if (k == 1) return Math.min(A[aStart], B[bStart]);

	    int aMid = Integer.MAX_VALUE, bMid = Integer.MAX_VALUE;
	    if (aStart + k/2 - 1 < A.length) aMid = A[aStart + k/2 - 1]; 
	    if (bStart + k/2 - 1 < B.length) bMid = B[bStart + k/2 - 1];        

	    if (aMid < bMid) 
	        return getkth(A, aStart + k/2, B, bStart,       k - k/2);// Check: aRight + bLeft 
	    else 
	        return getkth(A, aStart,       B, bStart + k/2, k - k/2);// Check: bRight + aLeft
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {};
		int[] nums2 = {};
		
		double m = findMedianSortedArrays(nums1, nums2);
		System.out.println(m);
	}

}
