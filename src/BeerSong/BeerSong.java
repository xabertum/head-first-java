package BeerSong;

/**
 * @author xabertum
 *
 */
public class BeerSong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int beerNum = 99;
		String word = "bottles";
		
		while (beerNum > 0 ) {
			
			if (beerNum == 1) word = "bottle";
			
			System.out.println(beerNum + "" + word + " of beer on the wall");
			System.out.println(beerNum + "" + word + " of beer");
			System.out.println("Take one down");
			System.out.println("Pass it around");
			beerNum = beerNum -1;
			
			
			
		}
		

	}

}
