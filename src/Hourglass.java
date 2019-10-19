/* Grading - Sarah Gilliam

10 pts - Correct Output (must compile and run)
3 pts - Proper Use of Static Methods
3 pts - Proper Use of for loops
3 pts - Pseudocode
2 pts - Comments
2 pts - Consistent Layout and Style following Style Guidelines
0/2 pts - Proper Use of at least one Class Constant
0/2 pts Extra Credit 

23/25 total points
Good Job!

*/
//(I wrote my pseudocode on notebook paper)

public class Hourglass {
	public static void top() {
		//this will print the top part
		for (int i = 1; i <= 4; i++) {
			for (int s = 1; s <= i; s++) {
				System.out.print(" ");
			}
			System.out.print("\\");
			for (int j = 10-i*2; j >= 1; j--) {
				System.out.print(":");
			}
			System.out.print("/");
			System.out.println();
		}
	}
	
	public static void bot() {
		//this will print the bottom part, reverse of top()
		for (int i = 4; i >= 1; i--) {
			for (int s = 1; s <= i; s++) {
				System.out.print(" ");
			}
			System.out.print("/");
			for (int j = 10-i*2; j >= 1; j--) {
				System.out.print(":");
			}
			System.out.print("\\");
			System.out.println();
			}
		}
	
	public static void end() {
		//this will print the end parts
		System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
	}
	public static void main(String[] args) {
		end();
		top();
		//prints the middle part
		System.out.println("     ||");
		bot();
		end();
	}
}
