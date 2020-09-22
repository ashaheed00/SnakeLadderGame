public class SnakeLadder {
	final static short LADDER = 1;
	final static short SNAKE = 2;
	final static short NO_PLAY = 0;
	static short option;
	static int position = 0;
	static short rollDice;

	public static void main(String[] args) {
		rollDice = (short) ((Math.random() * 10 % 6) + 1);
		option = (short) (Math.random() * 10 % 3);

		switch (option) {
		case NO_PLAY:
			System.out.println("No Play...");
			break;
		case LADDER:
			System.out.println("Player moving forward...");
			position += rollDice;
			break;
		case SNAKE:
			System.out.println("Player moving backward...");
			position -= rollDice;
			break;
		}

		System.out.println("New position of the player: " + position);
	}
}
