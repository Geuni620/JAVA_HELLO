import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class Lottery{
	private static final int NUMBER_OF_RANDOM_NUMBERS = 6;
	private static final int MAX_RANDOM_NUMBER = 49;
	
	public static void main(String[] args) {
		SortedSet<Integer> randomNumbers = new TreeSet<Integer>();
		Random random = new Random();
		while (randomNumbers.size() < NUMBER_OF_RANDOM_NUMBERS) {
			Integer randomNumber = new Integer(random.nextInt(MAX_RANDOM_NUMBER) + 1);
			randomNumbers.add(randomNumber);
		}
		System.out.println(randomNumbers);
	}
}
