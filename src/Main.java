import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		/*
		 * BufferedReader in = new BufferedReader(new FileReader("input.txt"));
		 * String s; s = in.readLine(); String[] arr = s.split(" ");
		 */
		Scanner in = new Scanner(System.in);
		String s;
		s = in.nextLine();
		String[] stringArr = s.split(" ");
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(stringArr[i]);
		}

		int poezdok = (arr[0] - 1) / arr[4] + 1;
		if (poezdok == 1) {
			System.out.println((double) arr[1] / arr[3]);
			in.close();
			return;
		}
		double koef = (((double) arr[3] / arr[2] + 1) / 2 - 1) / 1;
		double s1 = arr[1] / (poezdok + koef);
		double s2 = s1 * koef;
		double t = (arr[1] - s1 - s2) / arr[2] + (s1 + s2) / arr[3];
		System.out.println(t);
		in.close();
	}

}
