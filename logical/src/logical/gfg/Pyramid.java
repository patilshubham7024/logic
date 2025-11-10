package logical.gfg;

public class Pyramid {
//	     *
//	    * *
//	   * * *
//	  * * * *
//	 * * * * *

	public static void run() {
		draw(15);
	}

	public static void draw(int input) {

		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= input; j++) {
				if(j <= input - i) {
					System.out.print(" ");
				} else if (j <= input) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
