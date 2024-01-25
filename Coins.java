
public class Coins {
	public static void main(String[] args) {
	    
        int totalnumCents = Integer.parseInt(args[0]);
        int quarters = totalnumCents / 25; 
        int remainderCents = totalnumCents % 25; 

        System.out.println("Use " + quarters + " quarters and " + remainderCents + " cents");
	}
}