package spsejecna.DominikSteiger;

public class Halda {
	int[] pole = null;
	int virtualniVelikost = 0;

	public int getParent(int i) {
		if (i % 2 == 0)
			return (i - 1) / 2;
		return i / 2;
	}

	public int getLeftChild(int i) {
		return 2 * i + 1;
	}

	public int getRightChild(int i) {
		return 2 * i + 2;
	}

	public void insert(int v) {
		if (virtualniVelikost <= 0) {
			virtualniVelikost = 1;
			pole = new int[16];
			pole[virtualniVelikost - 1] = v;
		} else {
			if (virtualniVelikost >= pole.length) {// vyøešit velikost
				int[] pole2 = new int[pole.length * 2];
				for (int i = 0; i < pole.length; i++)
					pole2[i] = pole[i];
				pole = pole2;
			}
			// insert
			pole[virtualniVelikost] = v;
			int soucasnyIndex = virtualniVelikost;
			virtualniVelikost++;// v poli je vic prvku
			while (soucasnyIndex != 0 && pole[soucasnyIndex] < pole[getParent(soucasnyIndex)]) {
				int temp = pole[getParent(soucasnyIndex)];
				pole[getParent(soucasnyIndex)] = pole[soucasnyIndex];
				pole[soucasnyIndex] = temp;
				soucasnyIndex = getParent(soucasnyIndex);
			}
		}
	}

	public void MinPole(int i) {
		int left = getLeftChild(i);
		int right = getRightChild(i);
		int smallest = i;
		if (left < virtualniVelikost && pole[left] < pole[i])
			smallest = left;
		if (right < virtualniVelikost && pole[right] < pole[smallest])
			smallest = right;
		if (smallest != i) {
			swap(i, smallest);
			MinPole(smallest);
		}

	}

	void swap(int a, int b) {
		int temp = pole[a];
		pole[a] = pole[b];
		pole[b] = temp;
	}

	public int extractMin() {
		if (pole.length == 1) {
			virtualniVelikost--;
			return pole[0];
		}

		int help = pole[0];
		pole[0] = pole[virtualniVelikost - 1];
		virtualniVelikost--;
		MinPole(0);
		return help;
	}

	public int size() {
		return virtualniVelikost;
	}

	public int min() {
		return pole[0];
	}

	public String toString() {
		String s = "";
		s += "[";
		for (int i = 0; i < virtualniVelikost; i++)
			s += pole[i] + (i < virtualniVelikost - 1 ? "," : "");
		s += "]";
		return s;
	}
}