/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int input_num = Integer.parseInt(args[0]);
		for (int i = 0; i < input_num; i++){
			for (int b = 0; b < input_num; b++){
				System.out.print(((i % 2) == 0) ? "* " : " *" ); 
			}
      		System.out.println();
		}

	}
}
