/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int input_num = Integer.parseInt(args[0]);
		int divisors_sum = 0;
		String perfect_str = ( input_num + " is a perfect number since " + input_num + " =");
		for (int i = 1; i < input_num; i++){
			if (input_num % i == 0){
				divisors_sum += i;
				perfect_str = (perfect_str + " + " + i);
			}
		}
		if (divisors_sum == input_num){
			//perfect_str = (perfect_str + " = " + input_num);
			System.out.println(perfect_str);	
		}
		else{
			System.out.println(input_num + " is not a perfect number");
		}
		
	}
}
