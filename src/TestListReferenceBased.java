

public class TestListReferenceBased {

	public static void main(String[] args) {
		ListReferenceBased aList = new ListReferenceBased();
		
		 
		System.out.println("Is the list empty" + aList.isEmpty());
		aList.add(1,13);
		aList.add(2, 14);
		System.out.println("The item as position 2 is: " + aList.get(2));
		System.out.println("The item as position 1 is: " + aList.get(1));
		System.out.println("Size after adds: " + aList.size());

		
		aList.remove(1);
		System.out.println("After removing position 1, size is: " + aList.size());
		System.out.println("The item at position 1 is now: " + aList.get(1));
		displayList(aList);
		
	}
	public static void displayList(ListReferenceBased list) {
	    for (int i = 1; i <= list.size(); i++) {
	        System.out.println(list.get(i));
	    }
	}

}     