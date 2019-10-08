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
