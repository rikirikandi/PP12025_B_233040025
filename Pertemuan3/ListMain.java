package Pertemuan3;

public class ListMain {
	
	public static void main(String[] args) {
		StrukturList list = new StrukturList();
		list.addTail(3);
		list.addTail(4);
		list.addTail(5);
		
		System.out.println("Elemen: ");
		list.displayElement();
		
		System.out.println("\n");
		
		StrukturList listA = new StrukturList();
		listA.addTail(3);
		listA.addTail(2);
		listA.addTail(1);
		
		System.out.println("Elemen: ");
		listA.displayElement();
		
		System.out.println("\n");
		
		StrukturList listB = new StrukturList();
		listB.addTail(1);
		listB.addTail(4);
		listB.addTail(5);
		listB.addTail(7);
		
		System.out.println("Elemen: ");
		listB.displayElement();
		
		System.out.println("\n");
		
		StrukturList list2 = new StrukturList();
		list2.addHead(5);
		list2.addHead(4);
		list2.addHead(3);
		
		System.out.println("Elemen: ");
		list2.displayElement();
		
		System.out.println("\n");
		
		StrukturList list3A = new StrukturList();
		
		list3A.addHead(1);
		list3A.addHead(2);
		list3A.addHead(3);
		
		System.out.println("Elemen: ");
		list3A.displayElement();
		
		System.out.println("\n");
		
		StrukturList list3B= new StrukturList();
		
		list3B.addHead(7);
		list3B.addHead(5);
		list3B.addHead(4);
		list3B.addHead(1);
		
		System.out.println("Elemen: ");
		list3B.displayElement();
		
		System.out.println("\n");
		
	}
}
