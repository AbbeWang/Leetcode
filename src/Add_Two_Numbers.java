
public class Add_Two_Numbers {

	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		result.next = null;
		ListNode temp = result;
		int flag = 0;
		
		while(l1 != null || l2 != null || flag != 0){
			temp.next = new ListNode(0);
			temp = temp.next;
			temp.next = null;
			
			if(l1 != null && l2 != null){
				temp.val = (l1.val + l2.val + flag)%10;
				flag = (l1.val + l2.val + flag)/10;
				
				l1 = l1.next;
				l2 = l2.next;
			}
			
			else{
				if(l1 != null){
					temp.val = (l1.val + flag)%10;
					flag = (l1.val + flag)/10;
					l1 = l1.next;
				}
				else if(l2 != null){
					temp.val = (l2.val + flag)%10;
					flag = (l2.val + flag)/10;
					l2 = l2.next;
				}
				else{
					temp.val = flag;
					flag = 0;
				}
			}
		}
		
		
		return result.next;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		l1.next.next.next = null;
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		l2.next.next.next = null;

		ListNode l3 = new ListNode(5);
		l3.next = null;

		
		ListNode result = addTwoNumbers(l3, l3);
		
//		System.out.println(result);
		System.out.println(result.val);
		System.out.println(result.next.val);
//		System.out.println(result.next.next.val);
		
		
	}

}
