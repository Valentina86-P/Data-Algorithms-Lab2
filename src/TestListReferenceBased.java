

public class TestListReferenceBased {

	public static void main(String[] args) {
		ListReferenceBased aList = new ListReferenceBased();
		
		 
		System.out.println("Is the list empty" + aList.isEmpty());
		aList.add(1, "Ana");
		aList.add(2, "Maria");
		aList.add(3, "Cristina");
		aList.add(4, "Ioana");
		System.out.println("The item as position 2 is: " + aList.get(2));
		System.out.println("The item as position 1 is: " + aList.get(1));
		System.out.println("Size after adds: " + aList.size());

		
		aList.remove(1);
		System.out.println("After removing position 1, size is: " + aList.size());
		System.out.println("The item at position 1 is now: " + aList.get(1));
		aList.displayList();
		aList.listLongest();
		
		System.out.println(aList.listLongest());

		
	}


}     