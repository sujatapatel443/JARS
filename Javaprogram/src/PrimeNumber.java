
public class PrimeNumber {

	public static void main(String[] args) {

		for (int i = 2; i < 100; i++) {
			int chk = 0;
			for (int j = 2; j < i; j++) {
				if ((i % j) == 0) {
					chk++;
					break;
				}
			}

			if (chk == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
