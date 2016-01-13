import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Two_Sum {
	
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		int n = nums.length;
		for(int i = 0; i < n-1; i++){
			for(int j = i+1; j < n; j++){
				if((nums[i] + nums[j])==target){
					result[0] = i+1;
					result[1] = j+1;
					break;
				}
			}
		}
		
		return result;        
    }
	
	
	public static int[] hashMap(int[] nums, int target) {
		int[] result = new int[2];
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		
		for(int i=0; i<nums.length; i++){
			if(hashmap.containsKey(nums[i])){
				result[0] = hashmap.get(nums[i])+1;
				result[1] = i+1;
				break;
			}
			else
				hashmap.put(target - nums[i], i);
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2, 7, 11, 15};
		int target = 9;
		int[] solution = hashMap(numbers, target);
		System.out.println(solution[0]);
		System.out.println(solution[1]);
		
		
		/* This is how to declare HashMap */
	      HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	      /*Adding elements to HashMap*/
	      hmap.put(12, "Chaitanya");
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(49, "Ajeet");
	      hmap.put(3, "Anuj");
	      hmap.put(5, "Ann");

	      /* Display content using Iterator*/
	      Set set = hmap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }

	      /* Get values based on key*/
	      String var= hmap.get(2);
	      System.out.println("Value at index 2 is: "+var);

	      /* Remove values based on key*/
	      hmap.remove(3);
	      System.out.println("Map key and values after removal:");
	      Set set2 = hmap.entrySet();
	      Iterator iterator2 = set2.iterator();
	      while(iterator2.hasNext()) {
	          Map.Entry mentry2 = (Map.Entry)iterator2.next();
	          System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
	          System.out.println(mentry2.getValue());
	       }
		
	}

}
