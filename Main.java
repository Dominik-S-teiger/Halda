package spsejecna.DominikSteiger;

public class Main {

	public static void main(String args[]) {
		Halda h = new Halda();
		h.insert(5);
		System.out.println(h);
		h.insert(4);
		System.out.println(h);
		h.insert(3);
		System.out.println(h);
		h.insert(2);
		System.out.println(h);
		h.insert(1);
		System.out.println(h);
		h.insert(0);
		System.out.println(h);
		System.out.println("po�et prvk� v MinHald�: \t" + h.size());
		System.out.println("Odebr�n� nejmen��ho prvku: \t"+ h.extractMin() + "\n" + h.toString());
		System.out.println("moment�ln� nejmen�� prvek: \t"+ h.min());
	}
	
}
