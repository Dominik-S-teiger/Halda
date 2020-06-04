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
		System.out.println("poèet prvkù v MinHaldì: \t" + h.size());
		System.out.println("Odebrání nejmenšího prvku: \t"+ h.extractMin() + "\n" + h.toString());
		System.out.println("momentální nejmenší prvek: \t"+ h.min());
	}
	
}
