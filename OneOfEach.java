
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean  girl = false;
		boolean  boy = false;
		int child_counter = 0;
		while (!(boy && girl)){
			if (Math.random() <= 0.5){
				girl = true;
				System.out.print("g ");
			}else{
				boy = true;
				System.out.print("b ");
			}
			child_counter++;
		}
		System.out.println();

		System.out.print("You made it... and you now have " + child_counter + " children." );
	}
}
