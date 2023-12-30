import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {	
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
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
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		String mostCommonFam;
		double averageKids = 0;
		boolean  girl = false;
		boolean  boy = false;
		int child_counter = 0;
		int all_childern_counter = 0;
		int familys_of_2 = 0;
		int familys_of_3 = 0;
		int familys_of_4_or_more = 0;
		for(int i = 0; i < input_num; i++){
			while (!(boy && girl)){
				if (generator.nextDouble() <= 0.5){
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
			
			//System.out.println(all_childern_counter);
			//System.out.println(child_counter);
			all_childern_counter += child_counter;
			child_counter = 0;
			girl = false;
			boy = false;
		}
		mostCommonFam = Most_common_fam(familys_of_2, familys_of_3, familys_of_4_or_more);
		averageKids = (all_childern_counter/(input_num + 0.0));
		System.out.println("Average: " + averageKids + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + familys_of_2 );
		System.out.println("Number of families with 3 children: " + familys_of_3 );
		System.out.println("Number of families with 4 or more children: " + familys_of_4_or_more );
		System.out.println("The most common number of children is " + mostCommonFam );

	}
}

