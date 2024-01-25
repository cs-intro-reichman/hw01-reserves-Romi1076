
public class Coins {
	public static void main(String[] args) {
		int numcents = Integer.parseInt(args[0]);
		int quarters = numcents / 25;
        int remainderCents = numcents % 25;

	System.out.println("  please use " + quarters +  " quarters and " + remainderCents  + " cents " );

	}

}