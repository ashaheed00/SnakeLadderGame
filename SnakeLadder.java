//Current Version UC7

public class SnakeLadder {
	
	final static short LADDER = 1;
	final static short SNAKE = 2;
	final static short NO_PLAY = 0;
	static short option;
	static int positionA = 0;
	static int positionB = 0;
	static short rollDice;

	public static int play(int position) {

		if (position == 100)
			return position;
		
		rollDice = (short) ((Math.random() * 10 % 6) + 1);
		option = (short) (Math.random() * 10 % 3);

		switch (option) {
		case NO_PLAY:
			break;
		case LADDER:
			if (position + rollDice <= 100)
				position += rollDice;
			play(position);
			break;
		case SNAKE:
			if (position - rollDice > 0)
				position -= rollDice;
			else
				position = 0;
			break;
		}
		return position;
	}

	public static void main(String[] args) {

		while (positionA < 100 && positionB < 100) {
			positionA = play(positionA);
			positionB = play(positionB);
		}
		
		System.out.println("The Winner: Player " + (positionA == 100 ? "A" : "B"));
	}
}