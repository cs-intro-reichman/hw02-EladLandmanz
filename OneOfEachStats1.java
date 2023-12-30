/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {

	public static String Most_common_fam ( int fam1, int fam2,int fam3){
		
		int max = fam1;
		String ret_val = "2.";
		if (fam2 > max){
			max = fam2;
			ret_val = "3.";
		}
		if (fam3 > max){
			ret_val = "4 or more.";
		}
		return ret_val;

	}

	public static void main (String[] args) {
		int input_num = Integer.parseInt(args[0]);
		String mostCommonFam;
		int averageKids = 0;
		boolean  girl = false;
		boolean  boy = false;
		int child_counter = 0;
		int all_childern_counter = 0;
		int familys_of_2 = 0;
		int familys_of_3 = 0;
		int familys_of_4_or_more = 0;
		for(int i = 0; i < input_num; i++){
			while (!(boy && girl)){
				if (Math.random() <= 0.5){
					girl = true;
					//System.out.print("g ");
				}else{
					boy = true;
					//System.out.print("b ");
				}
				child_counter++;
			}
			//System.out.println();
				if (child_counter == 2)
					familys_of_2 ++;
				else if (child_counter == 3)
					familys_of_3 ++;
				else
					familys_of_4_or_more ++;
			
			System.out.println(all_childern_counter);
			System.out.println(child_counter);
			all_childern_counter += child_counter;
			child_counter = 0;
			girl = false;
			boy = false;
		}
		mostCommonFam = Most_common_fam(familys_of_2, familys_of_3, familys_of_4_or_more);
		averageKids = (all_childern_counter/input_num);
		System.out.println("Average: " + averageKids + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + familys_of_2 );
		System.out.println("Number of families with 3 children: " + familys_of_3 );
		System.out.println("Number of families with 4 or more children: " + familys_of_4_or_more );
		System.out.println("The most common number of children is " + mostCommonFam );

	}
	
}
