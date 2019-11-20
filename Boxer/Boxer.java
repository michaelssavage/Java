public class Boxer{

	private String name;
	private String height;
	private String reach;
	private int fights;
	private int wins;
	private int ko;

	public Boxer(String n, String h, String r, int f, int w, int k){

		name = n;
		height = h;
		reach = r;
		fights = f;
		wins = w;
		ko = k;
	}

	public String getName(){

		return name;
	}

	// returns a string of height. Height is of format (cm)
	public String getHeight(){

		return height;
	}

	// Added this function so it is easier to compare.
	public int compareHeight(){

		height = getHeight();

		// Replace the non integers with empty string.
		return Integer.valueOf(height.replaceAll("[^0-9]", ""));
	}

	public String getReach(){

		return reach;
	}

	public int getFights(){

		return fights;
	}

	public int getWins(){

		return wins;
	}

	public int getKo(){

		return ko;
	}

	// Win percentage is given out of 100. '%' is not printed here.
	public int winPercentage(){

		int ratio = getWins() / getFights();
		return ratio * 100;
	}
}
