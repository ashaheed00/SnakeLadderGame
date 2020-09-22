//Current Version UC6

public class SnakeLadder {

	final static short LADDER = 1;
	final static short SNAKE = 2;
	final static short NO_PLAY = 0;
	static short option;
	static int position = 0;
	static short rollDice;

	public static void main(String[] args) {
		
		int count = 0;
		while (position < 100) {
			rollDice = (short) ((Math.random() * 10 % 6) + 1);
			option = (short) (Math.random() * 10 % 3);

			switch (option) {
			case NO_PLAY:
				break;
			case LADDER:
				if(position + rollDice <= 100)
					position += rollDice;
				break;
			case SNAKE:
				position -= rollDice;
				if (position < 0)
					position = 0;
				break;
			}
			count++;
			System.out.println("Position after each roll: " + position);
		}

		System.out.println("Player has reached the final destination.");
		System.out.println("It took " + count + " times of dice rolling to win.");
	}
}
