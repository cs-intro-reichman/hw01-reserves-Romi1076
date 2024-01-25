/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		int numcents = Integer.parseInt(args[0]);
		int quarters = numcents / 25;
        int remainderCents = numcents % 25;

	System.out.println("  please use " + quarters +  " quarters and " + remainderCents  + " cents " );

	}

}