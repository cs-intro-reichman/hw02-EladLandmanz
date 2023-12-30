/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
			int randmom_num = (int)(Math.random() * 10);	
			System.out.println(randmom_num);

			while (true){
				int new_randmom_num = (int)(Math.random() * 10);
				if (new_randmom_num >= randmom_num){
					System.out.println(new_randmom_num);
					randmom_num = new_randmom_num;
				}
				else{
					break;
				}

			}	




	}
}
