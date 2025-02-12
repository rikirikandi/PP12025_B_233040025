package Pertemuan2;

public class NodeMain {
	public static void main (String[] args) {
		
		// Membuat 2 buah node n1 & n2
		Node n1 = new Node (5);
		Node n2 = new Node (7);
		Node n3 = new Node (8);
		Node n4 = new Node (9);
		Node n5 = new Node (2);
		Node n6 = new Node (3);
		
		// Membuat relasi Node n1 & n2
		n1.setnext(n2);
		n2.setnext(n3);
		n3.setnext(n4);
		
		// Menampilkan Node n1 & n2 dengan Pointer p
		Node p = n1;
		while(p != null)
		{
			System.out.printf("%d ", p.getnilai());
			p = p.getnext();
		}
	}
}