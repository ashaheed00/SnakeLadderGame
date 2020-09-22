public class SnakeLadder {
	final static short LADDER = 1;
	final static short SNAKE = 2;
	final static int position = 0;
	static short rollDice;	

	public static void main(String[] args) {
		rollDice = (short) ((Math.random() * 10 % 6) +1);
		System.out.println("Player got after rolling the dice: " + rollDice);
	}
}
