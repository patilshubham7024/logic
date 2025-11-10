package logical.gfg;

import static java.lang.System.out;

public class Diamond {
//    *
//   * *
//  * * *
//   * *
//    *

	public static void run() {
		draw(5);
	}

	public static void draw(int input) {
		for (int i = 0; i < input; i++) {
			if (i < input / 2) {
				for (int j = 1; j <= (input / 2) - i; j++) {
					out.print("_");
				}
				for (int j = 0; j <= i - (input % 2) + 1; j++) {
					out.print("*");
				}
			} else {
				for (int j = 1; j <= i - (input / 2); j++) {
					out.print("_");
				}
			}
			out.println();

//				for (int j = 1; j <= (input / 2) - (input % i); j++) {
//					out.print(" ");
//				}
//			for (int j = 1; j <= input % i + 1; j++)
//				out.print("* ");
		}
	}
}
